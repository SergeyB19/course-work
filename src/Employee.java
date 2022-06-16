public class Employee {
    public String staff;

    public int salaryStaff;

    public int departmentNumber;

    public static int id = 0;


    public Employee(String staff, int salaryStaff, int departmentNumber) {
        this.staff = staff;
        this.salaryStaff = salaryStaff;
        this.departmentNumber = departmentNumber;
        this.id = id;
        if (id > 0) {
            id++;
        }
    }

    public String getStaff() {
        return staff;
    }

    public int getSalaryStaff() {
        return salaryStaff;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber() {
        this.departmentNumber = departmentNumber;
    }

    public void setSalaryStaff() {
        this.salaryStaff = salaryStaff;
    }
}








