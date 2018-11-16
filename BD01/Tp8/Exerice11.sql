select ID_Message, count(destinataire) from Destinataires 
	group by ID_Message having count(destinataire) >= 2