public class str2darr {
    public static void main(String[] args) {
        // 4 string words are given and len is 4 , create 2d arr every element char is the element in array
        String[] words = {"name", "game", "Java", "nice"};
        int rows = words.length;
        int cols = words[0].length();
        char[][] charArray = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                charArray[i][j] = words[i].charAt(j);
            }
        }

        // Print the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}