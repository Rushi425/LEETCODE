# Write your MySQL query statement below
/* Write your T-SQL query statement below */
# Write your MySQL query statement below
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;