select JNAME from J where ID_J in (select ID_J from SPJ group  by ID_J having sum(QTY) > 1000)