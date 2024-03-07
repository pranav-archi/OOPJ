CREATE DATABASE flower_shop;
USE flower_shop;
CREATE TABLE flowers(
flower_name VARCHAR(50);
quantity DECIMAL(2,0);
price DOUBLE(5,1);
)
INSERT INTO flowers
VALUES(daisy,65,4.5);
SELECT * FROM flowers;
