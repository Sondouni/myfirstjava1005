/* UNION
	union으로 다른테이블들을 합쳐보자
	각 셀렉된 컬럼의 갯수와 타입이 같아야함
	union vs union all : 중복여부, all은 중복까지 다 합쳐줌
*/	
CREATE TABLE t_student (
	pk INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, 
	nm VARCHAR(5) NOT NULL,
	ph CHAR(13) NULL,
	addr VARCHAR(40),
	gender CHAR(1) NOT NULL DEFAULT('남') CHECK(gender IN ('남', '여')),
	rdt DATETIME DEFAULT NOW()	
);
INSERT INTO t_student
(nm, ph, gender)sondounit_student
VALUES
('가', '010-2222-3333', '여');


SELECT nm,addr FROM t_student
UNION all
SELECT nm,addr FROM t_student2;

-- 중복제거 distinct, column으로 이용하는게 좋음, 전체는 모든게 똑같아야지 중복처리로 없어짐
SELECT DISTINCT * FROM t_student2;
SELECT DISTINCT addr FROM t_student2;


-- insert + select문 

-- 값입력 insert 기본
INSERT INTO t_student2
(nm, age, addr)
VALUES
('','','');
-- insert_select
INSERT INTO t_student2
(nm,age,addr)
SELECT '김구',32,'원주';

SELECT * FROM t_student2;

INSERT INTO t_student2
(nm,age,addr)
SELECT '이순신',34,addr
FROM t_student2
WHERE sno = 5;




