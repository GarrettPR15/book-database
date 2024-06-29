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
public class Series {
    private String title;
    private String author;
    
    public ArrayList<Book> books = new ArrayList<>();
    
    private static int numOfSeries = 0;
    
    public Series(Book work){
	books.add(work);
        numOfSeries++;
    }
    
    public void setAuthor(String name){
        author = name;
    }
    
    public void setTitle(String name){
        title = name;
    }
    
    public void addBook(Book work){
        books.add(work);
    }
    
    public void removeBook(int number){
        books.remove(books.get(number));
    }
    
    public ArrayList<Book> getBooks(){
        return books;
    }
    
    public void readBook(String name){
        for(int i = 0; i < books.size(); i++){
            if (books.get(i).getTitle().equals(name)){
                System.out.println("Author: " + books.get(i).getAuthor());
                System.out.println("Pages: " + books.get(i).getNumOfPages());
            }
        }
    }
    
    public int getTotalNumOfPages(){
        int total = 0;
        for(int i = 0; i < books.size(); i++){
            total += books.get(i).getNumOfPages();
        }
        return total;
    }
    
    @Override
    public String toString(){
        return "author: " + author + "title: " + title + "books: " + books.toString();    
    }
    
    public static int getNumOfSeries(){
        return numOfSeries;
    }
}
