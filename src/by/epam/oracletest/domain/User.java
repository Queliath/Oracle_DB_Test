package by.epam.oracletest.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Uladzislau_Kastsevic on 12/6/2016.
 */
public class User implements Serializable{
    private int id;
    private String name;
    private List<Group> groupList;

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

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
