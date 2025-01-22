# Library Management System

The Library Management System is an easy console based Java application that has many functions that simulates a real life Library management system. This application is designed for educational purposes and demonstrates the use of clases, lists and basic console interaction.


## Functions

1. **Adding a book in library**: this function can let users add a book by title and author and store the books in a list
2. **View all books**: this function can let users visualize all the books added by the users. This function also indicates if the book is borrowed or not.
3. **Search for a book**: this function allows the user to search for a book depending on the search filter that verifies the title or the author. When it's found it will display it on the console.
4. **Borrow a book**: this method allows users to borrow a book by the title. If the book is already borrowed it display that the book is unavailable and allows user to do another operation.
5. **Return a book**: this method is used to return a book back to the library. If the book is not borrowed it display that the book is available and allows user to do another operation.
6. **Exit the program**: this method is used so that the users can exit the program.

## Programming Language:

This program is made in Java.

## File structure

- **Books.java**: Represents a book with attributes like: title, author,  and status if the book is borrowed.
- **LibraryManagementSystem**: Manages the collection of books and provides methods for library operations.
- **Menu.java**: This class contains the main method and handles user interaction from console.

## Future improvements
- Integrate data storage using SQL
- Integrate a Spring-based backend for managing library operations instead of using a console-based application.
