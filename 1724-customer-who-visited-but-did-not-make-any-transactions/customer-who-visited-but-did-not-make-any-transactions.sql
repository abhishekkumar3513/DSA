-- Write your PostgreSQL query statement below
Select customer_id ,count(*) AS count_no_trans from Visits v LEFT JOIN Transactions t
ON v.visit_id=t.visit_id where transaction_id IS NULL GROUP BY customer_id;