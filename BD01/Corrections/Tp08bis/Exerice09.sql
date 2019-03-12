select AVGQTY,inter.ID_S from (select round(avg(QTY),0) as AVGQTY,SPJ.ID_S from SPJ group by SPJ.ID_S having sum(QTY) > 800) inter
	join S on S.ID_S = inter.ID_S
	where S.CITY ="London"