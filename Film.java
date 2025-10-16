package ex2;
import java.util.Scanner;
public class Film {
	private String titre;
	private String realisateur;
	private String pays;
	private int duree;
	private int nbplaces;
	
	public int getNbplaces() {
		return this.nbplaces;
	}
	
	public void setNbplaces(int n) {
		this.nbplaces=n;
	}
	
	public String toString() {
		return titre+" de "+realisateur+" ("+pays+")"+" - "+duree+"min.";
	}
	
	public Film (String titre,String r,String pays,int d) {
		this.titre=titre;
		this.realisateur=r;
		this.pays=pays;
		this.duree=d;
	}
	public float totalVenteBillets() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Entrez le nombre de places à réservées pour étudinat: ");
		int nbEtudiant=sc.nextInt();
		while(nbEtudiant>nbplaces) {
			System.out.println("le nombre d'etudiants ne doit pas dépasser le nombre de places réservées ("+nbplaces+").Resaisissez : ");
			nbEtudiant=sc.nextInt();
		}
		int nbPublic=nbplaces-nbEtudiant;
		float montantTotal=(nbPublic*3.0f)+(nbEtudiant*2.0f);
		return montantTotal;
	}
	
}


class Documentaire extends Film{
	private String sujet;
	private static float tarif=2.0f;
	
	public Documentaire(String t,String r,String pays,int d,String sujet) {
		super(t,r,pays,d);
		this.sujet=sujet;
	}
	
	public String toString() {
		return super.toString()+"[Sujet : "+sujet+"]";
	}
	
	public float totalVenteBillets() {
		return getNbplaces()*tarif;
	}
	
}








