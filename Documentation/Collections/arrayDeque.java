import java.util.*;  
public class ArrayDequeExample {  
   public static void main(String[] args) {   
   ArrayDeque<String> deque = new ArrayDeque<String>();  
   deque.add("belli");    
   deque.add("bilal");     
   deque.add("2cp5");  
   System.out.println(deque.getFirst());  
   System.out.println(deque.removeFirst());  
   System.out.println(deque.getFirst());  
   for (String str : deque) {  
   System.out.println(str);  
   }  
   }  
}
