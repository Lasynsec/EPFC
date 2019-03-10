select nom from personne join message on personne.SSN = message.Expediteur 
	group by Expediteur, Sexe
    having count(Expediteur) = 1 and Sexe = "F"