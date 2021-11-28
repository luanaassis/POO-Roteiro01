import java.util.Scanner;
public class LuanaAssisSilva_0 {
    public static String mes (int numMes) {
       if (numMes == 1){
           return " Janeiro ";
       } else if (numMes == 2)  {
           return " Fevereiro ";
        } else if (numMes == 3)  {
           return " Março ";
       }else if (numMes == 4)  {
           return " Abril ";
       }else if (numMes == 5)  {
           return " Maio ";
       }else if (numMes == 6)  {
           return " Junho ";
       }else if (numMes == 7)  {
           return " Julho ";
       }else if (numMes == 8)  {
           return " Agosto ";
       }else if (numMes == 9)  {
           return " Setembro ";
       }else if (numMes == 10)  {
           return " Outubro ";
       }else if (numMes == 11)  {
           return " Novembro ";
       }else if (numMes == 12)  {
           return " Dezembro ";
       }else {
           return " Não há correspondência para esse mês. ";
       }
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num = teclado.nextInt();
        String a = mes(num);
        System.out.println(a);
        teclado.close();
    }
}
