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
        if(numero>1000){
            retornable=0;
        }else{
            retornable=numero;
        }
        return retornable;

    }

}




