import java.util.Scanner;

public class LuanaAssisSilva_1 {
    static boolean isPositive(float num){
        if (num > 0 ){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        float numero = teclado.nextFloat();
        if (isPositive(numero)){
            System.out.println(" É positivo. ");
        } else{
            System.out.println(" Não é positivo. ");
        }
        teclado.close();
    }
}
