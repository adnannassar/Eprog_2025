package AllegemeineNotizen;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        boolean result = x == y; // richtig!

        Student s1 = new Student("Tom", 20);
        Student s2 = new Student("Tom", 20);
        boolean result2 = s1.equals(s2); // richtig!

        String name1 = "Tom";
        String name2 = "Sara";
        boolean result3 = name1.equals(name2); // richtig!

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean result4 = arr1 == arr2; // falsch!
        boolean result5 = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                result5 = false;
                break;
            }
        }
        float nr = 16;
        float nr2 = 5;
        System.out.println(nr / nr2);


    }

    static class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
