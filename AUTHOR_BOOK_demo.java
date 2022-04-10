/**AUTHOR : VS NIKHIL MAHESWAR 
 *DATE:10/04/2022
 *PROGRAM:TO DISPLAY THE DETAILS OF A BOOK(such as its name,author name,price...)
 * **/
package com.company;
class Author
{
    private  String firstName,lastName;
     Author(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastNameName()
    {
        return lastName;
    }
    public  String toString()
    {
        return ("Author's name = "+firstName+" "+lastName);
    }
}
class Book
{
    String title;
    Author name;
    Double price;
String Auname;
    public Book (String title, Author name, double price)
    {
        this.title=title;
        this.name=name;
        this.price=price;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
public void  setAuthor(String author)
{Auname =author;
    String firstName = author.split(" ")[0];
    String lastName = author.split(" ")[1];
    name.setFirstName(firstName);
    name.setLastName(lastName);
}
public  void setPrice(double price){
        this.price=price;
}
public String getTitle()
{
    return title;
}

    public Author getAuthor() {
        return name;
    }
    public  String toString()
    {
        return (getTitle()+"\n"+getAuthor()+"\nPrice:"+price);
    }
}
public class Main {

    public static void main(String[] args) {
        Author a=new Author("Russel","Winderand");
        Book bb=  new Book("Developing java Software",a,79.75);
        System.out.println(bb.toString());
    }
}
