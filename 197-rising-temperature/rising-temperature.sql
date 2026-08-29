-- Write your PostgreSQL query statement below
select today.id from Weather AS today 
JOIN weather AS Yesterday ON
today.recordDate=Yesterday.recordDate + 1
where today.temperature>yesterday.temperature;

