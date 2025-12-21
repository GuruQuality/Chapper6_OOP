package employe;

public class Department {
    protected String name;
    protected Employee boss;

    public Department(String name) {
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
