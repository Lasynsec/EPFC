Select ID_J 
from J 
where exists (
	select * 
    from SPJ 
    where SPJ.ID_J = J.ID_J 
    group by ID_J 
    having sum(QTY) > 1000)