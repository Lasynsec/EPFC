select Hamburger.Nom, count(distinct Mange.ID_P) from Hamburger
	join Mange on Hamburger.ID = Mange.ID_H group by Hamburger.ID having avg(Mange.Note) >= 6
    