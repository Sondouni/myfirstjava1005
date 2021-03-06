CREATE TABLE t_product(
	pid INT UNSIGNED AUTO_INCREMENT,
	pnm VARCHAR(15) NOT NULL,	
	cnm VARCHAR(15) NOT NULL,
	price INT(10) NOT NULL,
	pop VARCHAR(15) NOT NULL,                       -- place of product, made in ?
	ict VARCHAR(100) DEFAULT 'unknown',
	PRIMARY KEY(pid)
);	

DROP TABLE t_product;
	
SELECT * FROM t_product;

INSERT INTO t_product
(pnm,cnm,price,pop,ict)
VALUES
('청소기','dyson',150,'deutsch','deutsch,spain,england,france'),
('냉장고','samsung',1150,'korea','deutsch,korea,japan,usa'),
('아이폰','apple',1000,'usa','korea,usa,japan'),
('김치냉장고','LG',550,'korea','korea'),
('노트북','asus',900,'taiwan','taiwan,japan,korea,usa,france'),
('마카롱','paris-baguette',10,'france','italy,deutshc,spain,england,france'),
('피라미드','kairo',3000,'egypt','usa,japan,deutsch,england'),
('갤럭시S123','samsung',1250,'korea','usa,korea,japan,taiwan'),
('소변기','dyson',350,'deutsch','deutsch,spain,england,france'),
('맥북','apple',150,'usa','deutsch,spain,england,france,usa,korea,japan,taiwan'),
('김치','LG',50,'korea','korea,japan,taiwan');

