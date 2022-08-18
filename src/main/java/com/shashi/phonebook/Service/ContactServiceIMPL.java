package com.shashi.phonebook.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shashi.phonebook.Repository.ContactRepository;
import com.shashi.phonebook.model.Contact;
@Service
public class ContactServiceIMPL implements ContactService {
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return false;
	}

}
