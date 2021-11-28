import java.util.Scanner;
public class LuanaAssisSilva_4 {
    public static double delta (double A, double B, double C) {
        double del = (B*B) - (4*A*C);
        return (del);
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um valor para  a : ");
        double a = teclado.nextDouble();
        System.out.println("Informe um valor para  b : ");
        double b = teclado.nextDouble();
        System.out.println("Informe um valor para  c : ");
        double c = teclado.nextDouble();
        System.out.println(" O valor de delta é " + delta(a, b, c));
        teclado.close();
    }
}
