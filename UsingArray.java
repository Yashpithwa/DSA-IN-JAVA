class UsingArray {
    int top;
    int size;
    int arr[];

   
    UsingArray(int n) {
        top = -1;
        size = n;
        arr = new int[n];
    }

    void push(int pushNumber) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = pushNumber;
            System.out.println("Pushed: " + pushNumber);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println("Popped: " + arr[top]);
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }

    public static void main(String args[]) {
        UsingArray st = new UsingArray(5);  
        st.push(4);
        st.push(3);
        st.pop();
        st.peek();
    }
}
