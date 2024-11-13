import java.util.Scanner;

/*
* vat = 22 1 20 -> 22120
* sum of digits powered(2)
* continuous until the result is one
* */
public class HappyWord {
    String word;
    public static void main(String[] args) {
        HappyWord happy = new HappyWord();
        happy.takeInput();
        long temp = happy.lettersToPosition(happy.word);
        boolean isHappyWord = happy.isHappy(temp);
        System.out.println("The input word is " + happy.word);
        System.out.println("The value is " + temp);
        if(isHappyWord){
            System.out.println("The word is happy word");
        }
        else{
            System.out.println("Not a happy number");
        }
    }

    private boolean isHappy(long num) {
        int sum = 0;
        while (num != 0){
            sum+= (int) Math.pow(num%10, 2);
            num /= 10;
        }
        if(sum == 1){
            return true;
        }
        if(sum > 9) {
            return isHappy(sum);
        }
        else{
            return false;
        }
    }

    private long lettersToPosition(String input) {
        // initials
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int[] pos = new int[letters.length()];
        int start = 1;
        int i;
        for (i = 0; i < pos.length; i++) {
            pos[i] = start;
            start++;
        }
        // making positions alignment.
        String group = "";
        for(int j=0;j<input.length();j++){
            group += pos[letters.indexOf(input.charAt(j))];
        }
        System.out.println(word);
        return Long.parseLong(group);
    }

    private void takeInput() {
        // taking the input.
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine().toLowerCase().trim();
    }
}
