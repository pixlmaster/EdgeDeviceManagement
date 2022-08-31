package com.EdgeDeviceManagement.ProvisionPortal;

import com.EdgeDeviceManagement.ProvisionPortal.Entity.SGW;
import com.EdgeDeviceManagement.ProvisionPortal.Respository.SGWRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SGWRepositoryDetails implements CommandLineRunner {

    public SGWRepositoryDetails(SGWRepository repository) {
        super();
        this.repository = repository;
    }

    private final SGWRepository repository;

    @Override
    public void run(String... args) {
        repository.save(new SGW("BGZPT01","172.168.5.6","Pending"));
        repository.save(new SGW("BGZPT02","172.168.5.7","Pending"));
        repository.save(new SGW("BGZPT03","172.168.5.8","Pending"));

    }

}
