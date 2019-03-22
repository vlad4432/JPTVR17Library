/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Melnikov
 */
public class Book {
   private String title;
   private String text;
   private Author[] authors;
   private int year;
   private int pages;
   
   public Book(){
   }

    public Book(String title, String text, Author[] authors, int year, int pages) {
        this.title = title;
        this.text = text;
        this.authors = authors;
        this.year = year;
        this.pages = pages;
    }
    public int wordsInText(){
        //тело метода
        while(this.text.indexOf("  ") > 0){
            this.text=this.text.replaceAll("  ", " ");
        }
        String[] myTextWords = this.text.split(" ");
        return myTextWords.length;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.title);
        hash = 43 * hash + Objects.hashCode(this.text);
        hash = 43 * hash + Objects.hashCode(this.authors);
        hash = 43 * hash + this.year;
        hash = 43 * hash + this.pages;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.pages != other.pages) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        if (!Objects.equals(this.authors, other.authors)) {
            return false;
        }
        return true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Книга: " + title 
                + ", текст книги=\"" + text 
                + "\",\n авторы книги =" + Arrays.toString(authors) 
                + ",\n год издания=" + year 
                + ", количество страниц: " + pages 
                + ", количество слов: " + this.wordsInText();
                
    }
   
}
