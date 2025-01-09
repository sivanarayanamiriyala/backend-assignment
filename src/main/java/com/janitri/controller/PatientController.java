package com.janitri.controller;

import com.janitri.dto.PatientDto;
import com.janitri.entity.Patient;
import com.janitri.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/add")
    public Patient addPatient(@RequestBody PatientDto patientDto, @RequestParam int userId) {
        return patientService.addPatient(patientDto, userId);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }
}
