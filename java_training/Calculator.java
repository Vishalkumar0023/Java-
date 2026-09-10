class Calculator {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        char operator = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);

        if (operator == '+') {
            System.out.println(num1 + num2);
        }
        else if (operator == '-') {
            System.out.println(num1 - num2);
        }
        else if (operator == '*') {
            System.out.println(num1 * num2);
        }
        else if (operator == '/') {
            System.out.println(num1 / num2);
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}