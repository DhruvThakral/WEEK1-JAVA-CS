//          Abstraction- Class 12



abstract class Car // We cannot instantiate an abstract class, which means we cannot create objects of an abstract class 
{
    int maxSpeed;
    abstract void accelerate(); //Only declared but not implemented - it is without body 
    // They are created to force the child classes to implement them before using. We will use them after overriding
    abstract void brake();
}

abstract class BMW extends Car{
    void accelerate() {
        System.out.println("BMW is accelerating");
    }
}

class BMW2 extends BMW {
    void brake(){
        System.out.println("BMW is applying Brakes");
    }
}


abstract class A{
    // An abstract class can exist without abstract methods 
    // We simply mean we will not be able to create object (instantiate) of this class .
    
    int x = 10;
    void fun(){ // Abstract class can have concrete (non-abstract) method
        System.out.println("Hello! ");
    }
}


class WEEK1{
    public static void main(String args[]){
    //    Car c = new  Car() ; // Cannot instantiate an abstract class
    
    // BMW bmw = new BMW();
    // bmw.accelerate();
    

    BMW2 bmw2 = new BMW2();
    bmw2.accelerate();
    bmw2.brake();
    }
}