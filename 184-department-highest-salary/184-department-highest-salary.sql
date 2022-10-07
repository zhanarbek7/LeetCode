# Write your MySQL query statement below

select dep.name as Department, emp1.name as Employee, emp1.salary as Salary from employee as emp1
inner join department as dep
on emp1.departmentId = dep.Id
where emp1.salary = (select max(salary) from employee as emp2 where departmentid = emp1.departmentid);