package com.example.posts.post_params.domain.consultation;

import java.util.Date;

public record ConsultationDTO(
        String patientName,
        String doctorName,
        Date date,
        String reason,
        String diagnosis,
        String treatment) {
}
