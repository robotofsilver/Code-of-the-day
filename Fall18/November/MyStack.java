//Written by Martin Lennan
public class MyStack {
    int[] stackArray;
    int stackPointer;

    public MyStack(int size) {
        stackArray = new int[size];
        stackPointer = 0;
    }

    public void push(int num) {
        if (stackPointer < stackArray.length) {
            stackArray[stackPointer] = num;
            stackPointer++;
        }
    }

    public int pop() {
        if (stackPointer > 0) {
            stackPointer--;
            int toReturn = stackArray[stackPointer];
            return toReturn;
        }
        return -999;
    }

    public int peek() {
        if (stackPointer > 0) {
            return stackArray[stackPointer - 1];
        }
        return -999;
    }
    
    public boolean isEmpty() {
        if (stackPointer == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < stackPointer; i++) {
            s += stackArray[i] + " | ";
        }
        return s;
    }
}
