// scope of class 
// public--(access within and outside package) 
// default--(within the package))

public class student {
    // members of the class (variables and methods)
    // instance members
    private int roll;
    private String name;
    private int[] marks = new int[3];
    private boolean rewards;
    private String email;
    private String phone;
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public boolean isRewards() {
        return rewards;
    }
    public void setRewards(boolean rewards) {
        this.rewards = rewards;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    private String city;
    private String collegeName;
    // init block
    // {
    //     System.out.println("init block");
    //     System.out.println(roll+" "+name+" "+marks);
    // }
    // class name and constructor are same
    // constructor nevers returns
    // constructors are of two types(default and parametrised)
    // student(){
    //     roll = 1;
    //     name = "dsffg";
    //     System.out.println("i am a default constructor");
    // }
    // constructor overloading
    student(){
        collegeName = "DITU";
    }
    student(int roll, String name, int[] marks){
        this(); // calling default constructor
        // this - keyword
        // carry current calling object reference]
        if(roll <=0){
            System.out.println("Invalid roll");
            return;
        }
        this.roll = roll;
        this.name = name;
        this.marks = marks;

    }
    void print(){
        System.out.println("Roll No - "+roll);
        System.out.println("Name - "+name);
        System.out.print("Marks -");
        for(int i=0; i<marks.length; i++){
            System.out.print(" "+marks[i]);
        }
        System.out.println();
        System.out.println("College - "+collegeName);
    }
    // not a constructer now, it is a method
    // void student(){
    //     System.out.println("i am a default constructor");
    // }

    
}
