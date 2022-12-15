package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String name;
    public static String schoolName;

    static {
        schoolName = "Cydeo School";
    }
public CydeoStudent(String name){
        this.name = name;
}

    public static void main(String[] args) {
        CydeoStudent cydeoStudent1 = new CydeoStudent("Jimmy");
        CydeoStudent cydeoStudent2 = new CydeoStudent("Kathy");

        System.out.println(cydeoStudent1.schoolName);
        System.out.println(cydeoStudent2.schoolName);
    }
}
