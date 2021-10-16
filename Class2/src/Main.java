public class Main {

    public static void main(String[] args) {

//        int id;
//        String name;
//        int age;
        Student student = new Student(1,"alex",20);
        //System.out.println(student.printData());
        student = new Student(1,"alex", 21);
        //System.out.println(student.printData());

        Student[] students = new Student[100];
        for (int i = 0; i <100 ; i++) {
            students[i] = new Student(i,"StudentNo"+i,10+i);
        }
        for (int i = 0; i <100 ; i++) {
            System.out.println(students[i].toString());
        }


    }
}
