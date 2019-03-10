select S.SNAME from SPJ
	join S on SPJ.ID_S = S.ID_S
    join P on SPJ.ID_P = P.ID_P
 where P.COLOR = "Red" and (S.CITY = "Paris" or P.CITY = "Paris")