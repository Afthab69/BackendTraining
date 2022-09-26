package com.orthofx;

import java.util.*;

public class RepeatingSequence {

//	static String substringEval(String str) {
//		int k = 0,i=0;
//		StringBuilder stack = new StringBuilder(); 
//		String val = "";
//		while(i<str.length()) {
//			char ch = str.charAt(i);
//			i=i+1;
//			if(Character.isLetter(ch)) {
//				val = val+ ch;
//			}
//			else if(Character.isDigit(ch)) {
//				k = k*10+Integer.valueOf(Integer.parseInt(""+ch));
//			}
//			else if(ch==']') {
//				break;
//			}
//			else if(ch=='[') {
//				for(int j=i;j<str.length();++j) {
//					char c = str.charAt(j);
//					if(c==']') {
//						break;
//					}
//					stack.append(String.valueOf(""+c));
//				}
//				
//				String sub = substringEval(stack.toString());
//				while(k>1) {
//					val=val+sub;
//					k--;
//				}
//			}
//			
//		
//		}
//		return val;
//	}
	
	static String substringEval(String str)
    {
        Stack<Integer> intstack = new Stack<>();
        Stack<Character> strstack = new Stack<>();
        String temp = "", result = "";

        for (int i=0; i<str.length();i++)
        {
            int count = 0;
            if(Character.isDigit(str.charAt(i)))
            {
                while (Character.isDigit(str.charAt(i)))
                {
                    count = count*10 + str.charAt(i)-'0';
                    i++;
                }
      
                i--;
                intstack.push(count);
            }
            else if(str.charAt(i) == ']')
            {
                temp = "";
                count = 0;
                if (!intstack.isEmpty())
                {
                    count = intstack.peek();
                    intstack.pop();
                }
      
                while(!strstack.isEmpty() && strstack.peek()!='[' )
                {
                    temp = strstack.peek() + temp;
                    strstack.pop();
                }
      
                if (!strstack.empty() && strstack.peek() == '[')
                    strstack.pop();
                for (int j=0;j<count; j++)
                    result = result + temp;   
                for (int j = 0; j < result.length(); j++)
                    strstack.push(result.charAt(j));
      
                result = "";
            }
            else if (str.charAt(i) == '[')
            {
                if (Character.isDigit(str.charAt(i-1)))
                    strstack.push(str.charAt(i));
                else
                {
                    strstack.push(str.charAt(i));
                    intstack.push(1);
                }
            }
            else
                strstack.push(str.charAt(i));
        }
        while(!strstack.isEmpty())
        {
            result = strstack.peek() + result;
            strstack.pop();
        }
      
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,exp="";

		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		str = s.nextLine();
		
		exp = substringEval(str);
		System.out.println(exp);
	}
}
