package stack;

import java.util.Stack;

public class PreviousSmallestElement {

    public static void main(String args[]){

        int a[] = {4,10,5,18,3,12,7};

      printPreviousSmallestElement(a);

    }

    public static void printPreviousSmallestElement(int a[]) {

        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < a.length; i++){
            while (!integerStack.isEmpty() && integerStack.peek() >= a[i]){
                integerStack.pop();
            }
            if (integerStack.isEmpty()){
                System.out.print(" -1 ");
            } else {
                System.out.print(integerStack.peek()+" ");
            }

            integerStack.push(a[i]);

        }

    }
}
