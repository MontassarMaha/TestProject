package Gestion_congé;

public class Solde_conge {
	private int soldeannuel ;
	private int solde_maladie ;
	private int solde_exception ;
	public Solde_conge(int soldeannuel, int solde_maladie, int solde_exception) {
		super();
		this.soldeannuel = soldeannuel;
		this.solde_maladie = solde_maladie;
		this.solde_exception = solde_exception;
	}
	public int getSoldeannuel() {
		return soldeannuel;
	}
	public int getSolde_maladie() {
		return solde_maladie;
	}
	public int getSolde_exception() {
		return solde_exception;
	}
	public void setSoldeannuel(int soldeannuel) {
		this.soldeannuel = soldeannuel;
	}
	public void setSolde_maladie(int solde_maladie) {
		this.solde_maladie = solde_maladie;
	}
	public void setSolde_exception(int solde_exception) {
		this.solde_exception = solde_exception;
	} ;

}