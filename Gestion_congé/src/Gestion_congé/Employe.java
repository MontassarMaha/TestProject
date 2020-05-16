package Gestion_congé;


public class Employe extends Personnel    {
 
	private int N_CNSS ;
	private String situation_familial ;
	private int nbrs_enfanfs ;
	private String  type_contrat ;
	public Employe(int cin, String nom, String prenom, int matricul, String email, int age, String adresse,Date date_Naissance, int tel, String sexe, Solde_conge solde, String fonction, int n_CNSS,String situation_familial, int nbrs_enfanfs, String type_contrat) 
	{
	super(cin, nom, prenom, matricul, email, age, adresse, date_Naissance, tel, sexe, solde, fonction);
	N_CNSS = n_CNSS;
	this.situation_familial = situation_familial;
	this.nbrs_enfanfs = nbrs_enfanfs;
	this.type_contrat = type_contrat;
	}
	public int getN_CNSS() 
	{
	return N_CNSS;
	}
	public String getSituation_familial() 
	{
	return situation_familial;
	}

	public int getNbrs_enfanfs() 
	{
	return nbrs_enfanfs;
	}

	public String getType_contrat() 
	{
	return type_contrat;
	}

	public void setN_CNSS(int n_CNSS) 
	{
	N_CNSS = n_CNSS;
	}
	public void setSituation_familial(String situation_familial) 
	{
	this.situation_familial = situation_familial;
	}
	public void setNbrs_enfanfs(int nbrs_enfanfs) 
	{
	this.nbrs_enfanfs = nbrs_enfanfs;
	}
	public void setType_contrat(String type_contrat) 
	{
	this.type_contrat = type_contrat;
	}
	public String afficher()
	{
	return "Employe [cin=" + this.getCin() + ", Nom=" + this.getNom() + ", Prenom=" + this.getPrenom() + ", Matricul=" + this.getMatricul() + ", Email=" + 
			this.getEmail() + ", Age=" + this.getAge() + ", Adresse=" + this.getAdresse() + ", date_Naissance=" + this.getDate_Naissance()+ ", Tel=" + 
			this.getTel() + ", Sexe=" + this.getSexe() + "N_CNSS=" + N_CNSS + ", situation_familial=" + situation_familial + ", nbrs_enfanfs=" + nbrs_enfanfs
			+ ", fonction=" + this.getFonction() + ", type_contrat =" + type_contrat + "]";
	}
}
