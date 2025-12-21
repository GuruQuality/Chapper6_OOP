package employe;

public class Department {
    String name;
    Employee boss;

    Department(String name) {
        this.name = name;
    }

    public void setBoss(Employee boss) {
        if (boss.department == this) {
            this.boss = boss;
        }
    }

    @Override
    public String toString() {
        return this.getText();
    }

    // Метод который возвращает точку в виде текста {X;Y}
    String getText() {
        return name;
    }
}
