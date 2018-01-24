/*
Enter your query here.
*/
SELECT ROUND(SUM(t1.TIV_2012), 2)
FROM Insurance t1
INNER JOIN
(
SELECT TIV_2011
    FROM Insurance
    GROUP BY TIV_2011
    HAVING COUNT(*) > 1
)t2
ON t1.TIV_2011 = t2.TIV_2011
INNER JOIN
(
    SELECT lat, lon
    FROM Insurance
    GROUP BY lat,lon
    HAVING COUNT(*) = 1
    )t3
    ON t1.lat = t3.lat AND
    t1.lon = t3.lon
