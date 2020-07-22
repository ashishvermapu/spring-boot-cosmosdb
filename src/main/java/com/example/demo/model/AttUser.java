package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AttUser {

    @Id
    @GeneratedValue
    private long id;
    private String attuid;
    private String firstName;
    private String lastName;
    private String email;

    public AttUser() {
    }

    public AttUser(String attuid, String firstName, String lastName, String email) {
        this.attuid = attuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAttuid() {
        return attuid;
    }

    public void setAttuid(String attuid) {
        this.attuid = attuid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttUser)) return false;

        AttUser attUser = (AttUser) o;

        if (getId() != attUser.getId()) return false;
        if (getAttuid() != null ? !getAttuid().equals(attUser.getAttuid()) : attUser.getAttuid() != null) return false;
        if (getFirstName() != null ? !getFirstName().equals(attUser.getFirstName()) : attUser.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(attUser.getLastName()) : attUser.getLastName() != null)
            return false;
        return getEmail() != null ? getEmail().equals(attUser.getEmail()) : attUser.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getAttuid() != null ? getAttuid().hashCode() : 0);
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AttUser{" +
                "id=" + id +
                ", attuid='" + attuid + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
