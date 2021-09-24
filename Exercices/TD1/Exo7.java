
/* 	* 1. Créez une classe Etudiant ayant comme attributs le nom, le prénom et le matricule qui sont de type
	* String, ainsi que les moyennes dans les différents modules qui sont au nombre de 3 : mod1, mod2,
	* mod3 et qui sont de type double.
*/

class Etudiant {
			public String  nom,prenom,matricule;
			public double    mod1,mod2,mod3;
			public void Etudiant(String name,String lastname,String mat ) //constructeur
			{
					this.nom=name;
					this.prenom=lastname;
					this.matricule=mat;
			}
			public void afficher(){
									System.out.println(nom);
									System.out.println(prenom);
									System.out.println(matricule);
									System.out.println(mod1);
									System.out.println(mod2);
									System.out.println(mod3);
									}
			static public double calculerMoyenne(double mod1,double mod2,double mod3)
			{
				return(((mod1+mod2+mod3)/3));
			}
}
/*
class Etudiant {
			public String  nom,prenom,matricule;
			public double    mod1,mod2,mod3;
-----------------------------------------------------------------------------------------------------------
	* 2. Dotez-la d’un constructeur exhaustif pour initialiser tous ses attributs, d’une méthode void afficher()
	* 	 permettant d’afficher les valeurs de ses attributs et une méthode double calculerMoyenne permettant
	* 	 de calculer et retourner sa moyenne (nous supposons que tous les modules ont un coefficient de 1)
-----------------------------------------------------------------------------------------------------------
			public void Etudiant() //constructeur
			{
					this.nom="nom_etudiant";
					this.prenom="prenom_etudiant";
					this.matricule="/matricule";
					this.mod1=17;
					this.mod2=15;
					this.mod3=13;
			}
			public void afficher(){
									System.out.println(nom);
									System.out.println(prenom);
									System.out.println(matricule);
									System.out.println(mod1);
									System.out.println(mod2);
									System.out.println(mod3);
									}
			static public double calculerMoyenne(double mod1,double mod2,double mod3)
			{
				return(((mod1+mod2+mod3)/3));
			}
}
*/


/*  * Créez une classe Test n’ayant aucun attribut et comportant uniquement la méthode main. */

public class Test{

	/*  4. Au sein de la méthode main, créer une instance de type Etudiant que vous appellerez etudiant et
	*	        affichez ses informations et sa moyenne .
	*
	*/

	public static void main(String[] args){

		/*   5.On veut pouvoir créer un étudiant en initialisant uniquement le nom, le prénom et le matricule, que
		*    faut-il faire ? Modifiez votre programme.
		*/
		// reponce : il faut ajouter des parametres à entré dans la methode constructeur
		Etudiant etudiant = new Etudiant();
		etudiant.Etudiant("bilal","belli","19/0128");
		etudiant.afficher();
		System.out.println("la moyenne est :" + etudiant.calculerMoyenne(etudiant.mod1,etudiant.mod2,etudiant.mod3));

	}
}

/*   6. Créez une classe Scolarite qui gère un ensemble d’étudiants n’excédant pas le nombre de 500. La
*       classe scolarité comporte une méthode nbEtudiants qui renvoie le nombre d’étudiants inscrits et une
*		méthode afficher qui affiche la liste des étudiants. Si l’on désire afficher uniquement les étudiants
*		ayant une moyenne générale dépassant un certain seuil, il suffit de l’indiquer à la méthode.
*/
class Scolarite{
	public int nb_etud;
	static public int nbEtudiants(){return(nb_etud);}
	public void afficher(){
		System.out.println("la moyenne est :");
	}
}
