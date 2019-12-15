package com.onlinetechvision.integration;

import com.onlinetechvision.model.CargoMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import java.util.List;

@MessageEndpoint
public class finalservice {
    @ServiceActivator(inputChannel = "finalservice")
    public void transformDomesticCargo1(List<CargoMessage> cargoMessage) {
        System.out.println("In finalservice"+cargoMessage);
    }
}
