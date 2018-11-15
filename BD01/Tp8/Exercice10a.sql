select destinataires.ID_Message, contenu, count(Destinataire) as NbrDestinataires from destinataires 
	join Message on destinataires.ID_Message = message.ID_Message 
    group by ID_Message