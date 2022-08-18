package com.shashi.phonebook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


import com.shashi.phonebook.Service.ContactService;

@RestController
public class ContactController {
	@Autowired
	private ContactService contactService;

}
