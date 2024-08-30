package com.example.posts.post_params.controllers;

import com.example.posts.post_params.domain.consultation.Consultation;
import com.example.posts.post_params.domain.consultation.ConsultationDTO;
import com.example.posts.post_params.services.ConsultationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultations")
public class ConsultationController {

    @Autowired
    private ConsultationService consultationService;

    @GetMapping
    public ResponseEntity<List<Consultation>> getAllConsultations(){
        return ResponseEntity.status(HttpStatus.OK).body(consultationService.getAllConsultation());
    }

    @PostMapping
    public ResponseEntity<Consultation> addConsultation (@RequestBody @Valid ConsultationDTO consultationDTO){
        System.out.println(consultationDTO);
        return ResponseEntity.status(HttpStatus.OK).body(consultationService.addConsultation(consultationDTO));
    }
}
