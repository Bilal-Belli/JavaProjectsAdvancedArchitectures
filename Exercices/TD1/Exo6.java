import java.util.Scanner ;

/* 1. Ouvrez votre IDE et créez un projet appelé ProjetPoint contenant la classe Point vue en cours. */ 
class Point {
			private int x;
			private int y;
			public Point(int absc, int ord){	//constructeur
											x = absc;
											y = ord;
												}
												// des methodes
			public void deplacer (int dx, int dy){ 
												x = x + dx;
												y = y + dy;
													}
			public void afficher(){
									System.out.println("Mes coordonnées sont x = "+x+" et y ="+y);
										}
				}
/*
*	Si vous essayez d’exécuter le fichier Point tel quel, le compilateur vous signalera une erreur. En fait, comme
*	dans le langage C, exécuter un programme java consiste à exécuter le corps d’une méthode main qui doit se
*	trouver dans une classe. Un fichier java peut contenir plusieurs classes, mais une seule peut contenir la
*	méthode main. Dans notre cas, le fichier Point.java contient uniquement la classe Point.
*
*/
/* 
*	2. Ajoutez une classe TestPoint contenant uniquement la méthode main suivante : 
*
*		public static void main (String args [] ){
*		Point p = new Point(2,3);
*		p.afficher();}
*											*/
/* 

// reponce a la question 1


class TestPoint{

	public static void main (String args [] ){
										Point p = new Point(2,3);
										p.afficher();
											}
}
*/
/*
*	B. Exécution avec passage de paramètres en ligne de commande
*	Le programme Point tel qu’il est n’a aucun intérêt, nous désirons l’améliorer en permettant de créer des objets
*	de type Point dont les valeurs de x et y (abscisse et ordonnée) seront lues au clavier. Nous allons voir comment
*	attribuer une valeur à ces attributs en utilisant la ligne de commande.
*	Retour sur la méthode main : Comme il a été expliqué plus haut, le tableau args contient des objets de type
*	String permettant de récupérer des arguments passés à la méthode main sur la ligne de commandes. On a accès
*	à ces paramètres en écrivant args[0], args[1],…etc. Le nombre de paramètres est fourni par args.length. Nous
*	pouvons donc désormais donner les valeurs de x et y en arguments, mais attention, ces arguments sont de type
*	String, ce sont donc des chaines de caractères. Or nos attributs x et y sont des entiers. Donc pour pouvoir les
*	utiliser il est nécessaire de les transformer en variables de type int. Cela peut se faire grâce à la méthode
*	parseInt de la classe Integer.
*/
/*
1. Modifiez la méthode main de la classe TestPoint comme ceci :

		public static void main (String args []){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		Point p = new Point (x,y);
		p.afficher();
		}
*/



/*
// reponce a la question 2
class TestPoint{

	public static void main (String args [] ){
										int x = Integer.parseInt(args[0]);
										int y = Integer.parseInt(args[1]);
										Point p = new Point (x,y);
										p.afficher();
											}
}
*/



/*
*	2. Recompilez et exécutez le programme en lui donnant des valeurs en ligne de commande.
*/

// compilation et exécution avec success


/*
*	C. Lire des données au clavier
*	Nous voulons maintenant modifier encore notre programme en permettant à l’utilisateur l’introduction de
*	données au clavier. Pour cela, java dispose de plusieurs méthodes. La plus simple a été introduite dans la
*	version 1.5. Il s’agit d’utiliser un objet de la classe Scanner. Pour ce faire, nous devons importer en premier
*	la classe Scanner qui se trouve dans java.util, grâce à l'instruction import qui doit se situer au début de votre
*	programme :
				import java.util.Scanner ;
				class TestPoint{… }
*	Dans la méthode main, ajoutez cette ligne pour déclarer un objet de type Scanner :
				public static void main (String args []){
				Scanner sc = new Scanner(System.in);
				… }
*	Cet objet peut prendre différents paramètres. Nous utilisons celui qui correspond à l'entrée standard (clavier)
*	en Java, System.in. (Lorsque vous écrivez System.out.println() vous appliquez la méthode println()sur la sortie
*	standard).
*	Pour permettre à Java de récupérer ce que vous allez saisir, vous pouvez utiliser les méthodes suivantes :
		• next() : renvoie la prochaine chaîne de caractères. Par défaut, les séparateurs des chaînes de caractères
		sont les caractères d'espacement (espace, saut de ligne, tabulation...).
		• nextLine() : renvoie la prochaine ligne ou la fin de la ligne courante.
		• nextInt() : pour que cet appel fonctionne, il est nécessaire que la prochaine donnée corresponde à un
		entier, que la méthode renvoie ; sinon la méthode lancera une exception.
		• nextLong(), nextByte(), nextDouble().. : même fonctionnement que nextInt, le type de la donnée
		introduite doit correspondre au type demandé par la méthode.
*	Dans notre exemple, les attributs sont de type entier, nous allons donc utiliser nextInt :
				public static void main (String args []){
				Scanner sc = new Scanner(System.in);
				System.out.println("Veuillez saisir x :");
				int x = sc.nextInt();
				System.out.println("Veuillez saisir y :");
				int y = sc.nextInt();
				Point p = new Point(x,y);
				p.afficher();
				}
*/



// reponce a la question 3
class TestPoint{

	public static void main (String args [] ){
										Scanner sc = new Scanner(System.in);
										System.out.println("Veuillez saisir x :");
										int x = sc.nextInt();
										System.out.println("Veuillez saisir y :");
										int y = sc.nextInt();
										Point p = new Point (x,y);
										p.afficher();
											}
}
