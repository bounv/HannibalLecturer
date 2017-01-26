package com.theironyard.services;

import com.theironyard.entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by boun on 1/26/17.
 */
public interface LecturerRepository extends CrudRepository<Lecturer, Integer> {
}
