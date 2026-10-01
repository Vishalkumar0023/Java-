// A shoppping portal allows customer to pay using different payment methods
// credit car or upi 
// each payment method has its own way  processing
// use polymorphism 


class Payment 
    {
        void pay(double amount) {
            System.out.println("Payment processing: " + amount);
        }
    }

class CreditCard extends Payment 
    {
        void pay(double amount) {
            System.out.println("Payment done using Credit Card: " + amount);
        }
    }

class UPI extends Payment 
    {

        void pay(double amount) {
            System.out.println("Payment done using UPI: " + amount);
        }
    }

public class PolymorphismQ1 
    {
        public static void main(String[] args) 
        {
            Payment p;
            p = new CreditCard();
            p.pay(2000);
            p = new UPI();
            p.pay(1500);
        }
    }