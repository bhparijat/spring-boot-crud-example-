package com.example.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "users")
public class User implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;


 @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int age;
    private String email;
    private String city;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
//  @GeneratedValue(generator = "usersSequenceGenerator")
//@GenericGenerator(
//name = "usersSequenceGenerator",
//strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//parameters = {
//      @Parameter(name = "sequence_name", value = "usersSequence"),
//      @Parameter(name = "initial_value", value = "1"),
//      @Parameter(name = "increment_size", value = "1")
//}
//)