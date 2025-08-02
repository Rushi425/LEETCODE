# Write your MySQL query statement below
-- SELECT MAX(salary) AS SecondHighestSalary
-- FROM Employee
-- WHERE salary < (SELECT MAX(salary) FROM Employee);


select 
    IFNULL(
        (select max(salary) 
        from Employee
        where salary < (select max(salary) from Employee)
        ),
        NULL
    )
    as SecondHighestSalary