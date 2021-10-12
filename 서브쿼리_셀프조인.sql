/* subquery
	서브웨이 존맛탱
	서브쿼리는 괄호를 감싸서 사용
	단일행 또는 복수행 비교 연산자와 함께 사용가능
	서브쿼리에서는 order by를 사용못한다
	
	 select from where having orderBy insert values절 등 쌉 가능!
*/
SELECT *
FROM t_student2
WHERE addr = '부산';

-- 스칼라값 (컬럼1개, 레코드1개)
SELECT addr FROM t_student2
WHERE sno = 6;	 

SELECT *
FROM t_student2
WHERE addr = (SELECT addr FROM t_student2 WHERE sno = 6);

-- sno가 6,7번값인 사람을 다 뽑아와 (레코드(열) 2개값)

SELECT *
FROM t_student2
WHERE addr IN (SELECT addr FROM t_student2 WHERE sno IN (6,7));

-- self join으로 해결

SELECT *
FROM t_student2 A
inner JOIN t_student2 B
ON A.addr = B.addr
ORDER BY (A.sno);
