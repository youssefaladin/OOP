public class Person {
    private String name;
    private  String address;
    private  String phonenumber;
    private  String email;
    public Person(String name, String address, String phonenumber, String email) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhoneNumber(){
        return phonenumber;
    }
    public String getEmail(){
        return email;
    }
    public String setName(String name){
        this.name=name;
    }
    public String setAddress(String address){
        this.address=address;
    }
    public String setPhoneNumber(String phonenumber )
    {
        this.phonenumber=phonenumber;
    }
    public String setEmail(String email){
        this.email=email
    }
}

public class Employee extends Person {
    private String Office;
    private String Salary;
    private Date DateHired;

    public employee(String Office, String Salary, Int DateHired) {
        this.Salary = Salary;
        this.Office = Office;
        this.DateHired = DateHired;
    }
    public String toString() {
        return "Employee,"+ getName();
    }
}
public class Staff extends Employee{
    private String title;
    public Staff( String name, String address, String phonenumber, String email, String Office, String Salary, Date DateHired, String title)[
            super (name, address, phonenumber, email, Office,Salary, Hired, title)
            this.title = title;
    public String toString() {
        return "Employee,"+ getName();
    }
}

public class Faculty extends Employee{
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, int phonenumber, String email, String Office, double Salary, Date DateHired, int officehours, String rand) {
        super (name, address, phonenumber, email, Office,Salary, Hired, title)
        this.officeHours=officehours;
        this.rank=rank;
    }
    public String toString() {
        return "Faculty," + getName();
    }
}
    }
