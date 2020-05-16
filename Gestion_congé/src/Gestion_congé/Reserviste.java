package Gestion_congé;

public class Reserviste extends Employe {

	
	private Personnel employe_remplacé=null  ;
	public Reserviste(int cin, String nom, String prenom, int matricul, String email, int age, String adresse,Date date_Naissance, int tel, String sexe, Solde_conge solde, String fonction, int n_CNSS,String situation_familial, int nbrs_enfanfs, String type_contrat) {
		super(cin, nom, prenom, matricul, email, age, adresse, date_Naissance, tel, sexe, solde, fonction, n_CNSS,
				situation_familial, nbrs_enfanfs, type_contrat);
		
	}
	public Personnel getEmploye_remplacé() {
		return employe_remplacé;
	}
	public void setEmploye_remplacé(Personnel employe_remplacé) {
		this.employe_remplacé = employe_remplacé;
	}
	public String  afficher() {
		Solde_conge s ;
		s=this.getSolde();
		return "Employe [cin=" + this.getCin() + ", Nom=" + this.getNom() + ", Prenom=" + this.getPrenom() + ", Matricul=" + this.getMatricul() + ", Email=" + 
				this.getEmail() + ", Age=" + this.getAge() + ", Adresse=" + this.getAdresse() + ", date_Naissance=" + this.getDate_Naissance()+ ", Tel=" + 
				this.getTel() + ", Sexe=" + this.getSexe() +",soldeannuel= "+ s.getSoldeannuel()+",soldemaladie="+ s.getSolde_maladie()+",soldeannuel= "+", Soldeexception="+s.getSolde_exception()+
				"N_CNSS=" + this.getN_CNSS() + ", situation_familial=" + this.getSituation_familial() + ", nbrs_enfanfs=" + this.getNbrs_enfanfs()
				+ ", fonction=" + this.getFonction() + ", type_contrat =" + this.getType_contrat() +
				", c le remplacant de"+employe_remplacé.getNom()+":"+employe_remplacé.getPrenom()+":"+employe_remplacé.getMatricul()    +  "]";
	}
}
