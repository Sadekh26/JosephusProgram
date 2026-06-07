import java.util.*;
import java.io.*;

public class JosephusSim {
   private PersonNode front;      
   private int size;              
   private int eliminationCount;         
   
   public JosephusSim(String fileName) {
      try {
         Scanner file = new Scanner(new File(fileName));
         String firstName = file.next();
         front = new PersonNode(firstName); 
         PersonNode current = front;
         int i = 1;
         while(file.hasNext()){
            String name = file.next();
            current.next = new PersonNode(name);
            current = current.next;
            i++; 
         } 
         size = i;
         current.next = front;       
         Random r = new Random();
         eliminationCount = r.nextInt(i/2)+ 1;
         System.out.println("=== Elimination count is " + eliminationCount +" ===");
      
      } catch (FileNotFoundException e) {
         System.out.println("Something went wrong with " + e.getMessage());
      }
   }     
   public void eliminate() { 
      PersonNode current = front;
      for(int i = 1; i < eliminationCount - 1; i++){
         current = current.next;
      } 
      System.out.println( current.next.name + " eliminated!");
      front = current.next.next;
      current.next = current.next.next;
      size--;
  }
   public boolean isOver() {
      return size == 1;
   }
   public String toString() {
      String name = "";
      if(size == 1)
         return front.name + " is the last survivor!";
      else{
         PersonNode current = front;
         name ="1-" + current.name;
         for(int i = 2; i <= size ; i++){
            name += ", " + i +"-" + current.next.name;
            current = current.next;
         }
      }
      return name;
   }
}
