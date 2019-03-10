select Hamburger.Nom, Round(avg(Mange.Note),2) from Hamburger
	join Mange on Hamburger.ID = Mange.ID_H group by Hamburger.ID having count(distinct Mange.ID_P) >= 3
    