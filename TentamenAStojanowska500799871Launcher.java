package maintentamenastojanowska500799871;
import java.util.Scanner;

/**
 * @author aneta stojanowska
 * Dit programma berekent stappen gelopen en verbrande kalorieen.
 */
public class TentamenAStojanowska500799871Launcher {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dit programma is gemaakt door Aneta Stojanowska, MIW BA Cohort 13, 500799871. \n");
		// VARIABELEN DECLAREREN EN VERWERKEN
		int 	totaalStappen=0;
		int minstappen;
		final int MIN=5000;
		double kCal;
		System.out.println("Hoeveel stappen wil je minimaal lopern per dag? ");
		minstappen=input.nextInt();
		// WAARDE CONTROLEREN EN INDIEN NODIG OM NIEUWE INVOER VRAGEN
		while(minstappen<MIN) {
			System.out.println("Stel je doelen hoger, minimaal 5000 stappen per dag!\nHoeveel stappen wil je minimaal lopen? ");
			minstappen=input.nextInt();

		}
		// ARRAYS CREEREN EN DECLAREREN
		String[] dagen= {"maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag","zondag"};
		int stappen[]=new int [dagen.length];
		// VRAGEN INPUT GELOPEN STAPPEN PER DAG EN BEREKEN TOTAAL GELOPEN STAPPEN IN DEZE WEEK
		System.out.println("voer het aantal stappen per dag in: ");
		for(int i=0;i<dagen.length;i++) {
			System.out.print(dagen[i]+": ");
			stappen[i]=input.nextInt();
			totaalStappen+=stappen[i];

		}
		System.out.println("je hebt deze week in totaal "+totaalStappen+" stappen gelopen.");
		// METHODE AANROEPEN OM KALORIEEN TE BEREKENEN WAARBIJ 1 KALORIEE IS 0,03 kCal
		kCal=berekenkCal(totaalStappen);

		//DAGEN AFDRUKKEN WAAROP DE GEBRUIKER MINDER DAGEN HEEFT GELOPEN OF JUIST GENOEG GELOPEN
		for (int i=0;i<dagen.length;i++){
			if (stappen[i]<MIN) {
				//System.out.println("Je hetb te weinig stappen geloen op:");
				System.out.printf("%s,",dagen[i]);
			} else if (stappen[i]>MIN){
				System.out.println("Je hebt alle dagen genoeg gelopen, ga zo door!");
			}
		}
	}


	public static double berekenkCal(int aantalStappen) {
		double kCal=aantalStappen*0.03;
		//gebruik deze methode om HET RESULTAAT WEERGEVEN. IK HEB BEGREPEN DAT JE VANUIT DEZE METHODE 
		//RESULTAAT WILT WEERGEVEN, TERWIJL DOE DIT MEESTAL MET VOID METHODE.
		System.out.println("Je hebt hiermee "+kCal+" verbrandt.");
		return kCal;
	}

}
