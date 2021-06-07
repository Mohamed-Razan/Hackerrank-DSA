// Question: https://www.hackerrank.com/challenges/queue-using-two-stacks/problem

import java.util.Scanner;

public class Hackerrank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, i;

        n = scan.nextInt();
        
        QueueArray obj = new QueueArray(n);

        for (i = 0; i < n; i++) {
            int val = scan.nextInt();

            if (val == 1) {
                int data = scan.nextInt();
                obj.enqueue(data);
            }
            
            else if(val == 2) {
                obj.dequeue();
            }
            
            else if(val == 3) {
                System.out.println(obj.displayFront());
            }
        }

    }

}

class QueueArray {
    
    int max, nElements, front, rear;
    int queueData[];

    public QueueArray(int s) {
        rear = -1;
        front = 0;
        max = s;
        nElements = 0;
        queueData = new int[s];
    }
    
    public void enqueue(int data) {
        rear = (rear + 1) % max;
        queueData[rear] = data;
        nElements++;
    }
    
    public void dequeue() {
        front++;
        nElements--;
    }
    
    public int displayFront() {
        return queueData[front];
    }
}
