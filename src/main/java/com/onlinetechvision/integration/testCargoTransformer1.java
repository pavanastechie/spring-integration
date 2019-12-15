package com.onlinetechvision.integration;

import com.onlinetechvision.model.CargoMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;

import java.util.List;

@MessageEndpoint
public class testCargoTransformer1 {
    @ServiceActivator(inputChannel = "testChannel", outputChannel = "testTransform")
    public List<CargoMessage>  transformDomesticCargo1(List<CargoMessage> cargoMessage) {
        System.out.println("In testCargoTransformer1"+cargoMessage);
        return cargoMessage;
    }
}
