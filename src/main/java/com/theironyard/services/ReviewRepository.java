package com.theironyard.services;

import com.theironyard.entities.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by boun on 1/26/17.
 */
public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
