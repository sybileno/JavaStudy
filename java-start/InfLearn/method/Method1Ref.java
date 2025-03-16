package method;

public class Method1Ref {
    public static void main(String[] args) {

        int sum = add(5, 10);
        System.out.println("a + b = " + sum);

        int sum2 = add(10, 20);
        System.out.println("a + b = " + sum2);

    }
        public static int add(int a, int b) {
            int sum = a + b;
            return sum;

        }
}

