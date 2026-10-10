package com.example.springboot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "James",
                        "js, node, react, html"
                ),
                new SoftwareEngineer(
                        2,
                        "Jamila",
                        "java, spring,  springboot"
                )
        );
    }

    @DeleteMapping
    public List<SoftwareEngineer> delEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "James",
                        "js, node, react, html"
                )
        );
    }

}
