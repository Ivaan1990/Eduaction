package MyStacks;

public class StacksMain {
    public static void main(String[] args) {
        Stack1 stack1 = new Stack1(4);

        stack1.addElement(45);
        stack1.addElement(35);
        stack1.addElement(25);
        stack1.addElement(15);

        System.out.println(stack1.readTop());
        //stack1.deleteElement();
        System.out.println(stack1.readTop());
        System.out.println(stack1.isFull());
    }
}
