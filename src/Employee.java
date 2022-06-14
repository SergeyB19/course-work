public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String salary;
    private String department1;
    private String department2;
    private String department3;
    private String department4;
    private String department5;
    static int id;

    public Employee(String firstName, String middleName, String lastName, String salary, String department1, String department2, String department3, String department4, String department5) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.department1 = department1;
        this.department2 = department2;
        this.department3 = department3;
        this.department4 = department4;
        this.department5 = department5;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSalary() {
        return salary;
    }

    public String getDepartment1() {
        return department1;
    }

    public String getDepartment2() {
        return department2;
    }

    public String getDepartment3() {
        return department3;
    }

    public String getDepartment4() {
        return department4;
    }

    public String getDepartment5() {
        return department5;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public void setDepartment1() {
        this.department1 = department1;
    }
    public void setDepartment2() {
        this.department2 = department2;
    }
    public void setDepartment3() {
        this.department3 = department3;
    }
    public void setDepartment4() {
        this.department4 = department4;
    }
    public void setDepartment5() {
        this.department5 = department5;
    }
}


