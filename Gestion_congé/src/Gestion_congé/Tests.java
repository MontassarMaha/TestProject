package Gestion_congé;

import java.io.IOException;

public class Tests {
	public static void main(String[] args) {
		Date d = new Date(27,01,1997);
		Date dd=new Date(24,01,1995);
		Date d1 =new Date(21,4,2020);
		Date d2 = new Date(13,5,2020);
		
		Solde_conge S1= new Solde_conge(30,15,15);
		Solde_conge S2= new Solde_conge(5,1,4);
		
		
	    Employe P = new Employe(54554,"Ahmed","Ahmed",22,"Ronado@gmail.com",24,"tunis",d,50027656,"homme",S1,"chef generale",45758,"bonne",44,"annuel");
		Employe D = new Employe(54554,"fatma","fatma",24,"fatma@gmail.com",26,"tunis",dd,50027956,"femme",S2,"secretaire",45738,"bonne",3,"annuel");
		Employe E= new Employe(54554,"mahmoud","mahmoud",24,"mahmoud@gmail.com",26,"bizerte",dd,50027954,"homme",S2,"agent",59875,"bonne",0,"annuel");
		Stagiaire st=new Stagiaire(5555,"omar","omrane",19,"omar@yahoo.fr",255,"bizerte",dd,50027954,"homme",S2,"technicien","site web","iset rades","trimestriel");
		Demande_conge H = new Demande_conge(d1,d2,2,"jhhdf",P,"repot",15);
		Reserviste R1= new Reserviste(54554,"mostafa","mostafa",24,"mostafa@gmail.com",26,"monastir",dd,50024554,"homme",S2,"chef generale",5738,"bonne",0,"annuel");
		try {
			Gestion_conge G1= new Gestion_conge(args[0],args[1],args[2],args[3]) ;
			
		G1.ajout_personnel(P);
		G1.ajout_personnel(D);
		G1.ajout_personnel(E);
		G1.ajout_personnel(st);
		G1.ajout_reserviste(R1);
		G1.ajout_demande(H);
		G1.gestion_des_demandes();
		G1.affichage_de_personnel();
		G1.affichage_des_demandes();
		G1.affichage_des_reservistes();
		G1.affichage_des_resultats();
		G1.enregistrer_les_employees();
		G1.enregistrer_les_reservistes();
		G1.enregistrer_les_demandes();
		G1.enregistrer_les_affectations();
		G1.enregistrer_les_reservistes();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	
	}
	}
