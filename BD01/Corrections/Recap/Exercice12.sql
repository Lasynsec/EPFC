select distinct Mange.ID_P from Mange 
	join Hamburger on Mange.ID_H = Hamburger.ID 
    join Personne on Mange.ID_P = Personne.ID
	where Hamburger.Genre = "Poulet" and Personne.Sexe = "M" and Personne.Poids >= all(select Personne.Poids from Personne)