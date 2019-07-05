import java.lang.Math;

public class Permutator {
   
   // permutates the target array based on the permutation of perm[]
   private static void permutate(int[] perm, String[] targetArr) {

   }

   //create a randomly formed string array of a - h
   private static String[] strArrGen (int num) {
   	  String[] randStrArr = {"a", "b", "c", "d", "e", "f", "g", "h"};
   	  String[] arr = new String[num];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = randStrArr[ (int)(Math.random() * randStrArr.length)];
      }
      return arr;
   }

   private static void printArr(String[] arr) {
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }

   private static void exchange (int i, int j) {
      int temp = i;
      i = j;
      j = temp;
   }

   private static String[] permutate(String[] strArr, int[] perm) {
      String[] newStrArr = new String[strArr.length];
      for (int i = 0; i < perm.length; i++) {
         newStrArr[i] = strArr[perm[i] - 1];
      }
      return newStrArr;
   }

   public static void main(String args[]) {
      int[] perm = new int[args.length]; // creating an array the size of the command line array
      String[] targetArr = strArrGen(args.length);
      for (int i = 0; i < perm.length; i++) {
         perm[i] = Integer.parseInt(args[i]);
      }
      printArr(targetArr);
      System.out.println();
      printArr(permutate(targetArr, perm));
   }
}