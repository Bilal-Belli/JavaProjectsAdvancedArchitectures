public class intsum{
			public static void main(String args[]){
					int suma = Integer.parseInt(args[0]) ;
					int sumb = Integer.parseInt(args[1]) ;
					int sum = suma+sumb;
					int diff = suma-sumb;
					int prod = suma*sumb;
					double avg = (suma+sumb)/2;

					System.out.println("La somme des deux nombres est " + sum);
					System.out.println("La différence des deux nombres est " + diff);
					System.out.println("Le produit des deux nombres est " + prod);
					System.out.println("La moyenne des deux nombres est " + avg);
					if(suma>sumb)
							System.out.println("Le nombre le plus grand est " +suma);
					else
							System.out.println("Le nombre le plus grand est " +sumb);
			 }
}
// 1. Que pensez-vous de ce code ? Respecte-t-il l’approche POO ? Expliquez.
// 2. Proposez une version améliorée.

// la version améliorer 
public class Intsum{
			public static void main(String args[]){
					int suma = Integer.parseInt(args[0]) ; ;
					int sumb = Integer.parseInt(args[1]) ; ;
					Operations op = new Operations() ; 
					System.out.println("La somme des deux nombres est " + op.sum(suma,sumb) );
					System.out.println("La différence des deux nombres est " + op.diff(suma,sumb));
					System.out.println("Le produit des deux nombres est " + op.prod(suma,sumb));
					System.out.println("La moyenne des deux nombres est " + op.avg(suma,sumb));
					System.out.println("Le nombre le plus grand est " + op.max(suma,sumb));
			 }
}
class Operations {
					static public int 	 sum(int a,int b)  { return(a+b) ;   };
					static public int 	 diff(int a,int b) { return(a-b)   ; };
					static public int 	 prod(int a,int b) { return(a*b)  ;  };
					static public double avg(int a,int b)  { return((a+b)/2);};
					static public int 	 max(int a,int b)  { 
															if(a>b)
																return(a);
															else
																return(b);
															 };
				}

