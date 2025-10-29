SELECT animal_id, name, 
CASE
WHEN SEX_UPON_INTAKE like 'Neutered%' OR SEX_UPON_INTAKE like 'Spayed%' THEN 'O'
ELSE 'X'
END
as '중성화'
from animal_ins
order by animal_id;