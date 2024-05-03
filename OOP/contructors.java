public class contructors {
    public static void main(String[] args) {
        Student p1 = new Student();
        
        Student p2 = new Student("aefeg");
    
        p1.setDetails("charles", 1);
        p1.setDetails("asdh00");
        p1.marks[0] =10;
        p1.marks[1] =20;
        p1.marks[2] =30;

        p1.getDetails();
        p1.getpassword();
        System.out.println();

        p2.setDetails("chotu", 2);
        p2.getDetails();
        p2.getpassword();
        System.out.println();

        Student p3 = new Student(p1);
        
        p3.setDetails("Ash01");

        p1.marks[2] = 2100;
        
        p1.getDetails();
        p1.getpassword();

        p3.getDetails();
        p3.getpassword();

    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    void getDetails(){
        System.out.println(this.name);
        System.out.println(this.roll);
        for (int i = 0; i < this.marks.length; i++) {
            System.out.println(this.marks[i]);
        } 
    }
    void getpassword(){
        System.out.println(this.password);
        System.out.println();
    }
    void setDetails(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    void setDetails(String password){
        this.password=password;
    }
    Student(){
        marks = new int[3];
        System.out.println("------------------   un-parametriezed");
    }
    Student(String password){
        marks = new int[3];
        this.password = password;
        System.out.println("------------------    parameterized");
    }
    // Student(Student p1){
    //     marks = new int[3];
    //     this.name = p1.name;
    //     this.roll = p1.roll;
    //     this.marks = p1.marks;
    //     System.out.println("------------------ shallow   copy constructor");           //shallow means reflects the changes
    // }
    Student(Student p1){
        marks = new int[3];
        this.name = p1.name;
        this.roll = p1.roll;
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = p1.marks[i];
        }
        System.out.println("------------------  deep    copy constructor");          // deep means doens refelct changes
    }
     
}
