/*
LIKE ? 데이터값에 다른건 몰라도 '~' ~가 포함되어있으면 가져온다
*/

CREATE TABLE t_student2(
	sno INT unsigned AUTO_INCREMENT ,
	nm VARCHAR(5) NOT NULL,
	age INT NOT NULL,
	addr VARCHAR(20),
	PRIMARY KEY(sno)	
);

INSERT INTO t_student2
(nm,age,addr)
VALUES
('홍길동',20,'서울'),
('신사임당',22,'대구'),
('강감찬',24,'부산'),
('유관순',26,'대전'),
('동찬',28,'경기도')
;


SELECT * FROM t_student2
WHERE nm LIKE '신사임%';    -- 신사임으로 시작하는 이름은 신사임당이든 심사임당다라라라당당 당당당당당 이든 가져온다

SELECT * FROM t_student2 
WHERE nm LIKE '사임%';		  -- 사임으로 시작하는 이름은 뭐든 가져온다

SELECT * FROM t_student2
WHERE nm LIKE '홍%';			--  홍으로 시작되는 이름은 다 가져온다

SELECT * FROM t_student2
WHERE nm LIKE '%사임%';     --  중간에 사임이 들어가면 가져온다

SELECT * FROM t_student2
WHERE nm LIKE '__찬';  		--  자리수 까지 신경쓸때는 _ 로 칸을  따진다. 


