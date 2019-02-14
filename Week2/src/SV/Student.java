package SV;

public class Student {
    private String name ;
    private String id;
    private String group ;
    private String email ;

    Student(){
        name = "Student";
        id="000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }

    Student(String n, String sid, String em){
        this.group = "K59CB";
        name = n;
        id = sid;
        email = em;
    }

    Student (Student s){
        name = s.getName();
        group= s.getGroup();
        id = s.getId();
        email = s.getEmail();
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
        return getName()+" "+
                getId() +" "+
                getGroup()+" "+
                getEmail();
    }
}
