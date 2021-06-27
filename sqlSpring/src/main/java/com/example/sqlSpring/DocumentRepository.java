package com.example.sqlSpring;

import org.springframework.data.repository.CrudRepository;
import com.example.sqlSpring.Document;

public interface DocumentRepository extends CrudRepository<Document, Integer> {

}