select SPJ.ID_S,S.CITY, SPJ.ID_P, P.CITY,SPJ.ID_J,J.CITY from SPJ
	join S on SPJ.ID_S = S.ID_S
    join P on SPJ.ID_P = P.ID_P
    join J on SPJ.ID_J = J.ID_J 
 where P.CITY = J.CITY and S.CITY = J.CITY