package com.shashi.phonebook.Repository;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashi.phonebook.model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}