public class changecase {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); //Non-alphabetic characters remain unchanged
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Changed Case String: " + result.toString());
    }
}
