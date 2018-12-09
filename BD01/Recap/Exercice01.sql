select distinct Personne.Nom, Personne.Poids from Personne 
	join Mange on Personne.ID = Mange.ID_P 
    join Hamburger on Hamburger.ID = Mange.ID_H 
    where Personne.Age < 32 and Hamburger.Genre = "Boeuf" and Hamburger.Calories > 1000;