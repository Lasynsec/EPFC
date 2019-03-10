select distinct SPJ.ID_P from SPJ, S,P 
	where SPJ.ID_P = P.ID_P 
	and SPJ.ID_S = S.ID_S 
    and S.CITY = 'Athens' and P.CITY = 'London'