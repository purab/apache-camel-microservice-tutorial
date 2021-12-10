package in.purabtech.camel.microservice.app.activemq.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqSenderRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//timer
		from("timer:active-mq-timer?period=10000") //time in millisecond
		.transform().constant("My message for activemq..")
		.log("${body}")
		.to("activemq:my-activemq-queue");
		//add message to queue
		
	}

}
