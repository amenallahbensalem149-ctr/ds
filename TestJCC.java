package ex2;

public class TestJCC {
	public static void main (String[] args) {
		Jcc jcc2021= new Jcc(2,2021);
		Documentaire film1 =new Documentaire("Le dernier refuge","Ousman","Mali",86,"La guerre civile");
		film1.setNbplaces(30);
		Film film2= new Film("Insurrection","Jilani Saadi","Tunisie",105);
		film2.setNbplaces(45);
		jcc2021.ajoutFilm(film1);
		jcc2021.ajoutFilm(film2);
		jcc2021.listeFilmsJCC();
		int nbEF1=9;
		int nbPF1=film1.getNbplaces()-nbEF1;
		float totalF1=nbEF1*2.0f+nbPF1*3.0f;
		int nbEF2=17;
		int nbPF2=film2.getNbplaces()-nbEF2;
		float totalF2=nbEF2*2.0f+nbPF2*3.0f;
		float total= totalF1+totalF2;
		System.out.println("\n Montant total des ventes de billets pour les JCC 2021 :"+total+"DT");
	}
}
