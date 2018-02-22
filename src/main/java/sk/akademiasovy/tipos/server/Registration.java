package sk.akademiasovy.tipos.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by host on 22.2.2018.
 */
public class Registration{
    @JsonProperty("firstname")
    public String firstname;
    @JsonProperty("lastname")
    public String lastname;
    @JsonProperty("email")
    public String email;
    @JsonProperty("login")
    public String login;
    @JsonProperty("password")
    public String password;
}
