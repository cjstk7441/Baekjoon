SELECT B.BOOK_ID, A.AUTHOR_NAME, DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM AUTHOR AS A JOIN BOOK AS B
USING (AUTHOR_ID)
WHERE B.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE;

