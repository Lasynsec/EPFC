Select SSN1,Principale.Nom, personne.Nom from personne 
	join EstAmi on personne.SSN = estami.SSN2 
	join personne as Principale on Principale.SSN = estami.SSN1 where Principale.SSN
    in (select SSN1 from estami group by SSN1 having count(SSN2) between 1 and 2)