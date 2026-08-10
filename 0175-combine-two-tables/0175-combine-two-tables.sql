# Write your MySQL query statement below
Select Person.firstname, Person.lastname, Address.city, Address.state from Person LEFT JOIN Address on Person.personId=Address.personId;