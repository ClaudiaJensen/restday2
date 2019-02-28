/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import dk.webtrade.todelete.entity.Address;
import dk.webtrade.todelete.entity.Customer;

/**
 *
 * @author claudia
 */
public class CustomerDTO
{
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public CustomerDTO(String firstName, String lastName, int age, String address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public CustomerDTO(Customer customer)
    {
        this.firstName = customer.getFirstname();
        this.lastName = customer.getLastname();
        this.age = customer.getAge();
        this.address = customer.getAddress().getStreet();
    }

    public CustomerDTO()
    {
        
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
