SELECT member_id, member_name, gender, DATE_FORMAT(date_of_birth, '%Y-%m-%d')
from MEMBER_PROFILE
where GENDER = 'W' AND MONTH(date_of_birth) = 3 AND TLNO IS NOT NULL
order by member_id;