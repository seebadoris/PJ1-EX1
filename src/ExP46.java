
public class ExP46 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strNom="Le Passe Temps";
		
		System.out.println("Lenght : "+strNom.length());
		
		System.out.println("CompareTo 'Le Passe Temps' : "+strNom.compareTo("Le Passe Temps"));
		
		System.out.println("CompareTo 'Le Passe Temps' :"+strNom.compareTo("Le Passe Temps "));
		
		System.out.println("CompareTo 'le passe temps': "+strNom.compareTo("le passe temps"));
		
		System.out.println("CompareToIgnoreCase 'le passe temps': "+strNom.compareToIgnoreCase("le passe temps"));
		
		strNom="	Le	Passe	Temps";
		System.out.println(strNom);
		
		System.out.println(strNom.trim());
		
		System.out.println(strNom);
		
		strNom=strNom.trim();
		System.out.println(strNom);
		
		strNom="Le passe temps";
		System.out.println(strNom.substring(10,12));
		
		System.out.println(strNom.charAt(3));
		
		System.out.println(strNom.concat("\nBienvenu"));
		
		System.out.println("Contenu de la variable :" +strNom);
		
		strNom=strNom+"\nBienvenu";
		System.out.println("Contenu de la variable : "+strNom);
		
		strNom="Le Passe Temps";
		System.out.println("endWith: "+strNom.endsWith("Temps"));
		System.out.println("endWith: "+strNom.endsWith("mps"));

		System.out.println("replace: "+strNom.replace('T', 'P'));
		System.out.println("replace: "+strNom.replace('T', 'u'));
	}

}
