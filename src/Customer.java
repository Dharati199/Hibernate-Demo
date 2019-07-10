
public class Customer {
private String Name;
private String Email;
private String Country;

public Customer(String name, String email, String country) {
	super();
	this.Name = name;
	this.Email = email;
	this.Country = country;
}

@Override
public String toString() {
	return "Customer [Name=" + Name + ", Email=" + Email + ", Country=" + Country + "]";
}

public String getName() {
	return Name;
}

public String getEmail() {
	return Email;
}

public String getCountry() {
	return Country;
}






	
}


