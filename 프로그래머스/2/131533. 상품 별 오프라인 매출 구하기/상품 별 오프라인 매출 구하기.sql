select p.product_code as PRODUCT_CODE, sum(p.price * o.sales_amount) as SALES
from product p 
join OFFLINE_SALE o on p.product_id = o.product_id
group by p.product_code
order by SALES DESC, PRODUCT_CODE asc;