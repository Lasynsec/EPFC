select Personne.Nom, Personne.Sexe from Personne
	join Mange on Personne.ID = Mange.ID_P group by Mange.ID_P,Mange.ID_H having count(Mange.ID_H) >= 3  