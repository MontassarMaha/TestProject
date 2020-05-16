package Gestion_congé;

public class Demande_acceptee extends Demande_conge   {
    
	private String comentaire ;
       
	
	
	
	
	public Demande_acceptee(Date dateDebut, Date dateFin, int num_demande, String decision, Personnel demandeur,
			String cause, int nbr_jours, String comentaire) 
	{
		super(dateDebut, dateFin, num_demande, decision, demandeur, cause, nbr_jours);
		this.comentaire = comentaire;
	}

	public String getComentaire() 
	{
		return comentaire;
	}

	public void setComentaire(String comentaire) 
	{
		this.comentaire = comentaire;
	}
	public String afficher_demande() 
	{
		return "Demande_acceptee [dateDebut=" + this.getDateDebut() + ", dateFin=" + this.getDateFin() + ", num_demande=" + this.getNum_demande()
				+ ", decision=" + this.getDecision() + ", demandeur=" + this.getDemandeur() + ", cause=" + this.getCause() +", nombre_jours="+this.getNbr_jours()+ "comentaire=" + comentaire +"]";
	}
		
     public void traitement_solde() 
     {
    	 int jrs=this.getNbr_jours();
    	 int x=this.getDemandeur().getSolde().getSolde_exception();
         this.getDemandeur().getSolde().setSolde_exception(x-jrs);
     }
}
