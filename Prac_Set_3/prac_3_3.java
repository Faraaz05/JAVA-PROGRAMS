class Employee {

    private double salary;
    private String firstname;
    private String lastname;

    Employee(String firstname, String lastname, double salary) {
        setFirstname(firstname);
        setLastname(lastname);
        setSalary(salary);
    }

    public void setFirstname(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!(Character.isAlphabetic(str.charAt(i)))) {
                System.out.println("Enter A Valid Name With Only Alphabetic Characters.");
                lastname = "";
                return;
            }
        }
        this.firstname = str;
    }

    public void setLastname(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!(Character.isAlphabetic(str.charAt(i)))) {
                System.out.println("Enter A Valid Name With Only Alphabetic Characters.");
                lastname = "";
                return;
            }
        }
        this.lastname = str;
    }

    public void setSalary(double x) {
        if(x < 0) {
            System.out.println("Cannot Enter Negetive Salary");
            this.salary = 0;
            
        }
        else
        this.salary = x;
    }

    public String getFirstName() {
        return this.firstname;
    }
    public String getLastName() {
        return this.lastname;
    }
    public double getSalary() {
        return this.salary;
    }

    public void printDetails() {
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Yearly Salary: " + salary*12);
    }
    public void displayRaiseSalary() {
        System.out.println("Yearly Salary After Raise: " + (salary + (salary/10))*12);
    }
}
public class prac_3_3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("fname" , "lname",25000);
        e1.printDetails();
        e1.displayRaiseSalary();
        Employee e2 = new Employee("Faraaz" , "Bhojawala",30000);
        e2.printDetails();
        e2.displayRaiseSalary();

        System.out.println("\n 23CS012_Faraaz_Bhojawala");
    }
}
