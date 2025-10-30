select count(*) as FISH_COUNT, MONTH(TIME) as MONTH
from fish_info
group by MONTH(TIME)
order by MONTH; 