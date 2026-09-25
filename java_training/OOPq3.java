class Constructor{
    int speed ;
    String name;
    Constructor(int speed,String name){
        this.name = name;
        this.speed = speed;
    }
    void Display(){
        System.out.println(name + " " + "has max speed of" + " " + speed+ " " + "Km/h" );
    }
}
class OOPq3{
    public static void main(String args[]){
        Constructor obj = new Constructor(200,"Bmw");
        obj.Display();
    }
}