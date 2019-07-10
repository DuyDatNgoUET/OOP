package SV;

import java.util.ArrayList;

public class StudentManagement {

    Student[] students = new Student[100];
    int soSV = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) return true;
        return false;
    }

    public void addStudent(Student newStudent) {
        if (soSV < 100) {
            students[soSV] = new Student();
            students[soSV].setName(newStudent.getName());
            students[soSV].setId(newStudent.getId());
            students[soSV].setGroup(newStudent.getGroup());
            students[soSV].setEmail(newStudent.getEmail());
        }
        soSV++;
    }

    /*public String studentsByGroup() {
        // sort
        for (int i = 0; i < this.soSV - 1; i++) {
            int k = i;
            for (int j = i + 1; j < this.soSV; j++) {
                if (sameGroup(students[i], students[j])) {
                    k++;
                    Student temp = students[j];
                    students[j] = students[k];
                    students[k] = temp;
                }
            }
        }
        //print
        String s = students[0].getInfo();
        for(int i=1;i<this.soSV;i++){
            s +="\n"+students[i].getInfo();
        }
        return s;
        String all = "";
        int arr[] = new int[100];
        int t = 0;
        arr[t] = 0;
        int length = 0;

        for (int i = 0; i < soSV - 1; i++) {
            if (sameGroup(students[i], students[i + 1])) {
                arr[t]++;
            }

            break;
        }

        System.out.println(length);

        return all;
    }*/

    public void removeStudent(String id) {

        while (students[this.soSV - 1].getId().equals(id)) this.soSV--;
        // if id on button array

        for (int i = 0; i < this.soSV; i++) {
            while (students[i].getId().equals(id)) {
                for (int j = i; j < this.soSV - 1; j++) {
                    students[j] = students[j + 1];
                }

                this.soSV--;
            }
        }

        for (int i = 0; i < this.soSV; i++) {
            students[i].getInfo();
        }

    }

    public static void main(String[] args) {
       /* StudentManagement SM = new StudentManagement();
        Student test1 = new Student("Ngo Duy Dat", "170213XX", "vnuedu");
        Student test2 = new Student("Sieu Van Nhan", "17971k", "12vnuedu");
        Student test3 = new Student("Hoc Van Gioi", "567891H", "412vnuedu");
        Student test5 = new Student("Sach Van Vo", "23456891H", "4678vnuedu");

        test2.setGroup("k68db");

        Student test4 = new Student();
        test4.setName("Ngo Thi Hong Linh");
        test4.setId("2209528X");
        test4.setGroup("K68db");
        test4.setEmail("neu@gmail.com");

        SM.addStudent(test1);
        SM.addStudent(test4);
        SM.addStudent(test2);
        SM.addStudent(test3);
        SM.addStudent(test5);


        System.out.println(SM.studentsByGroup());*/


    }
}