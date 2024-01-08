package com.spring.boot.services;

import com.spring.boot.entities.Contact;

import java.util.List;
import java.util.UUID;

public interface ContactManagerService {

    List<Contact> fetchAll();

    Contact fetchById(UUID id);

    void saveWithUser(Contact contact, String username);

    void update(Contact contact);

    void deleteById(UUID id);

    List<Contact> fetchAllByUsername(String username);
}