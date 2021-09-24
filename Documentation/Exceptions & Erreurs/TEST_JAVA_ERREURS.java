class Student {
	int rollno;
	String name;
	float fee;
	Student(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}
	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}
class TestThis1 {
	public static void main(String args[]) {
		Student s1 = new Student(111, "ankit", 5000 f);
		Student s2 = new Student(112, "sumit", 6000 f);
		s1.display();
		s2.display();
	}
}
/*
 *AUCCUN SORTIE CAR IL YA UNE AMBIGUITER DANS LE CONSTRUCTEUR  IL EST PAS CLAIR QUEL IL VA CHOISIT , DONC IL CHOISIT LES ENTRIES COMME PRIORITE
 *OUTPUT:  0 0 null 0.0
 
 *LE CODE POUR RECTIFIER EST LE SUIVANTE
 
 *this: to refer current class instance variable
 */

class Student {
	int rollno;
	String name;
	float fee;
	Student(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}
class TestThis1 {
	public static void main(String args[]) {
		Student s1 = new Student(111, "ankit", 5000 f);
		Student s2 = new Student(112, "sumit", 6000 f);
		s1.display();
		s2.display();
	}
}
/********************************************************************************************************************/
/********************************************************************************************************************/

class A {
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		this.m();
		m();
		//m();//same as this.m()  
	}
}
class TestThis1 {
	public static void main(String args[]) {
		A a = new A();
		a.n();
	}
}
/* 
 *OUTPUT:   hello n
            hello m
            hello m
 
 *ON PEUT PAS FAIT n() INTERIEUR DE n()   => ERREUR
 *this: to refer current class instance other methodes in a method body
 */

/********************************************************************************************************************/
/********************************************************************************************************************/
class A {
	A() {
		System.out.println("hello a");
	}
	A(int x) {
		this();
		System.out.println(x);
	}
}
class TestThis5 {
	public static void main(String args[]) {
		A a = new A(10);
	}
}
/* 
 *OUTPUT:   hello a
            10
 *
 *this: to refer current class constructeur that must exist  
 */
class A {

	A(int x) {
		this();
		System.out.println(x);
	}
}
class TestThis5 {
	public static void main(String args[]) {
		A a = new A(10);
	}
}
/* 
 *ERREUR : MUST DECLARE DEFAULT CONSTRUCTOR TO USE THIS BECAUSE THERE IS ANOTHER CONSTRUCTOR
 * 
 */

/********************************************************************************************************************/
/********************************************************************************************************************/
class S2 {
	void m(S2 obj) {
		System.out.println("method is invoked");
	}
	void p() {
		m(this);
	}

	public static void main(String args[]) {
		S2 s1 = new S2();
		s1.p();
	}
}
/* 
 *OUTPUT: THIS SEUL PEUT UTILISER POUR REFERER  A UN OBJET INSTANCIER DE LA MEME CLASS A L'INTERIEUR
 * 
 */
/********************************************************************************************************************/
/********************************************************************************************************************/
/* ANOTHER EXAMPLE */
class B {
	A4 obj;
	B(A4 obj) {
		this.obj = obj;
	}
	void display() {
		System.out.println(obj.data); //using data member of A4 class
	}
}

class A4 {
	int data = 10;
	A4() {
		B b = new B(this);
		b.display();
	}
	public static void main(String args[]) {
		A4 a = new A4();
	}
}

/********************************************************************************************************************/
/********************************************************************************************************************/
