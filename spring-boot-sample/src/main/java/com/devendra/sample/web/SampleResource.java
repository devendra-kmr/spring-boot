package com.devendra.sample.web;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;


/**
 * Created by devendra on 7/26/17.
 *
 * REST controller for Sample Demo.
 */
@RestController
@CrossOrigin
@RequestMapping("/api")
public class SampleResource {

    private final Logger log = LoggerFactory.getLogger(SampleResource.class);




    @GetMapping("/msg")
    public String getAllUsers() {
        log.debug("REST request to get all message");
        return "Welcome !";
    }




}
