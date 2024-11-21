USE northwind;
-- 1. 
SELECT ProductID, ProductName, UnitPrice
FROM products 
WHERE UnitPrice = (SELECT MAX(UnitPrice)
					FROM products);
-- 2
SELECT OrderID, ShipName, ShipAddress, ShipVia
FROM orders
WHERE ShipVia = (SELECT ShipperID FROM shippers WHERE CompanyName = 'Federal Shipping');

-- 3 
SELECT OrderID, ProductID
FROM `order details`
WHERE ProductID = (SELECT ProductID FROM products WHERE ProductName = 'Sasquatch Ale');

-- 4
SELECT EmployeeID, FirstName, LastName
FROM employees
WHERE EmployeeID = (SELECT EmployeeID FROM orders WHERE orderID = '10266');

-- 5
SELECT CustomerID, ContactName
FROM customers
WHERE CustomerID = (SELECT CustomerID FROM orders WHERE orderID = '10266');