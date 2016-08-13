/**
 * class Employee extends SearchableObject
 *
 * This is a blueprint for the employee object that will be constucted in
 * the main and used in an ArrayList of Employees. This extends searchable
 * object so that it can be user by the search classes
 *
 */
class Employee extends SearchableObject {
    private String firstName, lastName, department, userName, password;
    private double salary;

    // This is the constuctor for the employee class this will create the employee object
    public Employee(String firstName, String lastName, String department, String userName, String password, double salary) {
        // The name attribute is constructed by concatenating the first and list names
        // The type attibutes it set as employee
        super(firstName + " " + lastName, Type.EMPLOYEE);
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.userName = userName;
        this.password = password;
        this.salary = salary;
    }

    // These are the getters for the class that allow the getting of individual attributes
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public double getSalary() {
        return salary;
    }
}

