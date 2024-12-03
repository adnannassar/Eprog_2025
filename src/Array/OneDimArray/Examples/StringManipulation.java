package Array.OneDimArray.Examples;

public class StringManipulation {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C++", "C#", "JavaScript", "Apple", "banana"};
        char letter = 'a';
        System.out.println("Number of a int the array: " + countLetter(array, letter)); // 7
    }

    private static int countLetter(String[] array, char letter) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            char[] word = array[i].toCharArray();
            for (int j = 0; j < word.length; j++) {
                if (word[j] == letter) {
                    count++;
                }
            }
        }
        return count;
    }
}
