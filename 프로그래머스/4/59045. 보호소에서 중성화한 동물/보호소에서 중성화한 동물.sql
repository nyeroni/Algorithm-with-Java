SELECT ins.ANIMAL_ID, ins.ANIMAL_TYPE, ins.NAME 
FROM ANIMAL_INS ins
JOIN ANIMAL_OUTS outs ON ins.ANIMAL_ID = outs.ANIMAL_ID
WHERE NOT (ins.SEX_UPON_INTAKE like '%Spayed%' OR ins.SEX_UPON_INTAKE like '%Neutered%') AND (outs.SEX_UPON_OUTCOME like '%Spayed%' OR outs.SEX_UPON_OUTCOME like '%Neutered%') 
ORDER BY ins.ANIMAL_ID;