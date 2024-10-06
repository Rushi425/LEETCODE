# Write your MySQL query statement below
-- Code 1:
select coalesce(
    (select max(salary) from employee 
        where salary < (select max(salary) from employee)), null) as SecondHighestSalary;

