package pro.wings.annotations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person_Details")
public class Person {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String city;
private int pin;


public Person() {
	super();
}

public Person(String name, String city, int pin) {
	super();
	this.name = name;
	this.city = city;
	this.pin = pin;
}

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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}


}

