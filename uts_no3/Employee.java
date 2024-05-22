
package uts_no3;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    //Metode untuk mengatur nilai atribut.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Membuat nama lengkap karyawan
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    // Menaikkan gaji karyawan sebesar persentase yg di sudah tertera
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent /100);
        }
    }
    // Menimpa toString dari kelas object
    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + getFullName() + ", Salary=" + salary + "]";
    }
    
    //Hasil dari program
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Jefri", "Nichol", 100000);
        System.out.println(emp);  // Output sebelum kenaikan gaji
        emp.raiseSalary(10);      // Naikkan gaji sebesar 10%
        System.out.println(emp);  // Output setelah kenaikan gaji
    }
}
