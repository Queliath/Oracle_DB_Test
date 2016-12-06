package by.epam.oracletest.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Uladzislau_Kastsevic on 12/6/2016.
 */
public class Group implements Serializable {
    private int id;
    private String name;
    private List<User> members;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
