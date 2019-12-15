package com.onlinetechvision.integration;

import com.onlinetechvision.model.CargoMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.channel.PublishSubscribeChannel;

import java.util.List;

@MessageEndpoint
public class testCargoTransformer2 {
    private PublishSubscribeChannel testChannel;
    @ServiceActivator(inputChannel = "testChannel")
    public void transformDomesticCargo(List<CargoMessage> cargoMessage) {
        System.out.println("In testCargoTransformer2"+cargoMessage);
    }
}
