public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.data = data;
            next = null;
        }
    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return (root == null);
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            StackNode x = root;
            root = root.next;
            return x.data;
        }
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        return root.data;
    }

    //Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}

// Time Complexity of push, pop and peek operations is O(1)
// Space Complexity of Stack is O(n) and space complexity of push, pop and peek operations is O(1)