//              Char To Int & Instantiation- Class 6
class WEEK1{
    public static void main(String args[]){

        // int a = Character.getNumericValue('a');
        // System.out.println("A is : "+a);

        char c = 'a';
        int xa = c;
        System.out.println(xa);

        System.out.println((int)('a'));
        System.out.println((int)('A'));

        // We will require 'A' --> 0 , 'Z' --> 25
        //In Java, characters are actually represented as integer values based on their Unicode code points. The Unicode value of 'a' is 97, and the Unicode value of 'e' is 101. So when you subtract 'a' from 'e', you're essentially subtracting 97 from 101.

        char c3 = 'e';
        int e = c3 - 'a';
        System.out.println("E is : "+e);

    }
}