import java.util.*;  
public class TreeSet3{  
 public static void main(String args[]){  
 TreeSet<String> set=new TreeSet<String>();  
         set.add("bilal");  
         set.add("b");  
         set.add("a");  
         set.add("hello");  
         System.out.println(" : "+set.isEmpty());
         System.out.println(" : "+set.size());
         System.out.println(" : "+set.contains("bilal"));
         System.out.println(" : "+set.add("hello"));
         System.out.println("depiler : "+set.pollFirst());
         System.out.println("depiler : "+set.pollFirst());
         System.out.println("depiler : "+set.pollFirst());
         System.out.println("depiler : "+set.pollFirst());
         //because it is a tree in ordred valuess
 }  
}  
