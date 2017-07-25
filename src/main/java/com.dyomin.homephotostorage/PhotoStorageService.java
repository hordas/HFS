package com.dyomin.homephotostorage;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Реализует интерфейс сервиса.
 * --
 * Created by John on 2017-07-18.
 */
@Path("storage")
public class PhotoStorageService {

    @Path("photo")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getPhotoIDs() {
        return "Yes!";
    }

    @GET
    @Path("dir")
    @Produces("text/html")
    public Response getCatalogNames() {
        return Response.status(Response.Status.OK).build();
    }

    @POST
    @Path("photo")
    public String addPhoto(Photo photo) {
        return "Yeah!";
    }

    @POST
    @Path("dir")
    @Produces("text/html")
    public Response addDirectory(Directory dir) {
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("photo/{id}")
    public Response updatePhoto(Photo photo, @PathParam("id") String photoId) {
        return Response.status(Response.Status.OK).build();
    }

    @POST
    @Path("dir/{id}")
    public Response updateDirectory(Directory dir, @PathParam("id") String dirId) {
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Path("dir/{id}")
    public Response removeDirectory(@PathParam("id") String dirId) {
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Path("photo/{id}")
    public Response removePhoto(@PathParam("id") String photoId) {
        return Response.status(Response.Status.OK).build();
    }
}
