package org.example.nexabank.model;

public abstract class Person {
    protected String name;
    protected String firstName;
    protected String email;
    protected String password;

    public Person(String name, String firstName, String email, String password)
    {
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setemail(String email)
    {
        this.email = email;
    }
    public void setpassword(String password)
    {
        this.password = password;
    }

    public String getName()
    {
        return name;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }

    public abstract boolean login(String email, String password);
}
