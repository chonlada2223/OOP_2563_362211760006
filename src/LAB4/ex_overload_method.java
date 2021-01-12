package LAB4;

public class ex_overload_method {
    public static void main(String[] args) {
        int x = sum(5,5);
        double y = sum(20.2,10.1);
    }

    private static double sum(double v, double v1) {
        return v+v1;
    }

    private static int sum(int i, int i1) {

        return i+i1;
    }
}
