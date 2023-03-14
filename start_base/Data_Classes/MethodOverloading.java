package start_base.Data_Classes;

public class MethodOverloading {

    public void show(int a) {
        System.out.println(a);
    }

    public void show(double a) {
        System.out.println(a);
    }

    public void show(String a) {
        System.out.println(a);
    }

    public void show(float a) {
        System.out.println(a);
    }

    public void show(char a) {
        System.out.println(a);
    }

    public void show(boolean a) {
        System.out.println(a);
    }

    public void show(short a) {
        System.out.println(a);
    }

}

class MethodOverloadingTest {

    public static void main(String[] args) {
        MethodOverloading show = new MethodOverloading();

        show.show(2);
    }
}


