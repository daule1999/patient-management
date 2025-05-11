package com.pm.patientservice.controller;

import com.pm.patientservice.dto.PatientResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
@Tag(name = "Home", description = "API for Home")
public class HomeController {
    @GetMapping
    @Operation(summary = "Home")
    public ResponseEntity<String> getPatients() {
        return ResponseEntity.ok().body("server connected");
    }

}