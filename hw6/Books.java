package hw6;

public class Books {

    private Book[] bookshell;
    private int amount;

    public Books(int amount) {
        this.amount = amount;
        bookshell = new Book[amount];
    }


    public Book[] getBookshell() {
        return bookshell;
    }

    public int getAmount() {
        return amount;
    }

    public void addBook(Book newBook) {

        int counter = 0;

        for (Book elem : bookshell){

            if (elem != null) {
                counter++;
                continue;
            } else {
                bookshell[counter] = newBook;
                break;
            }

        }

    }

    public void showAllBooks() {

        for (Book elem : bookshell){

            if (elem == null) {

                break;
            }

            elem.view();

        }

    }

    public void changePrice(int percent) {

        for (int i = 0; i < bookshell.length; i++){

            if (bookshell[i] == null) {
                break;
            }

            double firstPrice = bookshell[i].getPrice();
            double newPrice = firstPrice + firstPrice * percent * 0.01f;
            bookshell[i].setPrice(newPrice);

        }
    }

    public Books searchAuthor(String author) {

        Books sortedAuthors = new Books(amount);
        int amountBook = 0;

        for (int i = 0; i < bookshell.length; i++){
            if (bookshell[i] == null) {
                break;
            }
            String newAuthor = bookshell[i].getAuthor();

            if (author.equals(newAuthor)) {
                sortedAuthors.bookshell[amountBook] = bookshell[i];
                amountBook++;
            } else {
                continue;
            }
        }

        return sortedAuthors;
    }

    public Books searchYear(int year) {

        Books sortedYear = new Books(amount);
        int amountBook = 0;

        for (int i = 0; i < bookshell.length; i++){
            if (bookshell[i] == null) {
                break;
            }
            int newYear = bookshell[i].getYear();

            if (year == newYear) {
                sortedYear.bookshell[amountBook] = bookshell[i];
                amountBook++;
            } else {
                continue;
            }
        }
        return sortedYear;
    }
}
