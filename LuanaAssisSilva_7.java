import java.util.Scanner;
public class LuanaAssisSilva_7 {
    public static double media (int vetor[]) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return (soma/vetor.length);
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de números: ");
        int qtd = teclado.nextInt();
        int vetor[] = new int[qtd];
        for( int i = 0; i < qtd; i++ ){
            System.out.println("Informe um número: ");
            vetor[i] = teclado.nextInt();
        }
        System.out.println(" A média é " + media(vetor));
        teclado.close();
    }
}
