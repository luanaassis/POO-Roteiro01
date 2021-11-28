import java.util.Scanner;
public class LuanaAssisSilva_6 {
    public static double maiorNum (double numUm, double numDois) {
        if (numUm > numDois){
            return numUm;
        } else if (numDois > numUm ){
            return numDois;
        }  else {
            return 0;
        }
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número : ");
        double a = teclado.nextDouble();
        System.out.println("Informe um número : ");
        double b = teclado.nextDouble();
        if (maiorNum(a,b) == 0 ){
            System.out.println("São iguais.");
        } else{
            System.out.println("O maior número é " + maiorNum(a,b));
        }
        teclado.close();
    }
}
