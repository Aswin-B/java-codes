package OOP;

public class Queue {
    int[] s = new int[10];
    int toq;
    int boq;

    Queue(){
        toq = -1;
        boq = 0;
    }

    void enqueue(int item){
        s[toq++] = item;
    }

    int dequeue(){

        return s[boq];

//        for(int i=0; i<s.length; i++){
//            if(i != (s.length - 1))
//                s[i] = s[i+1];
        }


}
