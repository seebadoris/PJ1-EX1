import java.util.Scanner;
public class Ex9a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNumTable=0;
		final int intNUM_DERN_TABLE=23;		
		
		System.out.println("Entrez le N� de table: ");
		
		Scanner sc=new Scanner(System.in);
		intNumTable=sc.nextInt();
		
		if (intNumTable <1){
			System.out.println("Saisie incorrecte ! Le N� de table doit �tre sup�rieur ou �gale � 1");
		}
		else if (intNumTable>intNUM_DERN_TABLE	) {
			System.out.println("Saisie incorrecte ! Le N� table plus �lev� est " +intNUM_DERN_TABLE+".Contactez l�administrateur du programme si vous souhaitez augmenter ce nombre");
		}
		else {
			System.out.println("Vous avez entr� le num�ro de table "+intNumTable);
		}
		sc.close();
	}

}
