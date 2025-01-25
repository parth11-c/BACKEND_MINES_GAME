package com.data.service;

import com.data.entity.Version;
import com.data.repository.VRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Optional;

@Service
public class VService {

    @Autowired
    private VRepo vRepo;

    public Optional<Version> getVersion(String version) {
        // Fetch Version from DB using repository
        return vRepo.findByVersion(version);
    }
    
    public Optional<Version> getLatestVersion() {
        return vRepo.findAll()
                .stream()
                .max(Comparator.comparing(Version::getVersion));
    }

}
