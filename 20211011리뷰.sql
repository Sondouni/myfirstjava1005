CREATE TABLE t_student (
	pk INT PRIMARY KEY,
	nm VARCHAR(5) NOT NULL,
	ph VARCHAR(13),
	addr VARCHAR(40),
	rdt DATETIME DEFAULT NOW()  
);

DROP TABLE t_student2;

SELECT NOW();

INSERT INTO t_student
(pk,nm,ph)
VALUES
(1,'가','010-0000-0000');

SELECT *FROM t_student;

-- SQL Languege RDB표준어 
-- CRUD, DML
/*
	C:Create 	- insert
	R:Read 		- select 
	U:Update		- update  --must be with where
	D:DowmDate	- delete
*/	 

 INSERT INTO t_student
 (nm, ph, addr)
 VALUES
 ('가','010-0000-0000','상인동');
 
 INSERT INTO t_student
 (nm,ph,addr)
 values
 ('가','010-0000-0001','경산');
 
 INSERT INTO t_student
 (nm,ph,addr)
 VALUES
 ('나','010-0000-0001','대명동'),
 ('다','010-0000-0002','범어동'),
 ('라','010-0000-0003','산격동');
 
 SELECT*FROM t_student;
 SELECT nm FROM t_student;
 SELECT nm,ph FROM t_student;
 SELECT nm,ph,addr FROM t_student;
 
 SELECT nm,ph,addr FROM t_student
 WHERE nm = '가' OR addr = '산격동';
 
 SELECT nm,ph,addr FROM t_student
 WHERE nm = '가' and addr = '상인동';
 
 UPDATE t_student
 SET addr = '매호동',
 		nm = '가',
 WHERE nm = '다';
 
 DELETE FROM t_student ;
 DROP TABLE t_student;
 