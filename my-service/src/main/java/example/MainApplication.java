package example;

import javax.xml.ws.Endpoint;

public class MainApplication {
    public static void main(String[] argv) {
        String helloService = "http://localhost:9000/hello-service";
        String placeService = "http://localhost:9000/place-service";
        Endpoint.publish(helloService, new HelloWorld());
        Endpoint.publish(placeService, new PlaceService());
    }
}
