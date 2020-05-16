package Gestion_congé;

public class Date {
	private int jour,mois,annee;

	  public Date(int j,int m,int a) 
	  {
	    jour=j;
	    mois=m;
	    annee=a;
	  }

	  public int getJour()
	  {
	    return jour;
	  }
	  public int getMois()
	  {
		  return mois;
	  }

	  public int getAnnee()
	  {
		  return annee;
	  }


	  public void setJour(int jour) 
	  {
		this.jour = jour;
	  }

	  public void setMois(int mois) 
	  {
		this.mois = mois;
	  }

	public void setAnnee(int annee) 
	{
		this.annee = annee;
	}
}

