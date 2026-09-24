class Car{
    int speed;
    String name;
    void display(){
        System.out.println("name "+name + "speed"+speed);
    }
}
class OOPq1{
    public static void main(String args[]){
    Car obj1 = new Car();
    Car obj2 = new Car();
    obj1.speed = 200;
    obj1.name = "BMW";
    obj1.display();
    obj2.speed = 100;
    obj2.name = "AUDI";
    obj2.display();
    }
}