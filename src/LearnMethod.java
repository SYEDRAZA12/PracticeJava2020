public class LearnMethod {
// Method: block of code which runs when it is called. Method is used to perform
    // certain actions and they are known as function
    // Method Type:
    // Return Method
    // Non Return Method
    // Return Method without Parameter:
    // Return Method with Parameter:
    // Non Return Method without Parameter:
    // Non Return Method with Parameter:

    // Method Syntax: AccessModifier ReturnType/MethodType MethodName(){ Method Body
    // }
    // ReturnType/MethodType : Data Type/Class Type/ Object
    // MethodName: verb+Noun

    // Return type method without Parameter:


    // Non Return Method without Parameter:
    public void todaysName() {
        System.out.println("todays name is " + "Sunday");
        System.out.println("todays name is " + "Sunday");
        System.out.println("todays name is " + "Sunday");
        System.out.println("todays name is " + "Sunday");
    }

    // Return type method without Parameter:
    public int doSum() {
        int a = 10;
        int b = 30;
        int sum = a + b;
        String name = ":jony";
        System.out.println("total sum is " + sum + "my name is " + name);
        return sum;
    }

    public static int doSubtraction(int num1, int num2) {
        int number1 = num1;
        int number2 = num2;
        int sub = number2 - number1;
        System.out.println("Subtraction Value is " + sub);
        return num1;
    }

    public static void main(String[] args) {
        LearnMethod obj = new LearnMethod();
        obj.todaysName();
        obj.doSum();
        LearnMethod.doSubtraction(40, 20);

        int number = 20;
        System.out.println(++number);
    }
}
