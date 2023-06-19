import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//written by Jason Ditullio 2023

class ContactServiceTest {
	
	
	// testing that contact is added to array list
	@Test
	void testAddContact() throws Exception {
		Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
		ContactService service = new ContactService();
		service.addContact(contact);
		
		assertTrue(!service.Contacts.get(0).getContactID().equals(null));
		assertTrue(service.Contacts.get(0).getContactID().equals("123456"));
		
		assertTrue(!service.Contacts.get(0).getFirstName().equals(null));
		assertTrue(service.Contacts.get(0).getFirstName().equals("Jason"));
		
		assertTrue(!service.Contacts.get(0).getLastName().equals(null));
		assertTrue(service.Contacts.get(0).getLastName().equals("Ditullio"));
		
		assertTrue(!service.Contacts.get(0).getPhone().equals(null));
		assertTrue(service.Contacts.get(0).getPhone().equals("9091234567"));
		
		assertTrue(!service.Contacts.get(0).getAddress().equals(null));
		assertTrue(service.Contacts.get(0).getAddress().equals("123 sesame street"));
		
	}
	
	// testing that bad contact ID will not get added
	@Test
	void testAddBadContact() throws Exception{
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			Contact contact = new Contact("1234567895060","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
		});
	}
	
	// testing that an added contact is deleted
	@Test
	void testDeleteContact() throws Exception {
		Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
		ContactService service = new ContactService();
		service.addContact(contact);
		service.deleteContact("123456");
		
		assertTrue(service.Contacts.size() == 0);
		
	}
	
	// testing that a contact with a bad ID wont get put in array list
	@Test
	void testDeleteBadContactID() throws Exception{
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			Contact contact = new Contact("1234567895060","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
			service.deleteContact("1234567895060");
		});
	}
	
	// testing that searching for a non-existent contact gives an error
	@Test
	void testDeletemissingContactID() throws Exception{
		Assertions.assertThrows(Exception.class,() -> {
			Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
			service.deleteContact("123465");
		});
	}
	
	// testing that a contacts first name can be edited
	@Test
	void testEditFirstName() throws Exception {
		Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
		ContactService service = new ContactService();
		service.addContact(contact);
		service.editContactFirstName("123456", "John");
		
		assertTrue(service.Contacts.get(0).getContactID().equals("123456"));
		assertTrue(!service.Contacts.get(0).getFirstName().equals("Jason"));
		assertTrue(service.Contacts.get(0).getFirstName().equals("John"));
		
	}
	
	// testing that a contact can't be edited with a bad first name
	@Test
	void testEditBadContactFirstName() throws Exception{
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
			service.editContactFirstName("123456", "Jasonasjvbakjsdbfjbt");
		});
	}
	
	// testing that a contact id that doesnt exist cant be edited
	@Test
	void testEditMissingContactIDFirstName() throws Exception{
		Assertions.assertThrows(Exception.class,() -> {
			Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
			service.editContactFirstName("123465", "John");
		});
	}

	// testing that a contacts last name can be edited
	@Test
	void testEditLastName() throws Exception {
		Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
		ContactService service = new ContactService();
		service.addContact(contact);
		service.editContactLastName("123456", "Doe");
		
		assertTrue(service.Contacts.get(0).getContactID().equals("123456"));
		assertTrue(!service.Contacts.get(0).getLastName().equals("Ditullio"));
		assertTrue(service.Contacts.get(0).getLastName().equals("Doe"));
		
	}
	
	// testing that a contact can't be edited with a bad last name
	@Test
	void testEditBadContactLastName() throws Exception{
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
			service.editContactFirstName("123456", "Ditullioasjvbakjsdbfjbt");
		});
	}
	
	// testing that a contact id that doesnt exist cant be edited
	@Test
	void testEditMissingContactIDLastName() throws Exception{
		Assertions.assertThrows(Exception.class,() -> {
			Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
			service.editContactLastName("123465", "Doe");
		});
	}
	
	// testing that a contacts phone can be edited
	@Test
	void testEditPhone() throws Exception {
		Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
		ContactService service = new ContactService();
		service.addContact(contact);
		service.editContactPhone("123456", "9099876543");
		
		assertTrue(service.Contacts.get(0).getContactID().equals("123456"));
		assertTrue(!service.Contacts.get(0).getPhone().equals("9091234567"));
		assertTrue(service.Contacts.get(0).getPhone().equals("9099876543"));
		
	}
	
	// testing that a contact can't be edited with a bad phone
	@Test
	void testEditBadContactPhone() throws Exception{
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
			service.editContactPhone("123456", "9091513548465135498");
		});
	}
	
	// testing that a contact id that doesnt exist cant be edited
	@Test
	void testEditMissingContactIDPhone() throws Exception{
		Assertions.assertThrows(Exception.class,() -> {
			Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
			service.editContactPhone("123465", "9091234657");
		});
	}
	
	// testing that a contacts address can be edited
	@Test
	void testEditAddress() throws Exception {
		Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
		ContactService service = new ContactService();
		service.addContact(contact);
		service.editContactAddress("123456", "456 arnold street");
		
		assertTrue(service.Contacts.get(0).getContactID().equals("123456"));
		assertTrue(!service.Contacts.get(0).getAddress().equals("123 sesame street"));
		assertTrue(service.Contacts.get(0).getAddress().equals("456 arnold street"));
		
	}
	
	// testing that a contact can't be edited with a bad address
	@Test
	void testEditBadContactAddress() throws Exception{
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
			service.editContactAddress("123456", "514 double double lane street with lights");
		});
	}
	
	// testing that a contact id that doesnt exist cant be edited
	@Test
	void testEditMissingContactIDAddress() throws Exception{
		Assertions.assertThrows(Exception.class,() -> {
			Contact contact = new Contact("123456","Jason","Ditullio","9091234567","123 sesame street");
			ContactService service = new ContactService();
			service.addContact(contact);
			service.editContactAddress("123465", "456 arnold street");
		});
	}

}
