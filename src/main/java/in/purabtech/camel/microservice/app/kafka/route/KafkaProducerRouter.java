package in.purabtech.camel.microservice.app.kafka.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class KafkaProducerRouter extends RouteBuilder {	

	@Override
	public void configure() throws Exception {
		from("direct:start")
	    .setBody(constant("Message from Camel"))          // Message to send
	    .setHeader("KafkaSomeKEY", constant("Camel")) // Key of the message
	    .to("kafka:test?brokers=localhost:9092");
	}
	

}
