package com.EdgeDeviceManagement.ProvisionPortal.RestController;

import com.EdgeDeviceManagement.ProvisionPortal.Entity.SGW;
import com.EdgeDeviceManagement.ProvisionPortal.Respository.SGWRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SGWRestController {


    public SGWRestController(SGWRepository sgwRepository){
        this.sgwRepository=sgwRepository;
    }
    private final SGWRepository sgwRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/SGWS")
    public List<SGW> listSGWS(){
        return sgwRepository.findAll();
    }

}
