package hw6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner xerox = new Scanner(System.in);
        System.out.println("Type percent to change price: ");
        int percent = xerox.nextInt();

        Scanner xeroxAuthors = new Scanner(System.in);
        System.out.println("Type author to sort datas: ");
        String newAuthor = xeroxAuthors.nextLine();

        Scanner xeroxYear = new Scanner(System.in);
        System.out.println("Type year to sort datas: ");
        int newYear = xeroxYear.nextInt();

        Books brownShelf = new Books(6);

        Book tmiab = new Book(3, "Three man in a boat", "Jerome", "Oxford",
                1889, 256, 15.5);
        Book dead = new Book(3, "Dead zone", "King", "Oxford",
                1894, 256, 23.3);
        Book dead2 = new Book(3, "Dead zone2", "King", "Oxford",
                1895, 256, 40);

        brownShelf.addBook(tmiab);
        brownShelf.addBook(dead);
        brownShelf.addBook(dead2);
        brownShelf.showAllBooks();
        brownShelf.changePrice(percent);
        brownShelf.showAllBooks();
        brownShelf.searchAuthor(newAuthor).showAllBooks();
        brownShelf.searchYear(newYear).showAllBooks();
    }
}
