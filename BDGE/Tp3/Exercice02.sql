select traducteur_ecrivain.NOM 
	from traducteur_ecrivain 
		join ecrit_par on traducteur_ecrivain.IDTRAD_ECRIV = ecrit_par.numEcriv
		join livre_paru on ecrit_par.numOeuvre = livre_paru.numOeuvre
		where livre_paru.editeur = 'Flammarion' and YEAR(livre_paru.date_parution) = 1991
alter table dbo.oeuvre add constraint specificGenders check(GENRE in('Roman','théâtre','essai','poésie','Musique','Biographie','informatique'))
/*test*/
insert into dbo.œuvre (IDOEUVRE,TITRE,ANNEE,GENRE,LANGUE) values (9,'Necromencer',1985,'Action','En')
