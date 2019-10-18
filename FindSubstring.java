public class FindSubstring {

  public static int strStr(String haystack, String needle) {
    // have a string and substring to search for linearly within the string
    // iterator for substring
    int j = 0;
    for (int i = 0; i < haystack.length(); ++i) {
      
      if (needle.equals("")) return 0;
      if (needle.length() > haystack.length()) return -1;
      if (haystack.charAt(i) == needle.charAt(j)) {
        ++j;
        if (j == needle.length()) return ++i - needle.length();
      }
      else {
        // acounts for any patterns overshadowing the correct answer
        if (j != 0) i -= j;
        j = 0; 
      }
    }
    
    if (j == needle.length()) return haystack.length() - needle.length();
    
    return -1;
  }
  public static void main(String[] args) {
    System.out.println("mississippi: pi " + strStr("mississippi", "pi"));
    System.out.println("mississippi: issi " + strStr("mississippi", "issi"));
    System.out.println("mississippi: issip " + strStr("mississippi", "issip"));
  }
}