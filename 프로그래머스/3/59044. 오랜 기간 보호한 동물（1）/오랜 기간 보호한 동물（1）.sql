SELECT ins.NAME, ins.DATETIME
from ANIMAL_INS ins
left join ANIMAL_OUTS outs on ins.ANIMAL_ID = outs.ANIMAL_ID
where outs.animal_id IS NULL
order by ins.DATETIME
limit 3;