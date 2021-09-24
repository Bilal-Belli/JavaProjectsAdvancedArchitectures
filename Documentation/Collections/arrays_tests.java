/*********************matrice triangulaire array ***********/

public class HelloWorld{

     public static void main(String []args){
        

        double[][] mat=new double[3][];
        
        for (int i = 0; i < mat.length; i++)
            mat[i]= new double[i+1];
        
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                 mat[i][j]= 1.5;    
                
        for (int i = 0; i < mat.length; i++){
            System.out.println("");
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j]+" "); 
        }
     }
}

/*********************sort array ***********/
import java.util.Arrays;

public class HelloWorld{

     public static void main(String []args){
         
        double[] vec = new double[1000];
            for (int i = 0; i < vec.length; i++){
                
            vec[i] = Math.random();
            }
            // tri du tableau
            Arrays.sort(vec);
        for (int i = 0; i < vec.length; i++)
            System.out.println(vec[i]+" "); 

     }
}
