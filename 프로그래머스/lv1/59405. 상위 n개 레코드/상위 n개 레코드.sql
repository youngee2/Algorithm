-- mysql은 limit 을 사용하고 oracle은 where rownum 을 사용한다
SELECT name FROM animal_ins order by datetime asc limit 1