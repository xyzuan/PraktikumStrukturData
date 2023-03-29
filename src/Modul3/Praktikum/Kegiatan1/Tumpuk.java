package Modul3.Praktikum.Kegiatan1;

public class Tumpuk {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Tumpuk(int a){
        maxSize = a;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j){
        stackArray[++top] = j;
    }

    public char pop(){
        return stackArray[top--];
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }
}
