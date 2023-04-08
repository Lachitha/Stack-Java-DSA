class Stack{
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int s){
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;


    }//constructor

    public boolean isEmpty(){
        return top == -1;
    }//check stack is empty

    public boolean isFull(){
        return maxSize-1 == top ;
    }//check stack is full

    public void push(int number){
        if(isFull()){
            System.out.println("Stack is Full!");

        }else{
            top ++;
            stackArray[top] = number;
        }
    }//to insert elements in to stack

    public double pop(){
        if(isEmpty()){
            return -99;
        } else{
            return(stackArray[top--]);
        }
    }// to remove element from the stack

    public double peek(){
        if(isEmpty()){
            return -99;

        }else{
             System.out.println(stackArray[top]);
             return 0;
        }
    }//To display top value


    
}