package com.janitri.service;

import com.janitri.dto.HeartRateDto;
import com.janitri.entity.HeartRate;
import com.janitri.entity.Patient;
import com.janitri.repository.HeartRateRepository;
import com.janitri.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HeartRateService {

    @Autowired
    private HeartRateRepository heartRateRepository;

    @Autowired
    private PatientRepository patientRepository;

    public HeartRate recordHeartRate(HeartRateDto heartRateDto, Long patientId) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        HeartRate heartRate = new HeartRate();
        heartRate.setRate(heartRateDto.getRate());
        heartRate.setTimestamp(LocalDateTime.now());
        heartRate.setPatient(patient);
        return heartRateRepository.save(heartRate);
    }

    public List<HeartRate> getHeartRatesForPatient(Long patientId) {
        return heartRateRepository.findByPatientId(patientId);
    }
}
