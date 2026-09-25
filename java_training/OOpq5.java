// Create a class Book and 2 instance variables (bookTitle and pages). Class should have 2 constructors (Default and parameterized). parameterized constructor should initialize the value of it's class instance fields. No need to create method to display the information.
class Book{
    int pages ;
    String BookTitle;
    Book(){
        System.out.println("this is default constructor");
    }
    Book(int pages,String BookTitle){
        this.pages = pages;
        this.BookTitle=BookTitle;
        System.out.println(BookTitle+" "+ "have "+" "+pages);
    }
}
class OOPq5
{
    public static void main(String args[]){
        Book obj = new Book();
        Book obj1 = new Book(300,"Rough");
    }
}