package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ServicioWebPrediccionApiService;
import io.swagger.api.factories.ServicioWebPrediccionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.Date;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/ServicioWebPrediccion")


@io.swagger.annotations.Api(description = "the ServicioWebPrediccion API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-20T16:57:33.415Z[GMT]")

public class ServicioWebPrediccionApi  {
   private final ServicioWebPrediccionApiService delegate;

   public ServicioWebPrediccionApi(@Context ServletConfig servletContext) {
      ServicioWebPrediccionApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ServicioWebPrediccionApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ServicioWebPrediccionApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ServicioWebPrediccionApiServiceFactory.getServicioWebPrediccionApi();
      }

      this.delegate = delegate;
   }


    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "predicción sobre una persona y la fecha", notes = "obtiene una predicción sobre una persona y una fecha dada", response = Void.class, tags={ "Prediccion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response getPrediccionPersona(@ApiParam(value = "Obtiene la predicción sobre una persona dado su id y la fecha") @QueryParam("personaID") Integer personaID
,@ApiParam(value = "obtiene la ruta de una persona a través de su id y la fecha") @QueryParam("fecha") Date fecha
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPrediccionPersona(personaID,fecha,securityContext);
    }

}

