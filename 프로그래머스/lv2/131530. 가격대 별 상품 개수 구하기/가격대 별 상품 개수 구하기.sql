SELECT TRUNCATE(PRICE,-4) AS PRICE_GROUP, COUNT(PRODUCT_ID) AS PRICE_GROUP
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE;