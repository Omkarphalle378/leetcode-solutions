class MyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {

    }

    public int get(int index) {
        Node curr = head;
        int i = 0;
        while (curr != null) {
            if (i == index) {
                return curr.data;
            }
            curr = curr.next;
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }

    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        Node curr = head;
        int i = 0;
        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }
        while (curr != null) {
            if (index == i + 1) {
                node.next = curr.next;
                curr.next = node;
                return;
            }
            curr = curr.next;
            i++;
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null)
            return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node curr = head;
        int i = 0;

        while (curr != null) {
            if (index == i + 1 && curr.next != null) {
                curr.next = curr.next.next;
                return;
            }

            curr = curr.next;
            i++;
        }
    }
}
