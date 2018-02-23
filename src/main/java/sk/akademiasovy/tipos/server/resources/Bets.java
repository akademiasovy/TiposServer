package sk.akademiasovy.tipos.server.resources;

import sk.akademiasovy.tipos.server.Credentials;
import sk.akademiasovy.tipos.server.Ticket;
import sk.akademiasovy.tipos.server.User;
import sk.akademiasovy.tipos.server.db.MySQL;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by host on 22.2.2018.
 */
@Path("/bets")
public class Bets {

    @POST
    @Path("/new")
    @Produces(MediaType.APPLICATION_JSON)
    public String newTicket(Ticket ticket){
      MySQL mySQL=new MySQL();
        boolean ret1 = mySQL.checkLogin(ticket.login);
        boolean ret2 = mySQL.checkToken(ticket.token);
        if(ret1 && ret2) {
            System.out.println("Token and username are correct!");
            mySQL.insertBets(ticket);
        }
        else
        {
            System.out.println("Invalid username or token");
        }
      return "{}";
    }
}
