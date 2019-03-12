select count(Destinataire) from Destinataires 
	join Message on Destinataires.ID_Message = Message.ID_Message
    where Message.ID_Message = "M2"