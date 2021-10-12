SELECT concat(price,'유로') FROM t_product;

-- 아까 t_product에 not null확인

DROP TABLE e_company;
DROP TABLE e_product;	
DROP TABLE e_country;	
DROP TABLE e_pd_cnt;		
	
CREATE TABLE e_company(
	cid INT UNSIGNED AUTO_INCREMENT PRIMARY key,
	cnm VARCHAR(15) NOT NULL,
	ctid INT UNSIGNED,
	FOREIGN KEY(ctid) REFERENCES e_country(ctid)
);

CREATE TABLE e_product(
	pid INT UNSIGNED AUTO_INCREMENT PRIMARY key,
	cid INT UNSIGNED,
	pnm VARCHAR(15) NOT NULL,
	FOREIGN KEY(cid) REFERENCES e_company(cid)
);

CREATE TABLE e_country(
	ctid INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	ctnm VARCHAR(15) NOT NULL
);

CREATE TABLE e_pd_cnt(
	inm INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	pid INT UNSIGNED,
	ctid INT UNSIGNED,
	FOREIGN KEY(pid) REFERENCES e_product(pid),
	FOREIGN KEY(ctid) REFERENCES e_country(ctid)
);	

INSERT INTO e_company
( cnm,ctid )
VALUES
( 'dyson',1 ),( 'samsung',5 ),( 'apple',7 ),( 'LG',5 ),( 'asus',8 ),( 'prias-baguette',4 ),( 'kairo',10 );

INSERT INTO e_product
( cid,pnm )
VALUES
( 1,'청소기' ),( 2,'냉장고' ),( 3,'아이폰' ),( 4,'김치냉장고' ),( 5,'노트북' ),( 6,'마카롱' ),( 7,'피라미드' ),( 2,'갤럭시123' ),( 1,'소변기' ),( 3,'맥북' ),( 4,'김치' );

INSERT INTO e_country
( ctnm )
VALUES
( 'deutsch' ),( 'spain' ),( 'england' ),( 'france' ),( 'korea' ),( 'japan' ),( 'usa' ),( 'taiwan' ),( 'italy' ),( 'egypt' );

INSERT INTO e_pd_cnt
( pid, ctid )
VALUES
(1,1),(1,2),(1,3),(1,4),(2,5),(2,1),(2,6),(2,7),(3,5),(3,6),(3,7),(4,5),(5,8),(5,6),
(5,5),(5,7),(5,4),(6,1),(6,9),(6,2),(6,3),(6,4),(7,7),(7,6),(7,1),(7,3),(8,5),(8,7),(8,6),(8,8),
(9,1),(9,2),(9,3),(9,4),(10,1),(10,2),(10,3),(10,4),(10,5),(10,6),(10,7),(10,8),
(11,5),(11,6),(11,8);

SELECT * FROM e_country;

SELECT * FROM e_product;

SELECT P.pnm,C.ctnm,EV.inm FROM e_pd_cnt EV
INNER JOIN e_country C
ON EV.ctid = C.ctid
INNER JOIN e_product P
ON EV.pid = P.pid
ORDER BY EV.inm;

SELECT P.pnm, LISTAGG(ctnm,',') FROM e_pd_cnt EV
INNER JOIN e_country C
ON EV.ctid = C.ctid
INNER JOIN e_product P
ON EV.pid = P.pid
ORDER BY EV.inm;

SELECT COUNTRY_ID, LISTAGG(CITY,',') WITHIN GROUP (ORDER BY CITY) AS 도시목록
FROM HR.LOCATIONS

SELECT P.pid,P.pnm,C.cnm,CT.ctnm FROM e_company C
INNER JOIN e_country CT
ON C.ctid = CT.ctid
INNER JOIN e_product P
ON P.cid = C.cid
ORDER BY P.pid;


INNER JOIN 
SELECT A.*,B.pnm,
FROM e_company A
INNER JOIN e_product B
ON A.cid = B.cid
ORDER BY A.cid;
	