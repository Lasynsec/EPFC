select destinataires.ID_Message, count(destinataire) from destinataires 
	join Message on destinataires.ID_Message = message.ID_Message 
    group by ID_Message