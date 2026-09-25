// class MovieTicket{
//     String MovieName;
//     int ticketPrice = 250;
//     int numberOfTickets;
//     int total;
//     void display(int numberOfTickets,String MovieName){
//         if((ticketPrice*numberOfTickets) >= 1000) {
//         total = (ticketPrice * numberOfTickets)- ((10 * (ticketPrice * numberOfTickets))/100);
//         System.out.println("After the discount the total amount is "+" "+total+" "+"of "+" "+MovieName);
//     }
//     else{
//         total = ticketPrice * numberOfTickets;
//         System.out.println("Total amount is "+ " "+ total);
//     }
//     }
// }
// class OOPq6{
//     public static void main(String args[]){
//         MovieTicket obj = new MovieTicket();
//         obj.display(4,"Vibe");
//     }
// }

class MovieTicket{
    String movieName;
    int ticketPrice=250;
    int numberOfTickets;
    int total;
    MovieTicket(String movieName,int numberOfTickets){
        this.movieName= movieName;
        this.numberOfTickets= numberOfTickets;
    }
    void calculateTotal(){
        total=ticketPrice*numberOfTickets;
    }
    void applyDiscount(){
    if(total>=1000){
        total=total-((10*total)/100);
        System.out.println("After the discount the total amount is "+total+" of "+movieName);
    }
    else{
        System.out.println("Total amount is "+total+" of "+movieName);
    }
    }
    }
class OOPq6{
public static void main(String args[]){
    MovieTicket obj=new MovieTicket("vibe",4);
    obj.calculateTotal();
    obj.applyDiscount();
}
}