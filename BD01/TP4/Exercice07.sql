select SPJ2.ID_P, SPJ.ID_P, SPJ.ID_S 
	from SPJ,SPJ as SPJ2
    where SPJ2.ID_S = SPJ.ID_S
    and SPJ2.ID_P < SPJ.ID_P 