import java.util.Scanner;

public class Ex10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intUserTva=0;
		double dblUserPxBrut,dblPxNet;
		int intTva1=6,intTVA=12,intTva=21;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Pour un taux de TVA de 6% tapez 1, 2 pour 12% et 3 pour 21%");
		
		intUserTva=sc.nextInt();
		if (intUserTva==1||intUserTva==2||intUserTva==3){
			System.out.println("Prix brut : ");
			dblUserPxBrut=sc.nextDouble();
			
		}
		else {
			System.out.println("Saisie incorrect!");
		}
	}

}
