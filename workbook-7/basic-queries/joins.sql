USE northwind;

-- Q1.
SELECT products.ProductID, products.ProductName, products.UnitPrice, categories.CategoryName
FROM products
JOIN categories ON products.CategoryID = categories.CategoryID
ORDER BY CategoryName, ProductName;

-- Q2. 
SELECT products.ProductID, products.ProductName, products.UnitPrice, Suppliers.CompanyName
FROM products
JOIN suppliers ON products.SupplierID = Suppliers.SupplierID
ORDER BY ProductName;

-- Q3
SELECT products.ProductID, products.ProductName, products.UnitPrice, categories.CategoryName, suppliers.CompanyName
FROM products
JOIN categories ON products.categoryID = categories.CategoryID
JOIN suppliers ON products.SupplierID = suppliers.SupplierID
ORDER BY ProductName;

-- Q4.
SELECT products.ProductID, products.ProductName, products.UnitPrice, categories.CategoryName
FROM products
JOIN categories ON products.CategoryID = categories.CategoryID
WHERE products.UnitPrice = (
SELECT distinct Max(products.UnitPrice)
FROM products
)
ORDER BY CategoryName, ProductName;

-- Q5.
SELECT orders.OrderID, orders.ShipName, orders.ShipAddress, orders.ShipCountry, shippers.CompanyName
FROM orders
JOIN shippers ON orders.ShipVia = shippers.shipperID
WHERE orders.ShipCountry = "Germany";

-- Q6.
-- Do it later.