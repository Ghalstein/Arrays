public class IncrementPermutation {
   
   private static int globalMaxRep = 1;
   private static int index = 0;
   private static boolean done = false;

   private static void exchange(int first, int second) {
      int temp = first;
      first = second;
      second = temp;
   }

   private static void findLongestRep(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
      	if (globalMaxRep > arr.length - i) {
            return;
         }
         int relMax = 1;
         int j = i;
         while (j < arr.length - 1) {
            if (arr[j + 1] == arr[j++] - 1) {
               relMax++;
               if (relMax >= globalMaxRep) {
                  globalMaxRep = relMax;
                  index = i - 1;
               }
            }
            else {
               break;
            }
         }
      }
   }

   private static void Increment(int[] arr) {
      findLongestRep(arr);
      if (globalMaxRep == arr.length) {
         done = true;
         return;
      }
      int i = 0;
   	int currIndex = index;
      int temp = arr[currIndex + 1];
   	arr[currIndex + 1] = arr[currIndex++];
      while (i < globalMaxRep) {
          if (arr.length - 1 > currIndex) {
      	    int newTemp = arr[currIndex + 1];
             arr[++currIndex] = temp;
             temp = newTemp;
          }
          else {
             break;
          }
          i++;
      }
      if (arr.length - 1 > currIndex) {
         arr[currIndex] = temp;
      }
      else arr[index] = temp;
   }

   private static void printArr(int[] arr) {
      if (!done) {
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
      }
      else {
         System.out.println("[ ]");
      }
   }
   
   public static void main(String[] args) {
      int[] perm = new int[args.length];
      for (int i = 0; i < perm.length; i++) {
         perm[i] = Integer.parseInt(args[i]);
      }
      Increment(perm);
      printArr(perm);
   }
}