select
p.id as "Patient ID",
concat(p.first_name,' ',p.last_name) as "Patient Name",
u.email as "Patient Email",
t.doctor_user_id as "Doctor ID",
concat(du.first_name,' ',du.last_name) as "Doctor Name",
du.email as "Doctor Email",
dp.practice_id as "Practice ID",
dpi.practice_name as "Practice Name",
dso.id as "DSO ID",
dso.name as "DSO Name",
concat(ab.street1,',',ab.street2,',',ab.state,',',ab.zipcode) as "Patient Address",
concat(ad.street1,',',ad.street2,',',ad.state,',',ad.zipcode) as "Doctor Address"
from patients p
inner join users u
on p.user_id = u.id
inner join address_book ab
on p.user_id = ab.user_id and ab.type = 'PRIMARY'
left outer join treatments t
on p.id = t.patient_id
left outer join users du
on t.doctor_user_id = du.id
left outer join address_book ad
on t.doctor_user_id = ad.user_id
left outer join doctor_profiles dp
on t.doctor_user_id = dp.doctor_user_id
left outer join doctor_practice_informations dpi
on t.doctor_practice_information_id = dpi.id
left outer join dso
on dpi.dso_id = dso.id;
