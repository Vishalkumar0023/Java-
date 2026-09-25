class Calculator {
    void calculate(int num1, int num2, char operator) {
        if (operator.equals("+")) {
            System.out.println("result is " + (num1 + num2));
        } 
        else if (operator.equals("-")) {
            System.out.println("result is " + (num1 - num2));
        } 
        else if (operator.equals("*")) {
            System.out.println("result is " + (num1 * num2));
        } 
        else if (operator.equals("/")) {
              if (num2 == 0) {
                System.out.println("Zero division error");
            } else {
                System.out.println("result is " + (num1 / num2));
            }
        } 
        else {
            System.out.println("Invalid operator");
        }
    }
}
class OOPq4 {
    public static void main(String args[]) {
        Calculator obj = new Calculator();
        obj.calculate(10,10,"+");
        obj.calculate(20,20,"*");
    }
}