package stek;

/**
 * Created by Asus on 09.03.2017.
 */
class Stack {

    private int maxSize;
    private char[] StackArray;

    Stack (int size) {

        StackArray = new char[size];

    }

    char pop () {

        return StackArray [--maxSize];

    }

    void push (char a) {

        StackArray [maxSize++] = a;
        System.out.print(a + " ");

    }

}




