package ie.gmit.ds;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class ArtistApiConfig extends Configuration {
    private int port;

    @JsonProperty
    public int getPort() {
        return port;
    }
}
