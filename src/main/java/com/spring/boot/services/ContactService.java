package com.spring.boot.services;

import com.spring.boot.entities.Contact;

import java.util.List;
import java.util.UUID;

public interface ContactService {

    List<Contact> getAll();

    Contact getById(UUID id);

    void save(Contact contact);

    void update(Contact contact);

    void deleteById(UUID id);

    List<Contact> findAllByUserId(UUID id);
}
