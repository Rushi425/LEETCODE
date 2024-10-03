# Write your MySQL query statement below
delete P1 
from Person P1, Person P2
WHERE P1.email = P2.email  and p1.Id > p2.Id
 