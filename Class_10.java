class Student {
    int rollNo;
    String name;
    static int count = 0;

    Student(int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
        count++;
    }
}

class WEEK1 {
    public static void main(String args[]){

        Student s1 = new Student(1 , "Ram");
        System.out.println(s1.count);

        Student s2 = new Student(2, "Sham");
        System.out.println(s2.count);

        Student s3 = new Student(3,"Alex");
        System.out.println(s3.count);

        System.out.println(Student.count);
    }
}



//Using this helps to explicitly state that you're referring to an instance variable, which can be especially useful when there's a local variable with the same name. This distinction helps prevent potential confusion and ensures that your code behaves as intended.