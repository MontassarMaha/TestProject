package Gestion_congé;

import java.util.* ;
import  java.io.*;
public class Gestion_conge {
	
	public Vector<Personnel> personnel ;/*pour les personnels qui demandent des congés*/
	public Vector<Demande_conge> demandes_de_conge ;// les demandes des conges
	public Vector<Demande_conge> resultats_des_demandes ;// les resultats des demandes soit acceptee ou refusee
	public Vector<Reserviste>  les_reservistes ;
	public File mon_personnel ;/*pour les personnels qui demandent des congés*/
	public File demandes;   // les demandes des conges
	public File affectation ;  // les resultats des demandes soit acceptee ou refusee
	public File reserve ;   //pour les reservites 
	 
	public Gestion_conge(String emp,String demand,String resul,String res) throws IOException
	{
		super();
		mon_personnel =new File(emp);
		demandes =new File(demand);
		affectation  =new File(resul);
		reserve =new File(res);
		personnel =new Vector<Personnel>() ;
		demandes_de_conge =new Vector<Demande_conge>() ;
		resultats_des_demandes=new Vector<Demande_conge>()  ;
		les_reservistes =new Vector<Reserviste>() ;
		if(!mon_personnel.exists() && !demandes.exists() && !affectation.exists()&&reserve.exists()) 
		{
			throw new IOException("l'un des fichiers n'est pas creé");
		}
	}
	public void ajout_personnel(  Personnel P)
	{
	    personnel.addElement(P) ;
	}
	public void ajout_demande(Demande_conge D)
	{
		demandes_de_conge.addElement(D) ;
	}

	public void ajout_resultat(Demande_conge R) 
	{ 
		resultats_des_demandes.addElement(R);
	}
	public void ajout_reserviste(Reserviste Re) 
	{
		les_reservistes.addElement(Re);
	}
	 public void supprimer_employe(Employe P)
	{ 
		 personnel. removeElement (P); 
	}
	public void supprimer_demande(Demande_conge D) 
	{
		demandes_de_conge. removeElement (D); 
	}
	public void supprimer_resultat(Demande_conge R) 
	{
			   resultats_des_demandes.removeElement (R);
	}
	public boolean   rechercher_employe (Employe P) 
	{
		return personnel.contains(P);

    }
	public boolean  rechercher_demande (Demande_conge D) {
			  return demandes_de_conge.contains(D) ;
	}
	public boolean  rechercher_resultat (Demande_conge R) {
			   return resultats_des_demandes.contains(R) ;
	}
	public void affichage_de_personnel() {
		for(int i=0; i<personnel.size(); i++)
		{
			personnel.get(i).afficher();
		}
	}
	public void affichage_des_demandes() {
		for(int i=0; i<demandes_de_conge.size(); i++)
		{
			System.out.println(demandes_de_conge.get(i).afficher_demande());
		}
	}
	public void affichage_des_resultats() {
		for(int i=0; i<resultats_des_demandes.size(); i++)
		{
			System.out.println(resultats_des_demandes.get(i).afficher_demande());
		}
	}
	public void affichage_des_reservistes() {
		for(int i=0; i<les_reservistes.size(); i++)
		{
			System.out.println(les_reservistes.get(i).afficher());
		}
	}
	public void gestion_des_demandes() {
		for(int i=0; i<demandes_de_conge.size(); i++)
		{  demandes_de_conge.get(i).traitement_demande(resultats_des_demandes);
				   if ( resultats_des_demandes.get(i) instanceof Demande_acceptee ) {
					   for(int j=0;j<les_reservistes.size();j++)
					   { if (les_reservistes.get(j).getFonction()==demandes_de_conge.get(i).getDemandeur().getFonction()) {
						   Reserviste r=les_reservistes.get(j);
						   r.setEmploye_remplacé(demandes_de_conge.get(i).getDemandeur());
						   personnel.addElement(r);
					         continue;
					   }}
				   }
		}
	}
			     
	public void enregistrer_les_employees(){
		for(int i=0; i<personnel.size(); i++)
		{try
		{
			FileWriter fw = new FileWriter( mon_personnel.getName(),true);
			fw.write(personnel.get(i).afficher());
			fw.close();
    	}
    	catch(IOException ioe)
    	{
    		System.err.println("IOException:"+ ioe.getMessage());
    	}
		}
     }
	public void enregistrer_les_demandes(){
		for(int i=0; i<demandes_de_conge.size(); i++)
		{try
		{
			FileWriter fw = new FileWriter( demandes.getName(),true);
			fw.write(demandes_de_conge.get(i).afficher_demande());
			fw.close();
		}
		catch(IOException ioe)
		{
			System.err.println("IOException:"+ ioe.getMessage());
		}
		}
	}

	public void enregistrer_les_reservistes() {
		for(int i=0; i<les_reservistes.size(); i++)
		{try
		{
			FileWriter fw = new FileWriter( reserve.getName(),true);
			fw.write(les_reservistes.get(i).afficher());
			fw.close();
		}
		catch(IOException ioe)
		{
			System.err.println("IOException:"+ ioe.getMessage());
		}
		}
	}

	public void enregistrer_les_affectations() {
		for(int i=0; i<resultats_des_demandes.size(); i++)
		{try
		{
			FileWriter fw = new FileWriter( affectation.getName(),true);
			fw.write(resultats_des_demandes.get(i).afficher_demande());
			fw.close();
		}
		catch(IOException ioe)
		{
			System.err.println("IOException:"+ ioe.getMessage());
		}
		}
	}
}

