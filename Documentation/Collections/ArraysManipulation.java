/* Print an array */
import java.util.Arrays;
public class Test {

    public static void main(String[] args) {

        int[] mat = new int[10];
        for (int i = 0; i < mat.length; i++) {
            mat[i] = 1;
        }
        System.out.print(Arrays.toString(mat));
    }
}
/*arrays manitipilation STRING PRINT/ENTER*/
import java.util.Arrays;
public class Test {

    public static void main(String[] args) {

        /*declaration*/
        String[] array = {
            "John",
            "Mahta",
            "Poll"
        };

        /*twend are both*/
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));

        /*entered data to array of string*/
        for (int i = 0; i < array.length; i++) {
            array[i] = "bilal";
        }

        /*twend are both*/
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));
    }
}
/*l'utilisation des tableaux annymes*/
/* -The main purpose of anonymous array is just for instant use (just for one time usage)
   -Anonymous array is passed as an argument of method */
public class Test {
    public static void main(String[] args)
    {
          // anonymous array
          sum(new int[]{ 1, 2, 3 });
    }
    public static void sum(int[] a)
    {
        int total = 0;
        // using for-each loop
        for (int i : a) 
            total = total + i;
          
        System.out.println("The sum is:" + total);
    }
}
/*L'utilisation de equals est compare les refferences
  equals : est concerner qu'a avec les chaines de caracteres & objets & les tableaux */
public class Main {
  public static void main(String[] args) {
      
    int[] myStr1 = new int[1];
    int[] myStr2 = new int[1];
    int[] myStr3 = new int[1];
    
    myStr1[0]=1;
    myStr2[0]=1;
    myStr3[0]=2;
    System.out.println(myStr1.equals(myStr2));
    System.out.println(myStr1.equals(myStr3));
  }
}
public class Main {
  public static void main(String[] args) {
      
    int[] myStr1 = new int[1];
    int[] myStr2 = new int[1];
    int[] myStr3 = new int[1];
    
    myStr1[0]=1;
    myStr2[0]=1;
    myStr3[0]=2;
    myStr1=myStr2;
    System.out.println(myStr1.equals(myStr2));
    System.out.println(myStr1.equals(myStr3));
  }
}
