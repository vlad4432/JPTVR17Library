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
//        System.out.println(tolstoy.toString());
//        System.out.println(petrov.toString());
//        System.out.println(ilf.toString());
        
        Author[] authors ={tolstoy};
        
        Book voinaIMir = new Book();
        voinaIMir.setTitle("Война и мир");
        voinaIMir.setText("Текст книги");
        voinaIMir.setAuthors(authors);
        voinaIMir.setYear(2019);
        voinaIMir.setPages(1564);
        
        //System.out.println(voinaIMir.toString());
        
        Author[] authors2 ={ilf,petrov};
        Book zolotoyTeljonok = new Book();
        zolotoyTeljonok.setTitle("Золотой теленок");
        zolotoyTeljonok.setText("text книги");
        zolotoyTeljonok.setAuthors(authors2);
        zolotoyTeljonok.setYear(2018);
        zolotoyTeljonok.setPages(560);
        //System.out.println(zolotoyTeljonok.toString());
        Book[] books = new Book[5];
        books[0]=voinaIMir;
        books[1]=zolotoyTeljonok;
        Author gonsalves = new Author("Энтони", "Гонсалвес", 1985);
        Author[] authors3 = {gonsalves};
        Author blinov = new Author("Игорь", "Блинов", 1955);
        Author romanchik = new Author("Игорь", "Романчик", 1958);
        Author[] authors4 = {blinov,romanchik};
        books[2]=new Book("Изучаем Java EE 7", "text book",authors3,2015,376);
        books[3]=new Book("Меторы программирования на Java","text book",authors4,2007,490);
        Author turgenev = new Author("Иван", "Тургенев", 1858);
        Author[] authors5 = {turgenev};
        books[4]= new Book("Отцы и дети","текст книги",authors5,2007,367);
        for(int i=0;i<books.length;i++){
            System.out.println(i+1+". "+books[i].toString());
        }
    }
    
}
