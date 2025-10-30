SELECT board_id, writer_id, title, price, 
case STATUS
when 'DONE' then '거래완료'
when 'SALE' then '판매중'
when 'RESERVED' then '예약중'
end AS STATUS
from USED_GOODS_BOARD
where DATE_FORMAT(created_date, '%Y-%m-%d') = '2022-10-05'
order by board_id desc;