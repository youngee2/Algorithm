SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, 
CASE WHEN STATUS='SALE' THEN '판매중' 
/*STATUS 값이 sale일 경우 판매중으로 리턴*/
WHEN STATUS='RESERVED' THEN '예약중'
/*STATUS 값이 reserved일 경우 예약중으로 리턴*/
WHEN STATUS='DONE' THEN '거래완료'
/*STATUS 값이 done일 경우 거래완료로 리턴*/
END AS STATUS 
FROM USED_GOODS_BOARD
WHERE TO_CHAR(CREATED_DATE,'YYYY/MM/DD')='2022/10/05'
/*문제에서 2022년 10월 5일에 등록된 중고거래 게시물에 한해서라고 조건을 걸었으니, TO_CHAR로 date타입을  string 타입으로 변환하여 비교. */
ORDER BY BOARD_ID DESC;