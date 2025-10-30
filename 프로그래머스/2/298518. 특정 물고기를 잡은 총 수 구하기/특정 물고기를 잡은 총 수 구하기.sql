select count(*) AS FISH_COUNT
from FISH_INFO info
join FISH_NAME_INFO name on name.fish_type = info.fish_type
where name.fish_name = 'BASS' OR name.fish_name = 'SNAPPER';