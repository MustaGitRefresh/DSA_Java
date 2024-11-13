import java.util.Locale;
import java.util.StringTokenizer;

public class repeatCounter {
    String fresh;

    public static void main(String[] args) {
        repeatCounter repeat = new repeatCounter("Hello");
    }

    repeatCounter(String text){
        String original = text;
        takeWord(original);
        System.out.println(fresh);
    }
    void takeWord(String text){
        StringTokenizer st = new StringTokenizer(text);
        int counter = st.countTokens()-1;
        while(counter > -1){
            duplicate(st.nextToken());
            counter--;
        }
    }

    void duplicate(String word){
        // hello -> character is freq more than 1 than not add that char
        char prevChar = ' ';
        for(int i=0;i<word.length();i++){
            if(prevChar != word.charAt(i)){
                fresh = fresh + word.charAt(i);
            }
            prevChar = word.charAt(i);
        }
    }
}
