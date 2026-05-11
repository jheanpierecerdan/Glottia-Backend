package com.glottia.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Credenciales de acceso")
public class LoginRequest {
    @Schema(description = "Correo electrónico del usuario", example = "usuario@glottia.com")
    private String correo;
    @Schema(description = "Contraseña del usuario", example = "miContrasena123")
    private String contrasena;
}
