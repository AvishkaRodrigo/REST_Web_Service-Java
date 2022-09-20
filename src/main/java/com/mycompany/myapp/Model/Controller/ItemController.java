/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.mycompany.myapp.Model.Controller;

import com.google.gson.Gson;
import com.mycompany.myapp.Model.Item;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author DELL
 */
@Path("kottulab")
@RequestScoped
public class ItemController {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public ItemController() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.myapp.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("get-items")
    @Produces(MediaType.APPLICATION_JSON)
    public String getItems() {
        //TODO return proper representation object
//        Item item = new Item("Chicken Kottu", "1200", "2 portion" );
        
        List<Item> items = new ArrayList<>();
        items.add(new Item(1,"Chicken Kottu", "1200", "2 portion" ));
        items.add(new Item(2,"Fish Kottu", "1200", "2 portion" ));
        items.add(new Item(3,"Egg Kottu", "1200", "2 portion" ));
        return new Gson().toJson(items);
    }

    @POST
    @Path("add-item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes()
    public String addItem(Item item) {
        //TODO return proper representation object
        
        System.out.println("Item Code : "+ item.getItemCode());
        System.out.println("Item Name : "+ item.getName());
        System.out.println("Item Price : "+ item.getPrice());
        System.out.println("Item Description : "+ item.getDescription());
        
        return "New Item added";
    }
    
    /**
     * @param item
     * @return
     */
    
    
    
    @PUT
    @Path("update-item/{itemCode}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String putItem(Item item) {
        
        return "Item updated";
    }
    
    @GET
    @Path("get-item/{itemCode}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String getItem(Item item) {
        
        return ("Item deleted");
    }
    
    @DELETE
    @Path("delete-item/{itemCode}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String deleteItem(Item item) {
        
        return ("Item deleted");
    }
}
