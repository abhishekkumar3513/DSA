-- Write your PostgreSQL query statement below
Select  r.contest_id ,
ROUND(COUNT(r.user_id)*100.0/(Select count(user_id) from Users),2) as percentage
from Register r
GROUP by r.contest_id
ORDER BY percentage DESC,r.contest_id;