package com.shashi.phonebook.Service;

import java.util.List;

import com.shashi.phonebook.model.Contact;

public interface ContactService {
	
	public boolean saveContact(Contact contact);
	public List<Contact> getAllContact();
	public Contact getContactById(Integer contactId);
	public boolean deleteContactById(Integer contactId);
	
	

}
