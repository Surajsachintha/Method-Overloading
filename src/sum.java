public class sum {
    void sum (int a , long b) {
        System.out.println(a+b);
    }
    void sum (int c , int d) {
        System.out.println(c+d);
    }

    public static void main(String[] args) {
        sum s = new sum();
        s.sum (5, 123456789L);
        s.sum (10, 145);

    }
}
