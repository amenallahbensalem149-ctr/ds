package ex2;

public class Jcc {
	private Film [] competition;
	private int annee;
	private final int NBFMAX=30;
	private int nbF=0;
	
	public Jcc(int t,int a) {
		if(t >NBFMAX) {
			System.out.println("la taille dépasse la nombre maximal,le tableau sera limité à "+NBFMAX);
			t=NBFMAX;
		}
		this.competition=new Film[t];
		this.annee=a;
	}
	
	public void ajoutFilm(Film f) {
		if (nbF<competition.length) {
			competition[nbF]=f;
			nbF++;
		}else
			System.out.println("la competition est complete");
	}
	
	public void listeFilmsJCC() {
		System.out.println("Films en compétition pour l'année "+annee+" : ");
		for(int i=0;i<nbF;i++) {
			System.out.println((i+1)+". "+competition[i]);
		}
	}
	
	public float totalVenteBilletsJCC() {
		float total=0;
		for(int i=0;i<nbF;i++) 
			total+=competition[i].totalVenteBillets();
		return total;
	}
}
