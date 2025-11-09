package mx.gapsi.gapsi_demo_ms_consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import mx.gapsi.commons.model.Label;

@Component
@KafkaListener(topics="label-topic")
public class MsService {

    @KafkaHandler
    public void handle(Label customer) {
        try {
            /// ¿Qué hacemos aquí? ¿Lo enviamos a una base de datos o qué?
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
