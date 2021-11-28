import java.util.Scanner;

public class LuanaAssisSilva_3 {
    static boolean isEven(float num){
        if (num%2 == 0 ){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        float numero = teclado.nextFloat();
        if (isEven(numero)){
            System.out.println(" É par. ");
        } else{
            System.out.println(" Não é par. ");
        }
        teclado.close();
    }
}
