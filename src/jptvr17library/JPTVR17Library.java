/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr17library;

import classes.Author;
import classes.AuthorCreator;
import classes.Book;
import classes.BookCreator;

/**
 *
 * @author Melnikov
 */
public class JPTVR17Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AuthorCreator authorCreator = new AuthorCreator();
        Author[] authors = authorCreator.create();
        BookCreator bookCreator = new BookCreator();
        bookCreator.setAuthors(authors);
        Book[] books = bookCreator.creator();
        for(int i=0;i<books.length;i++){
            if(books[i] != null){
               System.out.println(i+1+". "+books[i]); 
            }
            
        }
    }
    
}
