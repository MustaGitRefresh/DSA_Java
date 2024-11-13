public class StringDecoder {

    public static void main(String[] args) {
        String test = "482356";
        String reversed = "";
        String decode = "";
        for (int i=test.length()-1;i!=-1;i--){
            reversed += test.charAt(i);
        }
        int pos = 0;
        while(true){
            // digit to int
            int digit = Integer.parseInt(reversed);
            if(digit == 32){
                decode += " ";
            }
            else if(digit >= 65 && digit <=90){
                decode += (char)digit;
                pos+=2;
            }
            else{
                reversed = reversed.substring(pos);
                break;
            }
        }
        System.out.println(decode);
    }
}
