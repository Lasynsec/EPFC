select distinct SNAME from S where ID_S in (select distinct ID_S from SPJ where ID_P = "P3")