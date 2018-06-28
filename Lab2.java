// Lab 2: ListNode

public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public void add(int value) {
        if (front == null) {
            // adding to an empty list
            front = new ListNode(value);
        } else {
            // adding to the end of an existing list
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void remove(int index) {
        if (index == 0) {
            // special case: removing first element
            front = front.next;
        } else {
            // removing from elsewhere in the list
            ListNode current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

}

// Question 2

// This program demonstrates the use of stacks and queues.
// It reads in a file of students' exam scores in reverse order, such as:
//
// Yeilding      Janet      87
// White         Steven     84
// Todd          Kim        52
//
// And first strips the ones who got 100 on the exam using a queue,
// then prints the rest in reverse order using a stack.
