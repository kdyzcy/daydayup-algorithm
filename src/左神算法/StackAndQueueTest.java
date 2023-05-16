package 左神算法;

import java.util.*;


public class StackAndQueueTest {
    //用栈实现队列
    class MyQueue {
        Stack<Integer> stackIn;
        Stack<Integer> stackOut;
        public MyQueue() {
            stackIn=new Stack<>();
            stackOut=new Stack<>();
        }

        public void push(int x) {
            stackIn.push(x);
        }

        public int pop() {
            swapStack();
            return stackOut.pop();
        }

        public int peek() {
            swapStack();
            return stackOut.peek();
        }

        public boolean empty() {
            return stackOut.isEmpty()&&stackIn.isEmpty();
        }

        public void swapStack(){
            if(!stackOut.isEmpty()){
                return;
            }
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
    }

    //用栈实现队列
    class MyStack {
        Deque<Integer> que;
        public MyStack() {
            que=new ArrayDeque<>();
        }

        public void push(int x) {
            que.addLast(x);
        }

        public int pop() {
            int size=que.size();
            size--;
            while (size-->0){
                que.addLast(que.peekFirst());
                que.pollFirst();
            }
            int res=que.pollFirst();
            return res;
        }

        public int top() {
            return que.peekLast();
        }

        public boolean empty() {
            return que.isEmpty();
        }
    }
}
