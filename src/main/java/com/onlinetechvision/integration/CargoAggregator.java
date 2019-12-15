package com.onlinetechvision.integration;

import com.onlinetechvision.model.Cargo;
import com.onlinetechvision.model.CargoMessage;
import org.springframework.integration.annotation.Aggregator;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.Message;

import java.util.List;

@MessageEndpoint
public class CargoAggregator {

    @Aggregator(inputChannel = "cargoTransformerOutputChannel", outputChannel = "cargoAggregatorOutputChannel", discardChannel = "cargoFilterDiscardChannel")
    public List<CargoMessage> collectCargoList(List<CargoMessage> message) {
        System.out.println("in CargoAggregator"+message);
        return  message;
    }
}
