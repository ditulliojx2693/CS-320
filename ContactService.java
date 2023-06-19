import java.util.ArrayList;

//written by Jason Ditullio 2023

public class ContactService {
	
	// creating an array list to store contacts
	ArrayList<Contact> Contacts = new ArrayList<Contact> ();
	
	//method to add new contacts
	public void addContact(Contact contact) throws Exception {
		for(int i = 0; i < Contacts.size(); i++) {
			if(Contacts.get(i).getContactID().equals(contact.getContactID())) {
				throw new Exception("This contact already exists");
			}
		}
		Contacts.add(contact);
	}
	
	//method to delete a contact based on ID
	public void deleteContact(String ID) throws Exception {
		if(ID.equals(null) || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		boolean foundID = false;
		for(int i = 0; i < Contacts.size(); i++) {
			if(Contacts.get(i).getContactID().equals(ID)){
				Contacts.remove(i);
				foundID = true;
				break;
			}
		}
		if(foundID == false) {
			throw new Exception("This contact does not exist");
		}
		
	}
	
	//method to edit a specific contacts first name based on ID
	public void editContactFirstName(String ID, String newFirstName) throws Exception {
		if(ID.equals(null) || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		if(newFirstName.equals(null) || newFirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid contact first name");
		}
		
		boolean foundID = false;
		for(int i = 0; i < Contacts.size(); i++) {
			if(Contacts.get(i).getContactID().equals(ID)){
				Contacts.get(i).setFirstName(newFirstName);
				foundID = true;
				break;
			}
		}
		if(foundID == false) {
			throw new Exception("This contact does not exist");
		}
	}
	
	//method to edit a specific contacts last name based on ID
	public void editContactLastName(String ID, String newLastName) throws Exception{
		if(ID.equals(null) || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		if(newLastName.equals(null) || newLastName.length() > 10) {
			throw new IllegalArgumentException("Invalid contact last name");
		}
		
		boolean foundID = false;
		for(int i = 0; i < Contacts.size(); i++) {
			if(Contacts.get(i).getContactID().equals(ID)){
				Contacts.get(i).setLastName(newLastName);
				foundID = true;
				break;
			}
		}
		if(foundID == false) {
			throw new Exception("This contact does not exist");
		}
	}
	
	
	//method to edit a specific contacts phone based on ID
	public void editContactPhone(String ID, String newPhone) throws Exception{
		if(ID.equals(null) || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		if(newPhone.equals(null) || !(newPhone.length() == 10)) {
			throw new IllegalArgumentException("Invalid contact phone number");
		}
		
		boolean foundID = false;
		for(int i = 0; i < Contacts.size(); i++) {
			if(Contacts.get(i).getContactID().equals(ID)){
				Contacts.get(i).setPhone(newPhone);
				foundID = true;
				break;
			}
		}
		if(foundID == false) {
			throw new Exception("This contact does not exist");
		}
	}
	
	//method to edit a specific contacts address based on ID
	public void editContactAddress(String ID, String newAddress) throws Exception{
		if(ID.equals(null) || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		if(newAddress.equals(null) || newAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid contact address");
		}
		
		boolean foundID = false;
		for(int i = 0; i < Contacts.size(); i++) {
			if(Contacts.get(i).getContactID().equals(ID)){
				Contacts.get(i).setAddress(newAddress);
				foundID = true;
				break;
			}
		}
		if(foundID == false) {
			throw new Exception("This contact does not exist");
		}
	}
	
}
