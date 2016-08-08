class Employee extends SearchableObject {
    private String firstName, lastName, department, userName, password;
    private double salary;

    public Employee(String firstName, String lastName, String department, String userName, String password, double salary) {
        super(firstName + " " + lastName, Type.EMPLOYEE);
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.userName = userName;
        this.password = password;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

