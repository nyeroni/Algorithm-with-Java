SELECT b.BOOK_ID, a.AUTHOR_NAME, DATE_FORMAT(b.PUBLISHED_DATE, '%Y-%m-%d')
FROM BOOK b
JOIN AUTHOR a ON a.author_id = b.author_id
WHERE b.category = '경제'
order by b.PUBLISHED_DATE;