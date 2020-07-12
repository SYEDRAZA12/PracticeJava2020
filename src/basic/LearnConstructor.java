package basic;

// Constructor Name will be same as Class Name.
// Constructor Has no Return Type should not use VOID.
// Constructors are used to initialize the object.
// Before creating Parameterize constructor we must have to create Default constructor

// Deafult/ non Parametarized Constructor
// Parameterized Constructor

// AccessModifier className(){ }

public class LearnConstructor {

    String name;
    String address;
    int age;
    double courseFee;

//    public LearnConstructor(){
//        System.out.println("this is a default constructor");
//    }
    public LearnConstructor(String name){
        this.name=name;
        System.out.println("Student name is "+this.name);
        this.name="Raza";
        System.out.println("-----------------------");
        System.out.println("Student name is "+name);
        System.out.println("-----------------------");
        System.out.println("Student name is "+this.name);
        System.out.println("this is my one parameter constructor");
    }
    public LearnConstructor(String name, int age){
          this.name=name;
         this.age=age;
        System.out.println("student Name is "+this.name+"Student age is "+this.age);

    }
    public LearnConstructor(String name, int age,double courseFee ) {
        this.name=name;
        this.age=age;
        this.courseFee=courseFee;
        System.out.println("student Name is "+this.name+"Student age is "+this.age+"Student Fee is "+this.courseFee);

    }

    public static void main(String[] args) {

        //LearnConstructor obj = new LearnConstructor();

       LearnConstructor obj1 = new LearnConstructor("Jony");
        LearnConstructor obj2 = new LearnConstructor("MOBIN",30);
        LearnConstructor obj3=  new LearnConstructor("Shuvo",25,20.5555);
    }





    }
