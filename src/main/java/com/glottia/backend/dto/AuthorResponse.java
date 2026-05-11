package com.glottia.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Respuesta de autenticación con token JWT")
public class AuthorResponse {
    @Schema(description = "Token JWT para incluir en el header Authorization: Bearer <token>")
    private String token;
}
