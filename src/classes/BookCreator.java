/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class BookCreator {
    private Author[] authors;
    private Scanner scanner = new Scanner(System.in);
    
    public Book create(Author[] authors){
        Book book = new Book();
        System.out.println("-------Создание книги--------");
        System.out.println("Название книги: ");
        book.setTitle(scanner.nextLine());
        System.out.println("Текст книги: ");
        book.setText(scanner.nextLine());
        int numAuthors = 0;
        System.out.println("Номер автора в массиве: ");
        numAuthors= scanner.nextInt();
        book.setAuthors(new Author[]{authors[numAuthors]});
        System.out.println("Год издания: ");
        book.setYear(scanner.nextInt());
        System.out.println("Количество страниц: ");
        book.setPages(scanner.nextInt());
        return book;
    }
    public Book[] creator(){
        Book[] books = new Book[20];
        String stop = "r";
        int i=0;
        while("r".equals(stop)){
            books[i]=this.create(authors);
            i++;
            System.out.println("Для ввода еще одной книги нажмите r");
            stop = scanner.next();
        }
        return books;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    
}
