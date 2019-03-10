select S.ID_S,P.ID_P,J.ID_J from J,S,P
	where S.CITY <> P.CITY or P.CITY <> J.CITY
    order by S.ID_S asc