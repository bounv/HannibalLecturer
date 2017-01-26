package com.theironyard.controller;


import com.theironyard.entities.Lecturer;
import com.theironyard.entities.Review;
import com.theironyard.services.LecturerRepository;
import com.theironyard.services.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by boun on 1/26/17.
 */
@RestController
public class HannibalLecturerController {

    @Autowired
    LecturerRepository lecturers;

    @Autowired
    ReviewRepository reviews;


    @RequestMapping(path = "/lecturers", method = RequestMethod.GET)
    public List lecturerGet() {
        List<Lecturer> lecturerEntities = (List<Lecturer>) lecturers.findAll();
        return lecturerEntities;
    }


    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)
    public void lecturerPost(String name, String topic, String image) {
        Lecturer person = new Lecturer(name, topic, image);
        lecturers.save(person);

    }


    @RequestMapping(path = "/reviews", method = RequestMethod.GET)
    public List reviewGet() {
        List<Review> reviewEntities = (List<Review>) reviews.findAll();
        return reviewEntities;
    }


    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
    public void reviewPost(String author, String text, int lecturerId, boolean isGood) {
        Review message = new Review(author, text, lecturerId, isGood);
        reviews.save(message);

    }


}
