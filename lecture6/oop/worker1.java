package oop;
public class worker1 {
    int id;
    int salary;
    String firstName;
    String lastName;
   
    @Override
    public String toString() {
        return String.format("id: %d fn:%s ln:%s s:%d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        var t = (worker1) o;
        return id == t.id && firstName == t.firstName;
    }


    @Override
    public int hashCode() {
        return id;
    }
}
