import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//written by Jason Ditullio 2023

class ContactTest {

	// testing that a create contact object matches inputed elements
	@Test
	void testContact() {
		Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
		assertTrue(contact.getContactID().equals("123456"));
		assertTrue(contact.getFirstName().equals("Jason"));
		assertTrue(contact.getLastName().equals("Ditullio"));
		assertTrue(contact.getPhone().equals("9091234567"));
		assertTrue(contact.getAddress().equals("123 sesame street"));

	}
	
	// testing that ID length is not valid
	@Test
	void testIDlength() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("1234567895060","Jason","Ditullio","9091234567","123 sesame street");
		});
		
	}
	
	//testing that ID is null
	@Test
	void testIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact(null,"Jason","Ditullio","9091234567","123 sesame street");
		});
		
	}
	
	// testing that First Name length is not valid
	@Test
	void testFirstNamelength() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("123456","Jasonbajsheinmv","Ditullio","9091234567","123 sesame street");
		});
		
	}
	
	// testing that First Name is null
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("123456",null,"Ditullio","9091234567","123 sesame street");
		});
		
	}
	
	// testing that Last Name length is not valid
	@Test
	void testLastNamelength() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("123456","Jason","Ditulliojhdnvkher","9091234567","123 sesame street");
		});
		
	}
	
	// testing that Last Name is null
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("123456","Jason",null,"9091234567","123 sesame street");
		});
		
	}
	
	// testing that Phone length is not valid
	@Test
	void testPhonelength() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("123456","Jason","Ditullio","909123456754687521","123 sesame street");
		});
		
	}
	
	//testing that Phone is null
	@Test
	void testPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("123456","Jason","Ditullio",null,"123 sesame street");
		});
		
	}
	
	//testing that Address length is not valid
	@Test
	void testAddresslength() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("123456","Jason","Ditullio","9091234567","123 sesame street is the address to this spot");
		});
		
	}
	
	// testing that Address is null
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact("123456","Jason","Ditullio","9091234567",null);
		});
		
	}
}
