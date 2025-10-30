select g.TOTAL_SCORE AS SCORE, e.emp_no, e.emp_name, e.position, e.email
from HR_EMPLOYEES e
join (
    select sum(SCORE) AS TOTAL_SCORE, emp_no
    from HR_GRADE
    where YEAR = 2022
    group by emp_no
) g 
on e.emp_no = g.emp_no
where g.TOTAL_SCORE = (
    select MAX(SUM_SCORE)
    from (
        select sum(SCORE) AS SUM_SCORE
        from HR_GRADE
        where YEAR = 2022
        group by emp_no
    ) t
);
