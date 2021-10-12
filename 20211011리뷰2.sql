/* ~~2021.10.12 review~~ 
        종속되지않고 단독으로 쓰이는 column은 alias(as)생략가능하나, 그냥 쓰자
		  		  
		  JOIN 중요!
		  
		  INDEX ~ where절로 다 가져오면 필요없으나, 부분부분 검색해서 가져오는 경우가 많다
		  index가 없다면 그 column만 조사하는게 아닌 모든 테이블의 데이터를 보기때문에
		  index를 만들어 성능을 향상시켜주는것이 좋다
		
		FORM	
		  CREATE INDEX ((인덱스 테이블명))
		  ON 테이블명(Column); 
		  
		  
		  ORDER BY {ASC} 오름차순
		  ORDER BY DESC  내림차순
		  
		  ifnull ~> count문이랑 같이 잘쓴다 ((count가 null이 있으면 세지를 않아서))
*/		