package com.data.controller;

import com.data.entity.Version;
import com.data.service.VService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") // Enable CORS for all origins and headers
@RequestMapping("/api")
public class VController {

    @Autowired
    private VService versionService;

    @GetMapping("/version")
    public Version getLatestVersion() {
        return versionService.getLatestVersion()
                .orElseThrow(() -> new RuntimeException("No version found in the database"));
    }


}
