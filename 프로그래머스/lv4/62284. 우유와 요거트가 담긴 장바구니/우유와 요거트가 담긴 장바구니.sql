-- 코드를 입력하세요
SELECT DISTINCT A.CART_ID 
FROM CART_PRODUCTS A INNER JOIN CART_PRODUCTS B
USING (CART_ID)
WHERE A.NAME = 'MILK' and B.NAME = 'Yogurt' 
ORDER BY A.CART_ID;