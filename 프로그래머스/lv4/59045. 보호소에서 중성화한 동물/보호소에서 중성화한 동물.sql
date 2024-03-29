SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME
FROM ANIMAL_INS I JOIN ANIMAL_OUTS O USING(ANIMAL_ID)
WHERE I.SEX_UPON_INTAKE LIKE '%Intact%' AND O.SEX_UPON_OUTCOME NOT LIKE '%Intact%'
ORDER BY ANIMAL_ID;

# SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME
# FROM ANIMAL_INS AS I JOIN ANIMAL_OUTS AS O
# USING (ANIMAL_ID)
# WHERE I.SEX_UPON_INTAKE != O.SEX_UPON_OUTCOME
# ORDER BY O.ANIMAL_ID;