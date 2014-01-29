package stub;

import org.apache.camel.builder.RouteBuilder;

public class StubRouteBuilder extends RouteBuilder {

    public void configure() {
        from("file:src/data?noop=true")
                .to("file:target/messages/uk");
    }
}
