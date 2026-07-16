public class checkpallin2 {
    /*Given a string s, return true if the s can be palindrome after deleting at most one character from it.
    Example 1:
    Input: s = "aba"
    Output: true
    Example 2:
    Input: s = "abca"
    Output: true
    Explanation: You could delete the character 'c'.
     */

    public static void main(String[] args) {
        String str = "accddca";
        
        int l = 0 , r = str.length() - 1;
        
        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                if(isPallin(str , l + 1 , r) || isPallin(str , l , r - 1)){
                    System.out.println("true");
                    return;
                }
                
                else{
                    System.out.println("false");
                    return;
                }
            }
            r--;
            l++;
        }
        
        System.out.println("true");
    }
    
    private static boolean isPallin(String s , int l , int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
