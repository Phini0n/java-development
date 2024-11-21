USE northwind;

-- Question 1
INSERT INTO suppliers (supplierID, CompanyName)
VALUES (30, "The Company");
SELECT *
FROM suppliers;

-- Question 2
INSERT INTO products (productID, productName, supplierID)
VALUES (99, "Juicy Pickles", 30);
SELECT *
FROM products;

-- Question 3
SELECT p.ProductID, p.ProductName, p.UnitPrice, s.CompanyName
FROM products p
INNER JOIN suppliers s ON p.SupplierID = s.SupplierID;

-- Question 4
UPDATE products
SET UnitPrice = UnitPrice + (UnitPrice * 15.0 / 100)
WHERE ProductID = 99;

-- Question 5
SELECT p.ProductID, p.ProductName, p.UnitPrice, s.CompanyName
FROM products p
INNER JOIN suppliers s ON p.SupplierID = s.SupplierID
WHERE s.CompanyName = "The Company";

-- Question 6
DELETE FROM products
WHERE products.ProductID = 99;
SELECT *
FROM products;

-- Question 7
DELETE FROM suppliers
WHERE suppliers.SupplierID = 30;
SELECT *
FROM suppliers;

-- Question 8
SELECT *
FROM products;

-- Question 9
SELECT *
FROM suppliers;