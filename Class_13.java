//                  Interfaces- Class 13

// interface Shape{
//     double pi = 3.14 ; // By default in interfaces: public, static , final
//    double getSquare(double r); // By default in interfaces : public and abstract

// }

// class Circle implements Shape{
//     public double getSquare(double r){
//         return r*r;
//     }
//     void fun(){
//         System.out.println("Hey! I implemented an interface named Shape.");
//     }
// }

// class WEEK1{
//     public static void main(String args[]){

//         Circle c = new Circle();
//         System.out.println(c.getSquare(5));
//         c.fun();

//     }
// }


//                          Multiple Inheritance through interfaces

interface M{
    int x = 10;
    void fun();
}

interface N{
    int x = 20;
    void fun();
}

class C implements M,N // Multiple inheritance in Java
{
    public void fun(){
        System.out.println("Hello, I'm function in C");
        System.out.println(M.x); //Ambiguity resolved using fully Qualified Name
    }
}

interface O extends M,N  //Multiple inheritance through Interfaces 
{
    void fun();
}

class D implements O{
    public void fun(){
        System.out.println("Hello, I'm function in D");
    }
}

class WEEK1{
    public static void main(String args[]){
        C c = new C();
        c.fun();
    }
}