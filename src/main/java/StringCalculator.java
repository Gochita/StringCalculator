import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private String[] list = null;

    public int emptyString(String num) {
        int numero = Integer.parseInt(num);
        if (num.isEmpty()) {
            return 0;
        } else {
            return numero;
        }
    }


    public int sumTwoNumbersByComaOrEnter(String num) {
        list = num.split("[,|\n]");
        int sum = 0;
        for (String elemento : list) {
            sum += Integer.parseInt(elemento);
        }
        return sum;
    }

    public int checkNumberOver1000(String num) {
        list = num.split("[,|\n]");
        int retornable;
        int numero = Integer.parseInt(num);
        if (numero > 1000) {
            retornable = 0;
        } else {
            retornable = numero;
        }
        return retornable;

    }

    public int negativeNumberCheck(String num) {
        list = num.split("[,|\n]");
        int retornable;
        int numero = Integer.parseInt(num);
        if (numero < 0) {
            throw new RuntimeException("El numero debe ser positvo");
        } else {
            return numero;
        }

    }

    public int differentDelimiter(String num, String delimiter) throws Exception {
        String[] listaModificada = null;
        num = num.replace(" ", "");
        delimiter = delimiter.replace(" ", "");
        Pattern pat = Pattern.compile(".*" + delimiter + ".*");
        Matcher mat = pat.matcher(num);
        int suma = 0;
        if (mat.matches()) {

            listaModificada = num.split(delimiter);
            for (String elemento : listaModificada) {
                suma += Integer.parseInt(elemento);
            }
            return suma;

        } else {
            throw new IllegalArgumentException("multiples delimitadores");
        }
    }

}





