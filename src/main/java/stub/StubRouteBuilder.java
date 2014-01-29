package stub;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class StubRouteBuilder extends RouteBuilder {

    public void configure() {
        CamelContext camelContext = new DefaultCamelContext();
        camelContext.addComponent("activemq", ActiveMQComponent.activeMQComponent("tcp://localhost:61616"));
        from("activemq:queue:messages")
                .to("file:target/messages");
    }
}
