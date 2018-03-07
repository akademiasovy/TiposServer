package sk.akademiasovy.tipos.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by host on 20.2.2018.
 */
public class Credentials {
    @JsonProperty("username")
    public String username;

    @JsonProperty("password")
    public String password;

    @JsonProperty("token")
    public String token;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
