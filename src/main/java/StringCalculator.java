public class StringCalculator {

    private String[] list = null;

    public int emptyString(String num){
        int numero= Integer.parseInt(num);
        if(num.isEmpty()){
            return 0;
        }else{
            return numero;
        }
    }


    public int sumTwoNumbersByComaOrEnter(String num){
        list = num.split("[,|\n]");
        int sum = 0;
        for (String elemento:list) {
            sum += Integer.parseInt(elemento);
        }
        return sum;
    }



}
