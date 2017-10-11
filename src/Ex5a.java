import java.text.DecimalFormat;
import java.util.Scanner;
//import java.util.Locale;

public class Ex5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat DdFormat2dec = new DecimalFormat("#.##");
		
		double dblPxNet,dblMtTVA;
		int intTVA;
		
		
		intTVA=21;
		dblPxNet=24.25;
		dblMtTVA=dblPxNet-(dblPxNet/(100+intTVA)*100);
		
		System.out.println("Pour un net de "+dblPxNet+"�, le cout de la TVA s'�l�ve � "+dblMtTVA+" �.");
		System.out.println("Pour un net de "+dblPxNet+"�, le cout de la TVA s'�l�ve � "+DdFormat2dec.format(dblMtTVA)+" �.");	
		System.out.println("#################");
		System.out.println("");
		System.out.println("#################");
		//
		//
		//Exercice avec demande � l'utilisateur
		//
		int intUserTva;
		double dblUserPxNet,dblUserMtTva;
		
		Scanner sc=new Scanner(System.in);
		//	sc.useLocale(Locale.US); // utilise le .
		//sc.useLocale(Locale.FRENCH); // utilise la ,
		
		
		System.out.println("Introduisez la Tva en nombre entier: ");
		intUserTva=sc.nextInt();
		System.out.println("La Tva est �gual � "+intUserTva+"%.");
		
		System.out.println("Introduisez votre prix Net(veuillez mettre la virgule pour delimiter les decimal): ");
		dblUserPxNet=sc.nextDouble();
		dblUserMtTva=dblUserPxNet-(dblUserPxNet/(100+intUserTva)*100);
		System.out.println("Pour un net de "+DdFormat2dec.format(dblUserPxNet)+"� et une TVA de "+intUserTva+"%, le montant de la TVA est �gual � "+DdFormat2dec.format(dblUserMtTva)+" �.");
		sc.close();
	}

}