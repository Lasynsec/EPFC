select Oeuvre.TITRE from Oeuvre where IDOEUVRE in(select NUMOEUVRE from livre_paru group by NUMOEUVRE having COUNT(NUMOEUVRE) = 1)
