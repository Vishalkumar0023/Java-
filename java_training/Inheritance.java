// Inheritances Concept Single inheritance ,hierachical inheritance ,multilevel inheritnace

class Animal
    {
        void sleep()
        {
            System.out.println("Sleeping!");
        }
    }
class Dog extends Animal
    {
        void speak()
        {
            System.out.println("Dog barks");
        }
    }    

class Cat extends Animal
    {
        void speak()
        {
            System.out.println("Meowww!");
        }
        public void sleep()
        {
            System.out.println("Cat Sleeping");
        }
    }
class Pug extends Dog
    {
        void speak()
        {
            System.out.println("Pug Barks");
        }
    }    

class Inheritance
    {
        public static void main(String args[])
        {
            Dog dog = new Dog();
            dog.speak();
            dog.sleep();
            Cat cat = new Cat();
            cat.sleep();
            cat.speak();
            Pug pug = new Pug();
            pug.speak();
            pug.sleep();
        }
    }    