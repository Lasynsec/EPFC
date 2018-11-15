select Sexe, count(ID_Message) from Destinataires 
	join personne 
    on destinataires.Destinataire = personne.SSN group by Sexe