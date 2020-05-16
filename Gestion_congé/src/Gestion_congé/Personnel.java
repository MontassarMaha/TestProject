package Gestion_congé;

public  class Personnel   {
	
	private int cin ;
    private String Nom ;
    private String Prenom ;
    private int Matricul;
    private String Email ;
    private int Age ;
    private String Adresse ;
    private   Date date_Naissance ;
    private int Tel ;
    private String Sexe ;
    private Solde_conge Solde;
    private String fonction ;

	public Personnel(int cin, String nom, String prenom, int matricul, String email, int age, String adresse,
			Date date_Naissance, int tel, String sexe, Solde_conge solde,String fonction) {
		
		this.cin = cin;
		Nom = nom;
		Prenom = prenom;
		Matricul = matricul;
		Email = email;
		Age = age;
		Adresse = adresse;
		this.date_Naissance = date_Naissance;
		Tel = tel;
		Sexe = sexe;
		Solde =solde;
		this.fonction=fonction;
	}

	public  String  afficher() {
		return "Personnel [cin=" + cin + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Matricul=" + Matricul + ", Email="
				+ Email + ", Age=" + Age + ", Adresse=" + Adresse + ", date_Naissance=" + date_Naissance + ", Tel="
				+ Tel + ", Sexe=" + Sexe +",soldeannuel= "+ Solde.getSoldeannuel()+",soldemaladie="+ Solde.getSolde_maladie()+",soldeannuel= "+", Soldeexception="+Solde.getSolde_exception()+"]";
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public Solde_conge getSolde() {
		return Solde;
	}

	public void setSolde(Solde_conge solde) {
		Solde = solde;
	}

	public int getCin() {
		return cin;
	}

	public String getNom() {
		return Nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public int getMatricul() {
		return Matricul;
	}

	public String getEmail() {
		return Email;
	}

	public int getAge() {
		return Age;
	}

	public String getAdresse() {
		return Adresse;
	}

	public Date getDate_Naissance() {
		return date_Naissance;
	}

	public int getTel() {
		return Tel;
	}

	public String getSexe() {
		return Sexe;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public void setMatricul(int matricul) {
		Matricul = matricul;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public void setDate_Naissance(Date date_Naissance) {
		this.date_Naissance = date_Naissance;
	}

	public void setTel(int tel) {
		Tel = tel;
	}

	public void setSexe(String sexe) {
		Sexe = sexe;
	}
	
    

}
