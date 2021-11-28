import java.util.Scanner;

public class LuanaAssisSilva_5 {
    public static String bhaskara (double A, double B, double C) {
        double delta , X1, X2;
        delta = (B * B) - (4 * A * C);
        if (delta >=0){
            X1 = ((-B) + Math.sqrt(delta)) / (2 * A);
            X2 = ((-B) - Math.sqrt(delta)) / (2 * A);
            return "As raízes são: " + X1 + " e  " + X2;
        } else {
            return "As raízes não são reais. ";
        }
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um valor para  a : ");
        double a = teclado.nextDouble();
        System.out.println("Informe um valor para  b : ");
        double b = teclado.nextDouble();
        System.out.println("Informe um valor para  c : ");
        double c = teclado.nextDouble();
        System.out.println(" O valor das raízes são " + bhaskara(a, b, c));
        teclado.close();
    }
}
