public class checkpallin {
    public static void main(String[] args) {
        String str = "great";
        int l = 0 , r = str.length() - 1;

        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                System.out.println("Not a palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("It is a palindrome");
    }
}
