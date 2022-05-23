package com.enigma.EnigmaREST.controllers;

import com.enigma.EnigmaREST.beans.DeviceInfo;
import com.enigma.EnigmaREST.beans.JsonDeviceInfo;
import com.enigma.EnigmaREST.beans.JsonTask;
import com.enigma.EnigmaREST.beans.Task;
import com.enigma.EnigmaREST.mappers.Mapper;
import com.enigma.EnigmaREST.repositories.DeviceInfoRepository;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GeolocationController {

    @Autowired
    DeviceInfoRepository deviceInfoRepository;

    @PostMapping
    public void sayHello(@RequestBody JsonDeviceInfo jsonDeviceInfo) {
        System.out.println(jsonDeviceInfo);
        deviceInfoRepository.save(Mapper.mapDeviceInfo(jsonDeviceInfo));
    }
}
