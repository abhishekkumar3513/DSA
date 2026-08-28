-- Write your PostgreSQL query statement below
Select product_name,year,price from Sales s LEFT JOIN Product p ON s.product_id=p.product_id ;