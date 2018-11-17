select contenu, Personne.Nom from Message 
	join Personne on Message.Expediteur = Personne.SSN
	join Destinataires on Message.ID_Message = Destinataires.ID_Message
group by Destinataires.ID_Message having count(Destinataires.ID_Message) = 1