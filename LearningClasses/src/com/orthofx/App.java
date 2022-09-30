package com.orthofx;

import java.util.*;

public class App {

	private static Map<String, Club> clubTable = new HashMap<>();
	private static Map<Integer, Players> playerTable = new HashMap<>();
	static Club c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ch;
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("Menu");
			System.out.println("1.Add Club");
			System.out.println("2.Add Player");
			System.out.println("3.Update Player Details");
			System.out.println("4.All Player Details");
			System.out.println("5.Search Player Details");
			System.out.println("6.Delete Player");
			System.out.println("7.Exit");
			System.out.println("Enter Choice: ");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				createClub();
				break;
			case 2:
				createPlayer();
				break;
			case 3:
				updatePlayer();
				break;
			case 4:
				playerDetails();
				break;
			case 5:
				searchPlayers();
				break;
			case 6:
				deletePlayer();
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Enter valid choice!");
			}
		}
	}

	private static void createClub() {
		String cname;
		System.out.println("Enter Club name:");
		Scanner s = new Scanner(System.in);
		cname = s.next();
		Club club = new Club(cname);
		clubTable.put(cname,club);
	}

	private static void createPlayer() {
		Scanner s = new Scanner(System.in);
		String pname,cname;
		int jno;
		System.out.println("Enter Player details:");
		System.out.print("Name: ");
		pname = s.nextLine();
		System.out.println("Jersey No:");
		jno = s.nextInt();
		System.out.println("Club: ");
		cname = s.next();
		if (clubTable.containsKey(cname)) {
			c = clubTable.get(cname);
		} else{
			System.out.println("No such club exists. Add club first");
			return;
		}
		Players player = new Players(playerTable.size() + 1, jno,pname,c);
		playerTable.put(playerTable.size() + 1, player);
	}

	private static void playerDetails() {
		if (playerTable.size() > 0) {
			System.out.println("Players are: ");
			playerTable.forEach((k, v) -> {
				System.out.println();
				System.out.println(k + "  " + v.getJno() +" "+v.getName()+" "+ v.getClubName());
			});
		} else {
			System.out.println("No players are entered");
		}
	}

	private static void searchPlayers() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter player id");
		int id = s.nextInt();
		Players player = playerTable.get(id);
		System.out.println("Player Details:");
		System.out.println("Name: " + player.getName());
		System.out.println("Jersey No: " + player.getJno());
		System.out.println("Club: " + player.getClubName());
		System.out.println();
	}

	private static void deletePlayer() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter id of player you want to delete: ");
		int id = s.nextInt();
		Players player = playerTable.get(id);
		playerTable.remove(id);
		player = null;

	}

	private static void updatePlayer() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter id of the player to update: ");
		int id = s.nextInt();
		Players player = playerTable.get(id);
		System.out.println("Enter new jersey number: ");
		player.jno = s.nextInt();
		System.out.println("Enter new club: ");
		String cname = s.next();
		if (clubTable.containsKey(cname)) {
			c = clubTable.get(cname);
		} else{
			System.out.println("No such club exists. Add club first");
			return;
		}
		playerTable.remove(player);
		Players pl = new Players(playerTable.size() + 1, player.jno,player.name,c);
		playerTable.put(id, pl);
	}
}
