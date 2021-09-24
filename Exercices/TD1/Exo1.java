class Entier {
				private int n ;
				public Entier (int n) 			 {		this.n = n ;		 }
				public void incrementer(int dn)  {	n += dn ; 			     }
				public void imprimer ()			 {	System.out.println (n) ; }
			}

public class TestEnt{
						public static void main (String args[])
						{
							Entier n1 = new Entier (2);
							System.out.print ("n1 = ");
							n1.imprimer();
							Entier n2 = new Entier (5);
							System.out.print ("n2 = ");
							n2.imprimer(); 
							n1.incr(3);	
							System.out.print ("n1 = ");
							n1.imprimer() ;
							System.out.println ("n1 == n2 est " +(n1 == n2)); 
							n1 = n2; 
							n2.incr(12) ;
							System.out.print ("n2 = ");
							n2.imprimer();
							System.out.print ("n1 = ");
							n1.imprimer() ;
							System.out.println ("n1 == n2 est " +(n1 == n2)); 
						}
			}
