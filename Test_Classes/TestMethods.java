package Test_Classes;

public class TestMethods {

    public static int sumThree(int x, int y, int z) {
        return x + y + z;
    }

    public static int averageSum(int a, int b, int c) {
        return sumThree(a, b, c) / 3;
    }

}

class testForTestMethods {

    public static void main(String[] args) {

        System.out.println(TestMethods.averageSum(3, 3, 4));

    }
}