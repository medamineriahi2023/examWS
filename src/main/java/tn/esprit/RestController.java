package tn.esprit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Path("achats")
public class RestController {

    static List<Achats> achats = new ArrayList<>();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Achats> getAll(){
        return this.achats;
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(Achats achat){
        achats.add(achat);
        return Response.status(201).entity(this.achats).build();
    }

    @GET()
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    public Response search(@QueryParam(value = "ref") int ref)
    {
        Achats achats1 = this.achats.stream().filter(e -> e.getRef() == ref).findFirst().orElse(null);
        return Response.ok(achats1).build();
    }


    @DELETE()
    @Path("delete")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@QueryParam(value = "id") int id) {
        achats = achats.stream().filter(e -> e.getRef() != id).collect(Collectors.toList());
        return Response.ok().build();
    }
}



