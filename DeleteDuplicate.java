public class DeleteDuplicate {
   private static int size = 0; // default size of array

   private static int sizeOfArray (int[] arr) {
      size = arr.length;
      return size;
   }

   // exchanges the element in the array until it hits zero
   private static void exchToEnd (int[] arr, int element1, int element2) {
      if (arr[size - 1] == 0) {
         size--;
         return;
      }
      int temp = arr[element1];
      arr[element1] = arr[element2];
      arr[element2] = temp;
      exchToEnd(arr, element2, element2 + 1);
   }
   
   public static void findDuplicate (int[] arr) {
      sizeOfArray(arr);
      for (int i = 0; i < size - 1; i++) {
         if (arr[i] == arr[i + 1]) {
            arr[i + 1] = 0;
            exchToEnd(arr, i + 1, i + 2);
         }
      }
   }

   public static void main (String args[]) {
      int[] testArr = {1,2,3,3,4,5,5,6,7,8};
      findDuplicate(testArr);
      for (int i = 0; i < testArr.length; i++) {
         System.out.println(testArr[i]);
      }
   }
}