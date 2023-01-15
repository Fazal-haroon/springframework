package com.example.demo.jpa.repository;

import com.example.demo.jpa.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonRepository {
    @PersistenceContext
    EntityManager entityManager;

    //JPQL = Java Persistence Query Language
    public List<Person> findAll(){
        TypedQuery<Person> findAllPersons = entityManager.createNamedQuery("find_all_persons", Person.class);
        return findAllPersons.getResultList();
    }

    public Person findById(int id){
        return entityManager.find(Person.class, id);
    }

    public Person update(Person person){
        return entityManager.merge(person);
    }

    public Person insert(Person person){
        return entityManager.merge(person);
    }

    public void deleteById(int id){
        Person person = findById(id);
        entityManager.remove(person);
    }
}
