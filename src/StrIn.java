public class StrIn {
    void Str (double a) {
        System.out.println("Number");
    }
    void Str (String b) {
        System.out.println("Suraj");
    }

    public static void main(String[] args) {
        StrIn d = new StrIn();

        d.Str("Suraj");
        d.Str(32.54);
    }
}
