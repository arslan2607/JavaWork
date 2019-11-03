import java.util.*;

/* Arslan Khayrullin
 * ISTE-222
 * Queue, Stack, and Deque HW
 * 11/04/2019
 */

public class QueueStackDequeHW {
    public static void main(String[] args) {

        //Create a 2D Array to store transactions
        int[][] trans = {
                {100,20,0},
                {20,25,0},
                {50,35,0},
                {10,10,0},
                {150,30,1},
                {80,15,0},
                {70,25,1} };

        Stack<int[][]> stack = new Stack<int[][]>();

        //int[][] Tx1 = 100, 20, 0;

        stack.push(trans);
        //stack.pop();
        System.out.println("Print this:" + stack);



    }
}

