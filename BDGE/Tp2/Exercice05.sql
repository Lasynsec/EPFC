select traducteur_ecrivain.NOM 
	from traducteur_ecrivain 
		join traduit_par on traducteur_ecrivain.IDTRAD_ECRIV = traduit_par.numTrad
		join livre_paru on traduit_par.numLivre = livre_paru.IDLIVRE
		where traducteur_ecrivain.NAT = 'Fr' and livre_paru.LANGUE = 'Fr' and livre_paru.TITRE = 'Don Quichotte'; 