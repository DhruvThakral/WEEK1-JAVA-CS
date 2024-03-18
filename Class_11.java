//       Final Keyword- Class 11

class A{
    final int noOfAlphabets = 26; //Final Variables - Value ance assigned cannot be changed 
    final int noOfDigits;

    // Either assign the value at the time of declaration or assign the value inside the constructor

    A()
    {
        noOfDigits = 10;
    }

    final void fun(){
        System.out.println("Hi, I'm a function in class A.");
    }
}

final class B extends A // Final classes cannot be inherited
{

}

class WEEK1 {
    public static void main(String args[]){

    }
}