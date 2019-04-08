/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Melnikov
 */
public class AuthorCreator {

    private Scanner scanner = new Scanner(System.in);
    public Autor[] create(){
    System.out.printIn("Сколько авторов создать?...")
    } 
    public Author[] create(){
        Author tolstoy = new Author();
        tolstoy.setName("Лев");
        tolstoy.setSurname("Толстой");
        tolstoy.setYear(1828);
        Author petrov = new Author("Евгений", "Петров", 1902);
        Author ilf = new Author("Илья", "Ильф", 1897);
        Author gonsalves = new Author("Энтони", "Гонсалвес", 1985);
        Author blinov = new Author("Игорь", "Блинов", 1955);
        Author romanchik = new Author("Игорь", "Романчик", 1958);
        Author turgenev = new Author("Иван", "Тургенев", 1858);
        Author[] authors = {
            tolstoy,
            petrov,ilf,
            gonsalves,
            blinov,
            romanchik,
            turgenev
        };
        
        return authors;
    }
}
