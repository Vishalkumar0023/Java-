// Multple inheritance


interface Printable
    {
        void Print();
    }
interface Showable
    {
        void Show();
    }   

class A implements Printable,Showable
    {
        public void Print()
        {
            System.out.println("Printing!");
        }
        public void Show()
        {
            System.out.println("Showing!");
        }
    }
class MultipleInheritance
    {
        public static void main(String args[])
        {
            A obj = new A();
            obj.Show();
            obj.Print();
        }
    }    