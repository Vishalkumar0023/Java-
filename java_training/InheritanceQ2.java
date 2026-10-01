// create an ionterface player with method play create a abstarct class sports perosn with commaon property name classes cricketer and footballer extends sports person and implement players  

interface Player 
    {
        void play();
    }

abstract class SportsPerson 
    {
        String name;

        SportsPerson(String name) 
        {
            this.name = name;
        }

        void displayName() 
        {
            System.out.println("Name: " + name);
        }
    }

class Cricketer extends SportsPerson implements Player {

    Cricketer(String name) 
    {
        super(name);
    }
    public void play() {
        System.out.println(name + " plays cricket");
    }
}

class Footballer extends SportsPerson implements Player {

    Footballer(String name) 
    {
        super(name);
    }
    public void play() 
    {
        System.out.println(name + " plays football");
    }
}

public class InheritanceQ2 {
    public static void main(String[] args) 
    {
        Cricketer c = new Cricketer("Virat");
        c.displayName();
        c.play();
        Footballer f = new Footballer("Messi");
        f.displayName();
        f.play();
    }
}