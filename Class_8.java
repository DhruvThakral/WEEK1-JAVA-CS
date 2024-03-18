//                  Control Flow- Class 8

// class Car{
//     String name;
//     String color;
//     int year;
//     int maxSpeed;
//     void accelerate(){
//         System.out.println("Car is accelerating");
//     }
// }

// class WEEK1{
//     public static void main(String args[]){
//         Car polo = new Car();

//         System.out.println(polo.name);
//         System.out.println(polo.color);
//         System.out.println(polo.year);
//         System.out.println(polo.maxSpeed);

//         polo.name = "Polo";
//         polo.color = "Red";
//         polo.year = 2016;
//         polo.maxSpeed = 120;

//         System.out.println(polo.name);
//         System.out.println(polo.color);
//         System.out.println(polo.year);
//         System.out.println(polo.maxSpeed);
//     }
// }


// class Student{
//     String name ;
//     int marks;
//     boolean checkPass(){
//         if(marks>40){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }

// class WEEK1{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "Ram";
//         s1.marks = 80;

//         Student s2 = new Student();
//         s2.name = "Sham";
//         s2.marks = 30;

//         System.out.println(s1.checkPass());
//         System.out.println(s2.checkPass());
//     }
// }


// class ControlFlow{
//     int findmax(int a , int b ,int c){
//         if(a>b){
//             if(a>c){
//                 return a;
//             }
//             else{
//                 return c;
//             }
//         }
//         else{
//             if(b>c){
//                 return b;
//             }
//             else{
//                 return c;
//             }
//         }
//     }
// }

// class WEEK1{

//     public static void main(String args[]){

//         ControlFlow cf = new ControlFlow();

//         System.out.println(cf.findmax(12, 34, 1));
//     }
// }

import java.util.*;

class WEEK1{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
 
        char c = 'a';

        switch(c){
            case 'a' :
                System.out.println("I am A ");
                break;
            case 'b' :
                System.out.println("I am B");
                break;
            case 'c' :
                System.out.println("I am C");
                break;
            default:
                System.out.println("Error!");
        }
    }
}