package com.janitri.controller;

import com.janitri.dto.HeartRateDto;
import com.janitri.entity.HeartRate;
import com.janitri.service.HeartRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heartrates")
public class HeartRateController {

    @Autowired
    private HeartRateService heartRateService;

    @PostMapping("/record")
    public HeartRate recordHeartRate(@RequestBody HeartRateDto heartRateDto, @RequestParam Long patientId) {
        return heartRateService.recordHeartRate(heartRateDto, patientId);
    }

    @GetMapping("/{patientId}")
    public List<HeartRate> getHeartRatesForPatient(@PathVariable Long patientId) {
        return heartRateService.getHeartRatesForPatient(patientId);
    }
}
