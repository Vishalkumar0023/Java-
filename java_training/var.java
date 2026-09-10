class Var {

    public static void main(String args[]) {

        Var obj = new Var();

        obj.f1(10, true, "Hello");
    }

    public void f1(int x, boolean result, String str) {

        System.out.println("value of x is " + x);
        System.out.println("value of result is " + result);
        System.out.println("value of str is " + str);
    }
}