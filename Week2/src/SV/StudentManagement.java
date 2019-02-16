package SV;

import java.util.ArrayList;

public class StudentManagement {

   Student[] sv = new Student[100];
    int soSV =0;

    public boolean sameGroup(Student s1, Student s2){
        if(s1.getGroup().equals(s2.getGroup())) return true;
        return false;
    }

   public void setsoSV(int soSV){
        this.soSV = soSV;
   }
   public int getsoSV(){
        return this.soSV;
   }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    void studentsByGroup(){
        // sort
        for(int i=0;i<this.soSV-1;i++){
            int k=i;
            for(int j=i+1;j<this.soSV;j++){
                if(sameGroup(sv[i],sv[j])){
                    k++;
                    Student temp = sv[j];
                    sv[j]=sv[k];
                    sv[k]= temp;
                }
            }
        }
        //print
        for(int i=0;i<this.soSV;i++){
            sv[i].getInfo();
        }
    }

    void removeStudent(String id){

        while(sv[this.soSV-1].getId().equals(id)) this.soSV--;
        // if id on button array

        for( int i=0; i< this.soSV; i++){
            while(sv[i].getId().equals(id)){
                for(int j=i;j<this.soSV-1;j++){
                    sv[j]=sv[j+1];
                }

                this.soSV--;
            }
        }

        for(int i=0;i<this.soSV;i++){
            sv[i].getInfo();
        }

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

        StudentManagement svList = new StudentManagement();
        svList.setSoSV(6);
        for(int i=0; i<svList.getSoSV();i++){
            
        }

    }
}