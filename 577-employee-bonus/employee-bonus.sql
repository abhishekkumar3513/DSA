-- Write your PostgreSQL query statement below
select name,bonus from Employee e LEFT JOIN Bonus b
ON e.empId=b.empId 
WHERE b.bonus<1000 OR b.bonus IS NULL;