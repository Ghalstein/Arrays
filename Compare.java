import.java.util.ArrayList;
import.java.util.Scanner;

public class CompareArraySize {

   public static ArrayList<Integer> multiply (list1, list2) {
   	  ArrayList<Integer> big = list1; // big list default
   	  ArrayList<Integer> small = list2; // default list small
      if (list1.size() < list2.size()) {
         big = list2;
         small = list1;
      }
   }   
}