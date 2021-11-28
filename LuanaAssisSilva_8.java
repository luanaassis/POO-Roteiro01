import java.util.Scanner;
public class LuanaAssisSilva_8 {
    public static int fatorial(int num) {
        if (num > 0) {
            return num * fatorial(num - 1);
        }
        return 1;
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = teclado.nextInt();
        System.out.println(" O fatorial é " + fatorial(numero));
        teclado.close();
    }
}
