# Write your MySQL query statement below

SELECT name as Employee FROM Employee e
WHERE Salary > (Select salary From Employee m WHERE m.id = e.managerId);