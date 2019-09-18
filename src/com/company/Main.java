package com.company;
import java.util.Scanner;

public class Main {
    // Using the code from the previous "Inheritance completion activity #1",
    // create an override of the equals method for the superclass, and Book and Software subclasses.
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        System.out.print("Enter the Book Code: ");
        String code = keybd.nextLine();

        Book b = new Book();
        b.setCode(code);
        b.setAuthor("Dave W.");
        b.setPrice(59.99);
        b.setDescription("Java programming book");
        System.out.println(b.toString());

        Book c = new Book();
        c.setCode("Book 8910");
        c.setAuthor("Tolkien");
        c.setPrice(49.99);
        c.setDescription("Python programming book");
        System.out.println(c.toString());

        Software s = new Software();
        s.setCode("Program1234");
        s.setDescription("Spreadsheet");
        s.setPrice(999.99);
        s.setOs("Windows");
        s.setProgrammer("Fi");
        System.out.println(s.toString());
    }
}
