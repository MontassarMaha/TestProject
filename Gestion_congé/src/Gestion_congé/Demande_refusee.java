package Gestion_congé;

public class Demande_refusee extends Demande_conge   {
	
    private String  explication ;
    public Demande_refusee(Date dateDebut, Date dateFin, int num_demande, String decision, Personnel demandeur,String cause, int nbr_jours, String explication) 
    {
		super(dateDebut, dateFin, num_demande, decision, demandeur, cause, nbr_jours);
		this.explication = explication;
	}
    public String getExplication() 
    {
		return explication;
	}
    public void setExplication(String explication) 
	{
		this.explication = explication;
	}
    public String  afficher_demande() 
	{
			return "Demande_refusee [dateDebut=" + this.getDateDebut() + ", dateFin=" + this.getDateFin() + ", num_demande=" + this.getNum_demande()
					+ ", decision=" + this.getDecision() + ", demandeur=" + this.getDemandeur() + ", cause=" + this.getCause() +", nombre_jours="+this.getNbr_jours()+  "explication=" + explication +"]";
	}
			
 
    
	
}
