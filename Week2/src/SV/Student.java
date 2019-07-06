package SV;

public class Student {
    private String name ;
    private String id;
    private String group ;
    private String email ;

    Student(){
        name = "Student";
        id="000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    Student(String name, String id, String email){
        this.group = "K62CB";
        this.name = name;
        this.id = id;
        this.email = email;
    }

    Student (Student s){
        this.name = s.getName();
        this.group= s.getGroup();
        this.id = s.getId();
        this.email = s.getEmail();
    }

    //
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    //
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    //
    public void setGroup(String group){
        this.group = group;
    }
    public String getGroup(){
        return this.group;
    }
    //
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    // show in screen name, id, group, email
    String getInfo(){
        return this.name+" - "+
                this.id +" - "+
                this.group+" - "+
                this.email;
    }
}
