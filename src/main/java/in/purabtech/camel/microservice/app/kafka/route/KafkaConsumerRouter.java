package in.purabtech.camel.microservice.app.kafka.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class KafkaConsumerRouter extends RouteBuilder{
	
	private static String TOPIC = "testTopic";
	private static int kafkaPort = 9092;

	@Override
	public void configure() throws Exception {
		
		from("kafka:test?brokers=localhost:9092")
		    .log("Message received from Kafka : ${body}")
		    .log("    on the topic ${headers[kafka.TOPIC]}")
		    .log("    on the partition ${headers[kafka.PARTITION]}")
		    .log("    with the offset ${headers[kafka.OFFSET]}")
		    .log("    with the key ${headers[kafka.KEY]}");	
		
		

	}
	
	

	
	
	

}
