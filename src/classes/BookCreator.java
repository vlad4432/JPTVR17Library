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
        System.out.print("Название книги: ");
        book.setTitle(scanner.nextLine());
        System.out.print("Текст книги: ");
        book.setText(scanner.nextLine());
        int countAuthors=0;
        System.out.print("Сколько авторов у книги: ");
        countAuthors = scanner.nextInt();
        int n=0;
        int numAuthor = 0;
        Author[] authorsInBook = new Author[countAuthors];
        while(n < countAuthors){
            this.printAuthorsArray();
            System.out.println("Номер "+(n+1)+" автора в массиве: ");
            numAuthor= scanner.nextInt();
            authorsInBook[n]=authors[numAuthor];
            n++;
        }
        book.setAuthors(authorsInBook);
        System.out.print("Год издания: ");
        book.setYear(scanner.nextInt());
        System.out.print("Количество страниц: ");
        book.setPages(scanner.nextInt());
        scanner.nextLine();
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
            scanner.nextLine();
        }
        return books;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    private void printAuthorsArray(){
        for(int i=0;i<this.authors.length;i++){
           System.out.println(i+". "+this.authors[i]); 
        }
        
    }
    
}
