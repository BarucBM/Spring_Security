package com.example.posts.post_params.respositories;

import com.example.posts.post_params.domain.consultation.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
