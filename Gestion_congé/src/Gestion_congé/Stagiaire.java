package Gestion_congé;

public class Stagiaire extends Personnel    {

	private String Projet ;
	 private String Etablissement ;
	 private String type_contrat ;
	
	
	
	public Stagiaire(int cin, String nom, String prenom, int matricul, String email, int age, String adresse,
			Date date_Naissance, int tel, String sexe, Solde_conge solde, String fonction, String projet,
			String etablissement, String type_contrat) {
		super(cin, nom, prenom, matricul, email, age, adresse, date_Naissance, tel, sexe, solde, fonction);
		Projet = projet;
		Etablissement = etablissement;
		this.type_contrat = type_contrat;
	}
	public String getProjet() {
		return Projet;
	}
	public String getEtablissement() {
		return Etablissement;
	}
	public String getType_contrat() {
		return type_contrat;
	}
	public void setProjet(String projet) {
		Projet = projet;
	}
	public void setEtablissement(String etablissement) {
		Etablissement = etablissement;
	}
	public void setType_contrat(String type_contrat) {
		this.type_contrat = type_contrat;
	}
	
	public String afficher() {
		return "Stagiaire [cin=" + this.getCin() + ", Nom=" + this.getNom() + ", Prenom=" + this.getPrenom() + ", Matricul=" + this.getMatricul() + ", Email=" + 
				this.getEmail() + ", Age=" + this.getAge() + ", Adresse=" + this.getAdresse() + ", date_Naissance=" + this.getDate_Naissance()+ ", Tel=" + 
				this.getTel() + ", Sexe=" + this.getSexe()+",soldeannuel= "+ this.getSolde().getSoldeannuel() +",soldemaladie="+ this.getSolde().getSolde_maladie()+",soldeannuel= "+", Soldeexception="+this.getSolde().getSolde_exception()+ ", fonction=" + this.getFonction() +"Projet=" + Projet + ", Etablissement=" + Etablissement + ", type_contrat=" + type_contrat + "]";
	} 
}
