package by.epam.oracletest.domain;

import java.io.Serializable;

/**
 * Created by Uladzislau_Kastsevic on 12/6/2016.
 */
public class Request implements Serializable {
    private User inviter;
    private User receiver;
    private Group group;

    public User getInviter() {
        return inviter;
    }

    public void setInviter(User inviter) {
        this.inviter = inviter;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
