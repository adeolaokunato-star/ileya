import java.util.Scanner;

public class BookSuggestionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] books = {"The Hobbit", "The Great Gatsby", "1984", "To Kill a Mockingbird", "Animal Farm"};
        int bookCount = 5;

        System.out.println("Welcome to the Book Suggestion System!");

        while (true) {
            System.out.println("1. Get Suggestions");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Update Book");
            System.out.println("5. Show All Books");
            System.out.println("0. Exit");
            System.out.print("Enter operation: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    String answer = "yes";
                    while (answer.equals("yes")) {
                        System.out.println("Book for the Day:");
                        System.out.println("  Book Title: " + books[0]);
                        System.out.print("Would you like another suggestion? (yes/no): ");
                        answer = scanner.nextLine();
                    }
                    break;

                case "2":
                    System.out.print("Enter the book title: ");
                    String title = scanner.nextLine();
                    int addIndex = -1;
                    for (int index = 0; index < bookCount; index++) {
                        if (books[index].equalsIgnoreCase(title)) {
                            addIndex = index;
                            break;
                        }
                    }
                    if (addIndex != -1) {
                        System.out.println("That book already exists!");
                    } else {
                        books[bookCount] = title;
                        bookCount++;
                        System.out.println("Book added successfully!");
                    }
                    break;

                case "3":
                    System.out.print("Enter the book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    int removeIndex = -1;
                    for (int index = 0; index < bookCount; index++) {
                        if (books[index].equalsIgnoreCase(removeTitle)) {
                            removeIndex = index;
                            break;
                        }
                    }
                    if (removeIndex == -1) {
                        System.out.println("Book not found.");
                    } else {
                        for (int count = removeIndex; count < bookCount - 1; count++) {
                            books[count] = books[count + 1];
                        }
                        bookCount--;
                        System.out.println("Book removed successfully!");
                    }
                    break;

                case "4":
