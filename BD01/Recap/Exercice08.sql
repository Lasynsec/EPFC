select Personne.Nom from Personne where Personne.ID 
	in(select Mange.ID_P from Mange join Hamburger on Mange.ID_H = Hamburger.ID where Hamburger.Genre ="Poulet")
    and Personne.ID  not in(select Mange.ID_P from Mange join Hamburger on Mange.ID_H = Hamburger.ID where Hamburger.Genre ="Boeuf" and Hamburger.Calories < 1000)