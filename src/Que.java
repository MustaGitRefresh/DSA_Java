class Que{
    int[] queue;
    int front, rear;
    Que(int size){
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    void add(int data){
        if(rear == queue.length-1){
            System.out.println("The que overflows");
        }
        else if(rear == -1 && front == -1){
            front++;
            rear++;
            queue[rear] = data;
        }
        else{
            rear++;
            queue[rear] = data;

        }
    }
    int pop(){
        if(rear == -1){
            System.out.println("The que is empty");
            return -999;
        }
        int val = queue[front];
        front ++;
        return val;
    }

    void display(){
        // printing the array
        System.out.println("The elements are.");
        for(int i=0;i<queue.length;i++){
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        Que q = new Que(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println(q.pop());
    }
}