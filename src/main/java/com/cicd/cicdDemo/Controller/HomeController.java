package com.cicd.cicdDemo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/satyam")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> home(){
        return ResponseEntity.ok().body("hello my name is satyam kumar singh");
    }

    @GetMapping("/about")
    public ResponseEntity<String> about(){
        return ResponseEntity.ok().body("i am currently persuing BTech in parul university");

    }

    @GetMapping("/collage")
    public ResponseEntity<String> collage(){
        return ResponseEntity.ok().body("Parul University");
    }

    @GetMapping("/address")
    public ResponseEntity<String> address(){
        return ResponseEntity.ok().body("hello i am from ara bihar.");
    }

    @GetMapping("/dev")
    public String dev(){
        return "i am in CSE1";
    }

    @GetMapping("/project")
    public String project(){
        return "i am currently working on airline project";
    }

    


}
