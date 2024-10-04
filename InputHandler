package com.example;
import java.util.Scanner;

public class InputHandler {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        String command;
        
        System.out.println("Enter commands to manipulate the linked list (addFirst, addLast, addAt, removeValue, removePos, traverse, search, reverse, exit):");

        while (true) {
            command = scanner.nextLine();
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "addFirst":
                    list.addFirst(Integer.parseInt(parts[1]));
                    break;
                case "addLast":
                    list.addLast(Integer.parseInt(parts[1]));
                    break;
                case "addAt":
                    list.addAtPosition(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    break;
                case "removeValue":
                    list.removeByValue(Integer.parseInt(parts[1]));
                    break;
                case "removePos":
                    list.removeByPosition(Integer.parseInt(parts[1]));
                    break;
                case "traverse":
                    list.traverse();
                    break;
                case "search":
                    int position = list.search(Integer.parseInt(parts[1]));
                    if (position != -1) {
                        System.out.println("Element found at position: " + position);
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                case "reverse":
                    list.reverse();
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
