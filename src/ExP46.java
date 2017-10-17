
public class ExP46 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strNom="Le Passe Temps";
		
		System.out.println("Lenght : "+strNom.length());				//le nombre de caracter y compris les espaces
		
		System.out.println("CompareTo 'Le Passe Temps' : "+strNom.compareTo("Le Passe Temps"));
		
		System.out.println("CompareTo 'Le Passe Temps' :"+strNom.compareTo("Le Passe Temps "));
		
		System.out.println("CompareTo 'le passe temps': "+strNom.compareTo("le passe temps"));
		
		System.out.println("CompareToIgnoreCase 'le passe temps': "+strNom.compareToIgnoreCase("le passe temps"));
		
		strNom="	Le	Passe	Temps    ";
		System.out.println("a"+strNom);
		
		System.out.println("b"+strNom.trim());			//supprime les espaces avant et apres le texte
		
		System.out.println("c"+strNom);
		
		strNom=strNom.trim();
		System.out.println("d"+strNom);
		
		strNom="Le passe temps";
		System.out.println(strNom.substring(10,12));			//caractere après le 10ieme caractere jusqu au 12ieme inclus
		
		System.out.println(strNom.charAt(3));				//juste 1 caractere apres le 3ieme 
		
		System.out.println(strNom.concat("\nBienvenu"));
		
		System.out.println("Contenu de la variable :" +strNom);
		
		strNom=strNom+"\nBienvenu";
		System.out.println("Contenu de la variable : "+strNom);		//\n retour a la ligne
		
		strNom="Le Passe Temps";
		System.out.println("endWith: "+strNom.endsWith("temps"));		//verifie si les characteres sont les memes, y compris la majuscule
		System.out.println("endWith: "+strNom.endsWith("mps"));

		System.out.println("replace: "+strNom.replace('T', 'P'));		//remplace le T(majuscule) par P
		System.out.println("replace: "+strNom.replace('T', 'u'));		//ici une seul caractere donc ''
		
		System.out.println("replace All: " + strNom.replaceAll("e", "EEE"));	//ici "" car on peut utiliser la chaine de charactere
		
		System.out.println("to lower case: " + strNom.toLowerCase());		//tout en miniscule
		System.out.println("to upper case: " + strNom.toUpperCase());		//tout en majuscule
		
		System.out.println("Index of1: " + strNom.indexOf("s", 0));
		System.out.println("Index of2: " + strNom.indexOf("s", 2));			//Apres quel caractere trouve t on un s en commancant en 2
		
		System.out.println("Index of22: " + strNom.indexOf("s", 6));		//Apres quel caractere trouve t on un s en commancant en 2
		
		System.out.println("Index of3: " + strNom.indexOf("s", 7));
		System.out.println("Index of4: " + strNom.indexOf("x", 0));
		
		System.out.println("Last Index of e 5: " + strNom.lastIndexOf("e",10));		//
		System.out.println("Last Index of e 6: " + strNom.lastIndexOf("e",9));		//Avant le caracter 9 inclus ou se trouve le dernier e
		
		System.out.println("Last Index of e 7: " + strNom.lastIndexOf("e",0));
		System.out.println("Last Index of e 8: " + strNom.lastIndexOf("e"));
	}

}
