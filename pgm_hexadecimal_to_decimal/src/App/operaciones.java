public class operaciones {
    public static int Suma (int dato1, int dato2) {
        int resultado = dato1+dato2; 
        return resultado;
    }
    public static String decimalAOctal(int decimal) {
        String octal = "";// Almacenamos el número octal que será el resultado
        String caracteresOctales = "01234567";
        while (decimal > 0) {
            int residuo = decimal % 8;
            // El residuo es lo que se suma, y podemos usarlo como índice
            // Recordemos que el carácter se pone "a la izquierda", por eso
            // concatenamos el carácter y luego lo que ya lleva sumado el octal
            octal = (caracteresOctales.charAt(residuo) + octal);
            // Lo vamos dividiendo entre 8 para que en algún momento llegue a 0
            decimal /= 8;
        }
        return octal;
    }
    public static long octalADecimal(String octal) {
        long decimal = 0;
        int potencia = 0;

        for (int x = octal.length() - 1; x >= 0; x--) {
            int valorActual = Character.getNumericValue(octal.charAt(x));
            long elevado = (long) Math.pow(8, potencia) * valorActual;
            decimal += elevado;
            potencia++;
        }
        return decimal;
    }
}


