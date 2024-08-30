package com.example.posts.post_params.services;

import com.example.posts.post_params.domain.consultation.Consultation;
import com.example.posts.post_params.domain.consultation.ConsultationDTO;
import com.example.posts.post_params.respositories.ConsultationRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {

    @Autowired
    private ConsultationRepository consultationRepository;

    public List<Consultation> getAllConsultation(){
      return consultationRepository.findAll();
    }

    public Consultation addConsultation(ConsultationDTO consultationDTO){
        Consultation consultation = new Consultation();

        BeanUtils.copyProperties(consultationDTO, consultation);

        return consultationRepository.save(consultation);
    }
}
