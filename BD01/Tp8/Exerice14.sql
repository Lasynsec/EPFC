select contenu, nom from message 
	join personne
    on message.Expediteur = personne.SSN 
    join destinataires
    on destinataires.ID_Message = message.ID_Message
    join personne 
    on personne.
    
    group by nom having count(Expediteur) = 1