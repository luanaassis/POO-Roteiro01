import java.util.Scanner;

public class LuanaAssisSilva_2 {
    static boolean isZero(float num){
        if (num == 0 ){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        float numero = teclado.nextFloat();
        if (isZero(numero)){
            System.out.println(" É nulo. ");
        } else{
            System.out.println(" Não é nulo. ");
        }
        teclado.close();
    }
}
