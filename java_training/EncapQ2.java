// library book management 
// problem - create a Book class with private fields :title,author,available.Provide to borrowBook() and returnBook();
class Book{
    private String title;
    private String author;
    boolean available = true;
    public void setTitle(String title){this.title=title;}
    public String getTitle(){return title;}
    public void setAuthor(String author){this.author=author;}
    public String getAuthor(){return author;}
    public void borrowBook(){
        if(available == true){
        System.out.println("book Borrowed");
        available = false;
        }
        else{
            System.out.println("Book is not avaliable");
        }
    }
    public void returnBook()
    {
        if(available == false)
            {
        System.out.println("book returned");
        available = true;
        System.out.println("Book status Available: "+available);
        }
        else{
            System.out.println(available + "\n Book already returned");
        }
    }
}
public class EncapQ2
{
    public static void main(String args[])
    {
        Book b1 = new Book();
        b1.setAuthor("pk singh");
        b1.setTitle("aliens on planet");
        System.out.println(b1.getAuthor()+" "+b1.getTitle());
        b1.borrowBook();
        b1.returnBook();
    }
}