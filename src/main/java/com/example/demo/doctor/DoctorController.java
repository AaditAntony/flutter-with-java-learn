package com.example.demo.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/doctor")
public class DoctorController {
@Autowired
    private DoctorRepository doctorRepository;
@PostMapping("/add")
    public Doctor addDoctor(@RequestBody Doctor doctor){
return  doctorRepository.save(doctor);
}

@GetMapping("/all")
    public List<Doctor> getAllDoctor(){
    return doctorRepository.findAll();
}


}
