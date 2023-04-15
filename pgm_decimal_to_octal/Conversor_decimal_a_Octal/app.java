import java.util.Scanner;
public class app{
    public static void main(String[] args) {
        Scanner Capturar=new Scanner(System.in);
        operaciones operaciones = new operaciones();
        int num1;
        int num2;
        int resultado;
        System.out.println("Bienvenido al programa de sumas");
        System.out.println("Ingresa un número");

        num1 = Capturar.nextInt();
        System.out.println("Ingresa un segundo número");
        num2 = Capturar.nextInt();
        //resultado = num1 + num2;

        System.out.println("El resultado es " + operaciones.Suma(num1, num2) );



 }
public static int Suma (int dato1, int dato2) {
    int resultado = dato1+dato2; 
    return resultado;
}

}           