package employe;

public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return this.getText();
    }

    // Метод который возвращает точку в виде текста {X;Y}
    String getText() {
        if (this == department.boss) {
            return name + " начальник отдела " + department;
        } else {
            return name + " работает в отделе " + department + ", начальник которого " + department.boss.name;
        }
    }
}
