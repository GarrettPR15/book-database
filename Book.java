/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testonecode;
import java.util.ArrayList;
/**
 *
 * @author Garrett
 */
public class Book {
    public String title;
    public String author;
    public int numOfPages;
    
    public Book(String word, String name, int amount){
        title = word;
        author = name;
        numOfPages = amount;
    }
    
    public int getNumOfPages(){
        return numOfPages;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return "title: " + title + ", author: " + author;
    }
}
