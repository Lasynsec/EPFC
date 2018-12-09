select Personne.Nom, Personne.Age from Personne 
	join Mange on Personne.ID = Mange.ID_P
    join Hamburger on Mange.ID_H = Hamburger.ID
    where Personne.Poids > 60 and Hamburger.Genre = "Poulet" and Mange.Note < 7