select ID_P from SPJ 
	join S on SPJ.ID_S = S.ID_S
	join J on SPJ.ID_J = J.ID_J
where S.CITY = "London" and J.CITY = "London"