public class wordPile {
    int capacity, top;
    char[] ch;

    wordPile(int cap){
        capacity = cap;
        top = -1;
        ch = new char[cap];
    }
    void push(char data){
        if(top == capacity-1){
            System.out.println("The pile is OVERFLOW");
        }
        else {
            top++;
            ch[top] = data;
        }
    }
    char pop(){
        if(capacity == -1){
            System.out.println("The pile is UNDERFLOW");
        }
        char val = ch[top];
        top--;
        return val;
    }
}
