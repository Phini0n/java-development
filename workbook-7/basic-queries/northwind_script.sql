-- Exercise 1

-- Question 1.
SELECT * FROM Customers;

-- Question 2.
SELECT City FROM Customers;

-- Question 3.
SELECT DISTINCT Country FROM Customers;

-- Exercise 2

-- Question 1.
USE northwind;
SELECT *
FROM products;

-- Question 2.
USE northwind;
SELECT ProductID, ProductName, UnitPrice
FROM products;

-- Question 3
USE northwind;
SELECT ProductID, ProductName, UnitPrice
FROM products
ORDER BY UnitPrice asc;

-- Question 4
USE northwind;
SELECT ProductID, ProductName, UnitPrice
FROM products 
WHERE UnitPrice <= 7.50
ORDER BY  UnitPrice ASC;

-- Question 5
USE northwind;
SELECT ProductID, ProductName, UnitPrice, UnitsInStock
FROM products 
WHERE UnitsInStock >= 100
ORDER BY  UnitPrice DESC;

-- Question 6
USE northwind;
SELECT ProductID, ProductName, UnitPrice, UnitsInStock
FROM products 
WHERE UnitsInStock >= 100
ORDER BY  UnitPrice DESC, ProductName ASC;

-- Question 7
USE northwind;
SELECT ProductID, ProductName, UnitPrice, UnitsInStock, UnitsOnOrder
FROM products 
WHERE (UnitsInStock <= 0) AND UnitsOnOrder > 0
ORDER BY  ProductName ASC;

-- Question 8
USE northwind;
SELECT *
FROM categories;

-- Question 9
USE northwind;
SELECT *
FROM categories;
-- The ID is 8.

-- Question 10
USE northwind;
SELECT *
FROM products 
WHERE categoryID = 8
ORDER BY  ProductID ASC;

-- Question 11
USE northwind;
SELECT EmployeeID, FirstName, LastName, HireDate
FROM employees;

-- Question 12
USE northwind;
SELECT *
FROM employees
WHERE Title LIKE '%manager';

-- Question 13
USE northwind;
SELECT DISTINCT Title
FROM Employees;

-- Question 14
USE northwind;

-- Question 15
USE northwind;
SELECT EmployeeID, FirstName, LastName, Salary
FROM employees
WHERE salary BETWEEN 2000 AND 25000;

-- Question 16
USE northwind;
SELECT *
FROM products
WHERE SupplierID = '4';