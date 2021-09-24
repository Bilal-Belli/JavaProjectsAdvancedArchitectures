class A{
    private int n ;
    public  int p=10 ;
    public A (int n){
        System.out.println ("Entree Constructeur A - valeur de l'attribut n=" + n) ;
        System.out.println ("Entree Constructeur A - valeur de l'attribut p=" + p) ;
        this.n = n ;
        System.out.println ("Sortie Constructeur A - valeur de l'attribut n=" + n) ;
        System.out.println ("Sortie Constructeur A - valeur de l'attribut p=" + p) ;
        }
}
class B extends A {
    private int q=25 ;
    public B (int n, int pp)
        { super (n) ;
        System.out.println ("Entree Constructeur A - valeur de l'attribut n=" + n) ;
        System.out.println ("Entree Constructeur A - valeur de l'attribut p=" + p) ;
        System.out.println ("Entree Constructeur A - valeur de l'attribut q=" + q) ;
        p = pp ;
        q = 2*n ;
        System.out.println ("Sortie Constructeur A - valeur de l'attribut n=" + n) ;
        System.out.println ("Sortie Constructeur A - valeur de l'attribut p=" + p) ;
        System.out.println ("Sortie Constructeur A - valeur de l'attribut q=" + q) ;
        }
}
public class Ex1{
    public static void main (String args[]){ 
        A a = new A(5) ;
        B b = new B(7, 3) ;
    }
}
