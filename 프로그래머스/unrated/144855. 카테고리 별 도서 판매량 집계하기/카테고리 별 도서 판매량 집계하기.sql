SELECT CATEGORY, SUM(SALES) AS TOTALSALES --출력해야 할 내용들 / SUM(SALES)는 문제에서 카테고리별 도서 판매량 합산
FROM BOOK A, BOOK_SALES B -- 어느 테이블에서 정보를 사용할건지
WHERE A.BOOK_ID=B.BOOK_ID 
AND TO_CHAR(SALES_DATE,'MM')= '01' --문제 조건에서 1월이라는 조건을 걸었으니, 해당하는 날짜만.
GROUP BY CATEGORY -- 카테고리별 도서 총 판매량을 구하는 거라 그룹 바이로 카테고리를 지정하여서 카테고리별로 계산될 수 있도록 
-- 문제에서 결과는 카테고리명을 기준으로 오름차순 정렬하라고 하였다. 오름차순:ASC, 내림차순 DESC, 지정 X: 오름차순
ORDER BY CATEGORY;