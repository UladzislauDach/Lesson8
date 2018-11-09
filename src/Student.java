public class Student {
    public String name;
    public static String university;
    public Student(String name){
        this.name=name;
    }
    public static void printInfo (Student student){
        System.out.println(student.name);
    }
    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student ivan= new Student("Ivan");
        Student igor= new Student("Igor");
        Student.university="BSUIR";
        System.out.println(ivan.name);
        System.out.println(ivan.university);
        System.out.println(igor.name);
        System.out.println(igor.university);
        ivan.printName();
        Student.printInfo(igor);
    }
}