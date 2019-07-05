public class PrimeNumber {

   private static int[] detectPrime(int num, int iterator, int[] primeNumArr, int next) {
        
   	    for (int j = 3; j <= next; j += 2) {
   		   if (next % j == 0 && next != j) {
   		      break;
   		   }
   		   if (next == j) {
   		      primeNumArr[iterator++] = next;
   		   }
   		}
   		next += 2;
        if (num >= next) {
           detectPrime(num, iterator, primeNumArr, next);
        }
        else {
           return primeNumArr;
        }
      return primeNumArr;
   }

   private static void setup(int num, int[] primeNumArr) {
      int i = 0;
      if (num > 1) {
         primeNumArr[i++] = 2;
      }
      int next = 3;
      if (num > 2) {
         detectPrime(num, i, primeNumArr, next);
      }
   }

   private static void primePrintArr (int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == 0) {
            return;
         }
         else {
            System.out.print(arr[i] + " ");
         }
      }
   }
   

   public static void main(String args[]) {
      int userInput = Integer.parseInt(args[0]);
      int[] primeNumArr = new int[userInput/2];
      setup(userInput, primeNumArr);
      primePrintArr(primeNumArr);
      System.out.println();
   }
}