/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr17library;

import classes.Author;
import classes.Book;

/**
 *
 * @author Melnikov
 */
public class JPTVR17Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author tolstoy = new Author();
        tolstoy.setName("Лев");
        tolstoy.setSurname("Толстой");
        tolstoy.setYear(1828);
        Author petrov = new Author("Евгений", "Петров", 1902);
        Author ilf = new Author("Илья", "Ильф", 1897);
        System.out.println(tolstoy.toString());
        System.out.println(petrov.toString());
        System.out.println(ilf.toString());
        
        Author[] authors ={tolstoy};
        
        Book voinaIMir = new Book();
        voinaIMir.setTitle("Война и мир");
        voinaIMir.setText("Текст книги");
        voinaIMir.setAuthors(authors);
        voinaIMir.setYear(2019);
        voinaIMir.setPages(1564);
        
        System.out.println(voinaIMir.toString());
        
    }
    
}
