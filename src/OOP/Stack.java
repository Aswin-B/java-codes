package OOP;

public class Stack {
    int[] s = new int[10];
    int tos;

    Stack(){
        tos = -1;
    }

    void push(int item){
        if(tos == (s.length - 1)){
            System.out.println("Stack is Fully loaded and unable to push and TOS is " + tos);
        }
        else {
            s[++tos] = item;
            System.out.println("Pushed an item: " + item + " at position " + tos);
        }
    }

    int pop(){
        if(tos > -1)
            return s[tos--];
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
}
