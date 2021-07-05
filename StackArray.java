class StackA{
    int arr[];
    int top=-1;

    StackA(){
        arr=new int[5];

    }
    StackA(int size){
        arr=new int[size];
    }

    void push( int data) throws Exception{

        if(this.top==arr.length-1){
            throw new Exception("Stack Overflow");
        }
        else{
            this.top++;
            this.arr[this.top]=data;
        }
    }
    void pop() throws Exception{
        if(this.top==-1){
            throw new Exception("Stack Underflow");
        }
        else{
            this.top--;
        }
    }
    int peek() throws Exception{
        if(this.top==-1){
            throw new Exception("Stack Underflow");
        }
        else{
            return this.arr[this.top];
        }
    }
    int size(){
        return this.top+1;
    }
    boolean empty(){
        return this.top==-1?true:false;
    }
}

class StackArray{
    public static void main(String []args) throws Exception{
        StackA st=new StackA();
        StackA st2=new StackA(10);


        st.push(20);
        st.push(30);
        st.push(40);
        st.pop();
        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}










