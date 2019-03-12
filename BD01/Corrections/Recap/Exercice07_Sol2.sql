select Hamburger.Nom from Hamburger 
	/*join Mange on Mange.ID_H = Hamburger.ID*/
    join Personne on Personne.ID = Mange.ID_P 
    where (Personne.Poids > 100 and Personne.Sexe ='M')/* and Personne.ID (select Personne.ID from Personne where Personne.Age < 30 and Personne.Sexe = 'F')*/
    