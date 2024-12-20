USE northwind;
-- Exercise 2
-- Question 1
SELECT COUNT(DISTINCT(CompanyName)) AS CompanyCount
FROM  suppliers;

-- Question 2
SELECT SUM(salary) AS AllEmployeeSalaries
FROM Employees;

-- Question 3
SELECT ProductID, ProductName, UnitPrice
FROM products
WHERE UnitPrice = (SELECT MIN(UnitPrice) FROM products);

-- Question 4
SELECT AVG(UnitPrice)
FROM products;

-- Question 5
SELECT MAX(UnitPrice)
FROM products;

-- Question 6
SELECT SupplierID, COUNT(*) AS ItemsSupplied
FROM  products
GROUP BY SupplierID;

-- Question 7
SELECT CategoryID, AVG(UnitPrice) As AveragePrice
FROM products
GROUP BY CategoryID;

-- Question 8
SELECT SupplierID, COUNT(*) As ItemsSupplied
FROM products
GROUP BY SupplierID
HAVING ItemsSupplied >= 5;

-- Question 9
SELECT ProductID, ProductName, (UnitPrice * UnitsInStock) AS InventoryValue
FROM Products
ORDER BY InventoryValue DESC, ProductName ASC;