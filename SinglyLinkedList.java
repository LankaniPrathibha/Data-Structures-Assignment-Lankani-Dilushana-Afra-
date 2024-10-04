package com.example;

public class SinglyLinkedList {
    private Node head;
    private int size;

     // Constructor to initialize the linked list
     public SinglyLinkedList() {
        this.head = null; // Initially, the head is null
        this.size = 0;    // Initially, the size is 0
     }

     //2. singly linkedlist operations 

     // 2.1. Add a node to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // 2.2. Add a node to the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // 2.3. Add a node at a specific position
    public void addAtPosition(int data, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    // 2.4. Remove a node by value
    public void removeByValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    // 2.4. Remove a node by position
    public void removeByPosition(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    // 2.5. Find the size of the list
    public int size() {
        return size;
    }

    // 2.6. Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // 3. Traverse the list and print each node's data
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 4. Search for an element in the list
    public int search(int data) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == data) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1; // Not found
    }

    // Reverse the linked list
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; // Store next node
            current.next = previous; // Reverse the link
            previous = current; // Move previous to current
            current = next; // Move to next node
        }
        head = previous; // Update head to new front
    }
    
}
