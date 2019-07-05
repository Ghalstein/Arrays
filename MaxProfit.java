public class MaxProfit {
  	
   private static int sell = 0; // index of buying once for profit
   private static int buy = 0; // index of buying once for profit
   private static int relMin = 0; // The relMin for the part of the array it is running through
   private static int relMax = 0; // The rel max for the part of the array it is processing through
   
   private static void setup(double[] arr) {
      sell = arr.length - 1;  
      buy = arr.length - 2;
      relMin = arr.length - 2;
      relMax = arr.length - 1;
   }

   private static void compare(double[] arr, int sell, int buy) {
      if (arr[buy] < arr[relMin] && buy < sell) {
         relMin = buy;
      }
      if (arr[buy] > arr[relMax] && sell > buy) {
         relMax = buy;
         sell = buy;
      }
      if (buy == 0) {
         return;
      }
      compare(arr, sell, --buy);

   }

   public static void compare(double[] arr) {
      setup(arr);
      compare(arr, sell, buy);
   }

   public static double profit(double[] arr) {
      double difference = arr[relMax] - arr[relMin];
      if (difference > 0)
         return difference;
      else
         return 0.00;
   }

   public static void main(String args[]) {
      double[] arr = {200.0, 110.0, 150.0, 270.0, 155.0, 150.0};
      compare(arr);
      System.out.println("Profit: $" + profit(arr));
   }
}