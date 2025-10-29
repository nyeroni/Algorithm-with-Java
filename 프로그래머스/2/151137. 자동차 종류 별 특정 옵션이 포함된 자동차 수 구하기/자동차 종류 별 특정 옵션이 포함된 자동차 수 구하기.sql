SELECT car_type, count(*) as CARS
from CAR_RENTAL_COMPANY_CAR
where OPTIONS like('%통풍시트%') OR OPTIONS like('%열선시트%') OR OPTIONS like('%가죽시트%')
group by car_type
order by car_type;