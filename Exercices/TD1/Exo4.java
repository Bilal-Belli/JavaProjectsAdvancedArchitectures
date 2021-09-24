class A {
		private int n ;
		public A (int m) {n = m;}
		public int getn () {return n;}
		public void setn (int m) {n = m ;}
		}

class Util {
			public static void incrementer (A a  , int p) {a.setn(a.getn()+p);}
			public static void incrementer (int n, int p) {n += p ;}
			}

public class Trans {
						public static void main (String args[]) 
								{
									A a = new A(2) ; int n = 2 ;
									System.out.println ("valeur de a avant : " + a.getn()) ;
									Util.incrementer (a, 5) ;
									System.out.println ("valeur de a apres : " + a.getn()) ;
									System.out.println ("valeur de n avant : " + n) ;
									Util.incrementer (n, 5) ;
									System.out.println ("valeur de n apres : " + n) ;
									}		
}
