-- 코드를 입력하세요
-- SELECT animal_id, name from animal_outs 
-- outer join
-- SELECT animal_id, name from animal_ins 
-- where INTAKE_CONDITION is null order by animal_id 

-- SELECT b.animal_id, b.name
-- FROM animal_outs a, animal_ins b
-- WHERE  a.animal_id=b.animal_id 
-- order by animal_id

-- select o.name, o.animal_id 
-- from animal_outs o
-- inner join animal_ins i on i.animal_id = o.animal_id

select animal_id,name
FROM animal_outs
minus
select  animal_id,name
from animal_ins 
order by animal_id