package com.onlinetechvision.integration;

import com.onlinetechvision.model.CargoMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;

import java.util.List;
@MessageEndpoint
public class testTransform {
    @Transformer(inputChannel = "testTransform",outputChannel = "finalservice")
    public List<CargoMessage> transformDomesticCargo1(List<CargoMessage> cargoMessage) {
        System.out.println("In testTransform" + cargoMessage);
        return cargoMessage;
    }
}
