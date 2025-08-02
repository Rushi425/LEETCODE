# Write your MySQL query statement below
select em.name as Employee
from Employee em
join Employee mn on em.managerId = mn.id
where em.salary > mn.salary



-- select EM.name as Employee 
-- from Employee EM, Employee MN
-- where EM.managerId = MN.id and EM.salary > MN.salary;