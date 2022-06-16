public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee(" Ivanov Ivan Ivanovich ", 55000, 1);
        employee[1] = new Employee(" Makarov Makar Makarovich ", 65000, 2);
        employee[2] = new Employee(" Maksimov Maksim Maksimovich ", 99000, 3);
        employee[3] = new Employee(" Vasilkov Visaliy Vasilylievich ", 98000, 4);
        employee[4] = new Employee(" Bykin Gennadi Gennadievich ", 120000, 5);
        employee[5] = new Employee(" Galkin Maksim Maksimovich ", 130000, 1);
        employee[6] = new Employee(" Pygacheva Nadezda Valerievna ", 200000, 2);
        employee[7] = new Employee(" Kirkorov Vladimir Ostapovich ", 33000, 3);
        employee[8] = new Employee(" Kirienko Viktor Viktorovich ", 78000, 4);
        employee[9] = new Employee(" Medvedev Dmitriy Ivanovich ", 140000, 5);
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
}