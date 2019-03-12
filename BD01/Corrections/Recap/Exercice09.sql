select Personne.Nom from Personne 
join Mange on Personne.ID = Mange.ID_P
join Hamburger on Hamburger.ID = Mange.ID_H
	where Personne.Sexe = "F" and Hamburger.Genre = "Poulet" group by Mange.ID_P
    having count(distinct Hamburger.ID) = (select Count(*) from Hamburger where Genre = "Poulet")
    