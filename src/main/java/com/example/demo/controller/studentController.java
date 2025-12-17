pacckage com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
public class studentController{
    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public Lis<studentEntity>getAll(){
       return service.getAll();
    }
}