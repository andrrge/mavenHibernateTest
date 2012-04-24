package me.rge.hibernatetest.entity;

/**
 * Created with IntelliJ IDEA.
 * User: rzheutskiy
 * Date: 24.04.12
 * Time: 16:04
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private Long id;
    private int age;
    private String firstname;
    private String lastname;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    // Accessor methods for all properties, private setter for 'id'
}
