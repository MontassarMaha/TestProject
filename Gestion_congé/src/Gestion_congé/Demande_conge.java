package Gestion_congé;
import java.util.Vector;

public  class Demande_conge  {


	
	private Date  dateDebut ;
	private Date  dateFin ;
	private  int   num_demande ;
	private  String decision  ; 
	private Personnel  demandeur ;
	private String cause ;
	private int nbr_jours ;
	public Date getDateDebut() 
	{
		return dateDebut;
	}
	public Date getDateFin() 
	{
		return dateFin;
	}
	public int getNum_demande() 
	{
		return num_demande;
	}
	public String getDecision()
	{
		return decision;
	}
	public Personnel getDemandeur() 
	{
		return demandeur;
	}
	public void setDateDebut(Date dateDebut) 
	{
		this.dateDebut = dateDebut;
	}
	public void setDateFin(Date dateFin) 
	{
		this.dateFin = dateFin;
	}
	public void setNum_demande(int num_demande) 
	{
		this.num_demande = num_demande;
	}
	public void setDecision(String decision) 
	{
		this.decision = decision;
	}
	public void setDemandeur(Personnel demandeur) 
	{
		this.demandeur = demandeur;
	}
	
	
	public String getCause() 
	{
		return cause;
	}
	public void setCause(String cause) 
	{
		this.cause = cause;
	}
	
	public int getNbr_jours() 
	{
		return nbr_jours;
	}
	public void setNbr_jours(int nbr_jours) 
	{
		this.nbr_jours = nbr_jours;
	}

	public Demande_conge(Date dateDebut, Date dateFin, int num_demande, String decision, Personnel demandeur,String cause, int nbr_jours) 
	{
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.num_demande = num_demande;
		this.decision = decision;
		this.demandeur = demandeur;
		this.cause = cause;
		this.nbr_jours = nbr_jours;
	}
	public  String  afficher_demande() 
	{
	return "Demande_conge [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", num_demande=" + num_demande
			+ ", decision=" + decision + ", demandeur=" + demandeur.getNom() + ", cause=" + cause + ", nbr_jours=" + nbr_jours
			+ "]";
	}
	public void traitement_demande(Vector<Demande_conge> v) 
	{
	switch(cause) {
	case "repot":{
		if (demandeur.getSolde().getSoldeannuel()>=nbr_jours)
			v.addElement(new  Demande_acceptee (dateDebut,dateFin,num_demande,"acceptee",demandeur,cause,nbr_jours,"votre conge a ete enregistré avec succes" ));
		else 
			v.addElement(new  Demande_refusee (dateDebut,dateFin,num_demande,"refusee",demandeur,cause,nbr_jours,"votre demande est refusee : votre solde annuel est insuffisant" ));
	
	}
	case "exception personnelle":{
		if (demandeur.getSolde().getSolde_exception()>=nbr_jours)
			v.addElement(new Demande_acceptee (dateDebut,dateFin,num_demande,"acceptee",demandeur,cause,nbr_jours,"votre conge a ete enregistré avec succes" ));
		else 
			v.addElement(new  Demande_refusee (dateDebut,dateFin,num_demande,"refusee",demandeur,cause,nbr_jours,"votre demande est refusee : votre solde exceptionnel est insuffisant" ));
	
	}
	case "maladie":{
		if (demandeur.getSolde().getSolde_maladie()>=nbr_jours)
			v.addElement(new Demande_acceptee (dateDebut,dateFin,num_demande,"acceptee",demandeur,cause,nbr_jours,"votre conge a ete enregistré avec succes" ));
		else 
			v.addElement(new  Demande_refusee (dateDebut,dateFin,num_demande,"refusee",demandeur,cause,nbr_jours,"votre demande est refusee : votre solde annuel est insuffisant" ));
	
	}
	}
	}
	}

