package SV;

public class StudentManagement {
    public boolean sameGroup(Student s1, Student s2){
        if(s1.getGroup().equals(s2.getGroup())) return true;
        return false;
    }

    void studentsByGroup(){

    }

    void removeStudent(String id){
        
    }

    public static void main(String[] args){
        /*Student test1 = new Student();
        Student test2 = new Student();

        // show me
        Student me = new Student();
        me.setName("NDD");
        me.setId("17021386");
        me.setGroup("K62-N");
        me.setEmail("ngoduydat1999@gmail.com");
        System.out.println(me.getName());

        System.out.println(me.getInfo()); // show all about me*/

        /*
        Test 3 method Student
         */
        /*Student test3 = new Student();
        System.out.println(test3.getInfo());

        Student test4 = new Student("NND", "ssa", "dhaj");
        System.out.println(test4.getInfo());

        Student test5 = new Student(test3);
        System.out.println(test5.getInfo());

        StudentManagement testAll = new StudentManagement();
         if(testAll.sameGroup(test3,test4)== true){
             System.out.println(" two class are same group");
         }
         else System.out.println(" two class aren't same group");*/



    }
}
