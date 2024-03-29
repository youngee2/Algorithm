SELECT A.REST_ID, A.REST_NAME, A.FOOD_TYPE, A.FAVORITES, A.ADDRESS, ROUND(AVG(B.REVIEW_SCORE),2) AS SCORE
FROM REST_INFO A
JOIN REST_REVIEW B ON A.REST_ID = B.REST_ID
WHERE A.ADDRESS LIKE '서울%'
-- 집계함수(ex. AVG)를 사용한 경우 GROUP BY 구문 작성해야함. 
-- SELECT에 작성한 열들을 그룹화 기준으로 지정하여, 같은 값을 가지는 행들이 하나의 그룹으로 묶이도록 함.
GROUP BY A.REST_ID, A.REST_NAME, A.FOOD_TYPE, A.FAVORITES, A.ADDRESS
ORDER BY SCORE DESC, A.FAVORITES DESC;
