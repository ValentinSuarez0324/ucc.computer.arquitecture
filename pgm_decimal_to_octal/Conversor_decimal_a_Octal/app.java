import java.util.Scanner;
public class app{
    public static void main(String[] args) {
        Scanner Capturar=new Scanner(System.in);
        operaciones operaciones = new operaciones();
        int num1;
        int num2;
        int resultado;
        System.out.println("Bienvenido al conversor de Numeros");
        System.out.println("1. Decimal a Octal");
        System.out.println("2. Octal a decimal");
        int opc = Capturar.nextInt();

        if (opc == 1){
            System.out.println("Ingresa un número decimal");
            num1 = Capturar.nextInt();
            String octal=operaciones.decimalAOctal(num1);
            System.out.println("El resultado es " + octal);

        } else if (opc == 2){
            System.out.println("Ingresa un número octal");
            String dato1 =Capturar.next();
            long dato2 =operaciones.octalADecimal(dato1);
            System.out.println("El resultado es "+ dato2);
        }
       
    }
}                     