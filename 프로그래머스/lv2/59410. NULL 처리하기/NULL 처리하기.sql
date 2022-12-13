-- oracle에서는 공백 치환을 NVL()로 한다.
-- ex) NVL(field, '치환할 문자')
SELECT animal_type,NVL(name,'No name'),sex_upon_intake from animal_ins order by animal_id