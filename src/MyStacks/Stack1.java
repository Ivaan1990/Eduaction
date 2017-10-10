package MyStacks;

public class Stack1 {

    private int maxSize;
    private int[] stackArray;
    private int top; // верхний элемент стека

    public Stack1 (int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[this.maxSize];
        top = -1;
    }

    public void addElement (int element) {
        stackArray [++top] = element;
    }

    public int deleteElement () {
        return stackArray[--top];
    }

    public int readTop () {
        return stackArray[top];
    }

    public boolean isEmpty () { // возвращает true есть стек пустой
        return (top == -1);
    }

    public boolean isFull () { // возвращает true если стек полный
        return (top == maxSize - 1);
    }
}
