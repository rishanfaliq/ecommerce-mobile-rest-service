package com.example.rishan.rishan.Services;

import com.example.rishan.rishan.Model.OrderItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface OrderItemService {

    String BASE_URL = "http://10.3.4.164:8080/";

    @GET("orderItems/cart/orderItem/{username}")
    Call<List<OrderItem>> getCartItems(@Path("username") String username);

    @POST("oitems")
    Call<OrderItem> addToCart(@Body OrderItem orderItem);

    @PUT("orderItems/cart/orderItem/{username}/{pid}/{quantity}")
    Call<OrderItem>  updateCartItem(@Path("username")String username,@Path("quantity") int quantity,@Path("pid") int pid);

    @DELETE("orderItems/cart/{id}}")
    Call<OrderItem> deleteFromCart(@Path("id") int id);

    @PUT("orderItems/cart/orderItem/{username}/purchased")
    Call<Void> checkout(@Path("username") String username);

    @GET("orders/orderitems/{username}")
    Call<List<OrderItem>> getPurchasedItems(@Path("username") String username);

}
