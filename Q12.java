// Question: https://www.hackerrank.com/challenges/maximum-element/problem

import java.util.Scanner;

public class Hackerrank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, i;

        n = scan.nextInt();
        
        StackArray obj = new StackArray(n);

        for (i = 0; i < n; i++) {
            int val = scan.nextInt();

            if (val == 1) {
                int data = scan.nextInt();
                obj.push(data);
            }
            
            else if(val == 2) {
                obj.pop();
            }
            
            else if(val == 3) {
                System.out.println(obj.max());
            }
        }

    }

}

class StackArray {

    int top, n;
    int stackdata[];

    public StackArray(int s) {
        top = -1;
        n = s;
        stackdata = new int[n];
    }

    public void push(int data) {

        stackdata[top+1] = data;
        top++;
    }
    
    public void pop() {
        top--;
    }
    
    public int max() {
        int max = stackdata[0];
        
        for(int i = 0; i <= top; i++) {
            if(max < stackdata[i]) {
                max = stackdata[i];
            }
        }
        return max;
    }
}
