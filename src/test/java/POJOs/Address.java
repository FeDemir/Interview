package POJOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.security.PrivateKey;

@Data
public class Address {
    @JsonProperty("street")
    private String street;
    @JsonProperty("suite")
    private String suite;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("geo")
    private Geo geo;
}
