class A{
		public void f (int n) { ..... }
		public void f (int n, int q) { ..... }
		public void f (int n, double y) { ..... }
} 


Avec ces déclarations :
A a ; byte b ; short p ; int n ; long q ; float x ; double y ;

*Quelles sont les instructions correctes et, dans ce cas, quelles sont les méthodes appelées et les éventuelles
conversions mises en jeu ?

a.f(n);
a.f(n,q);
a.f(q);
a.f(p,n);
a.f(b,x);
a.f(q,x);
