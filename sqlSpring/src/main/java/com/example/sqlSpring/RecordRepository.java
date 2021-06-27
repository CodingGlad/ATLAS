package com.example.sqlSpring;

import org.springframework.data.repository.CrudRepository;
import com.example.sqlSpring.Record;

public interface RecordRepository extends CrudRepository<Record, Integer> {
}
