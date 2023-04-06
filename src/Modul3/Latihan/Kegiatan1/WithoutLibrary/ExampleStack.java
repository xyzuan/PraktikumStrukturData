package Modul3.Latihan.Kegiatan1.WithoutLibrary;

import java.util.Stack;

public class ExampleStack {
    private int maxSize;
    private int top;
    private String[] stackArray;

    public ExampleStack(int size) {
        maxSize = size;
        top = -1;
        stackArray = new String[maxSize];
    }

    public void push(String value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
        } else {
            System.out.println("");
        }
    }

    public String pop() {
        if (top >= 0) {
            String value = stackArray[top];
            top--;
            return value;
        } else {
            System.out.println("");
            return "";
        }
    }

    public String peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return "";
        }
    }

    public boolean empty() {
        return top == -1;
    }

    public int search(String value) {
        for (int i = top; i >= 0; i--) {
            if (stackArray[i].equals(value)) {
                return top - i + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Stack st = new Stack();

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : "+st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
