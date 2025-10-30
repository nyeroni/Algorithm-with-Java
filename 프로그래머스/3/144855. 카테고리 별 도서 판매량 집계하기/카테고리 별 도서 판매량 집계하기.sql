SELECT b.category, sum(s.SALES) as total_sales
from Book b
join BOOK_SALES s on b.BOOK_ID = s.BOOK_ID
where s.SALES_DATE like '2022-01%'
group by b.category
order by b.category asc;