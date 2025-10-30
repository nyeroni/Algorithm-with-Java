select YEAR(e.DIFFERENTIATION_DATE) as YEAR, (m.max_size - e.SIZE_OF_COLONY)as YEAR_DEV, e.id
from ECOLI_DATA e
join (
    select MAX(SIZE_OF_COLONY) as max_size, YEAR(DIFFERENTIATION_DATE) as YEAR
    from ECOLI_DATA
    group by YEAR(DIFFERENTIATION_DATE)
) m on YEAR(e.DIFFERENTIATION_DATE) = m.YEAR
order by YEAR asc, YEAR_DEV asc;