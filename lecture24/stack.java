package lecture24;

public class stack {
    public class node {
        int data;
        node next;
        public node(int data) {
            this.data = data;
            this.next = null;
            }
            }
            public node head;
            public stack() {
                this.head = null;
                }
                public boolean isEmpty() {
                    return head == null;
                    }
                    public void push(int data) {
                        node newNode = new node(data);
                        if (head == null) {
                            head = newNode;
                            }
                            else {
                                newNode.next = head;
                                head = newNode;
                                }
                                }
                                public int pop() {
                                    if(head==null) return -1;
                                    Node temp = head;
                                    head = head.next;
                                    int data = temp.data;
                                    temp = null;
                                    return data;
                                    }
                                    public int peek() {
                                        if (head == null) return -1;
                                        return head.data;
                                        }
                                        public void printStack() {
                                            node temp = head;
                                            while (temp != null) {
                                                System.out.print(temp.data + " ");
                                                temp = temp.next;
                                                }
                                                System.out.println();
                                                }
                                                }



    
    
