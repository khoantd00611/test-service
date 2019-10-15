package example.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="employee")
public class Employee {
    @javax.persistence.Id
    private int Id;
    private String name;
    private long salary;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(int id, String name, long salary) {
    }
}
