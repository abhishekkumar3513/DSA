-- Write your PostgreSQL query statement below
Select p.product_id,
COALESCE(ROUND(SUM(p.price * u.units)::numeric/SUM(u.units),2),0) as average_price
from Prices p LEFT join UnitsSold u
ON p.product_id=u.product_id
AND u.purchase_date BETWEEN p.start_date and p.end_date
Group by p.product_id;