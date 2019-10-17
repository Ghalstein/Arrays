public class RemoveDuplicates {

  public int removeDuplicates(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
        if (!set.contains(num)) {
            set.add(num);
        }
    }
    
    int[] newArr = new int[set.size()];
    
    int i = 0;
    
    for (int num : set) {
        newArr[i++] = num;
    }
    
    nums = newArr;
    
    return set.size();
  }

  public static void main(String[] args) {
    int[] test = {1, 2, 2};
    System.out.println(RemoveDuplicates(test));
  }
}