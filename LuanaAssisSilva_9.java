import java.util.Scanner;
public class LuanaAssisSilva_9 {
    public static int fatorial (int n) {
        if (n > 0) {
            return n * fatorial(n - 1);
        }
        return 1;
    }
    public static String permutacao (int n){
        return "A permutação do número " +  n + ", é "+ fatorial(n);
    }
    public static int arranjo (int n , int k) {
        return fatorial(n)/fatorial(n-k);
    }
    public static int combinacao (int n , int k) {
        return fatorial(n)/(fatorial(k)*fatorial(n-k));
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int n = teclado.nextInt();
        System.out.println("Informe um número: ");
        int k = teclado.nextInt();
        if (k>n){
            System.out.println(permutacao(n));
            System.out.println("Não é possível realizar as operações, pois as fórmulas não funcionam.");
        }else {
            System.out.println(permutacao(n));
            System.out.println("O número de arranjo dos números " + n + " e " + k + " é " + arranjo(n, k));
            System.out.println("O número de combinações dos números " + n + " e " + k + " é " + combinacao(n, k));
        }
        teclado.close();
    }

}
