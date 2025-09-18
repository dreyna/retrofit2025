package com.cavanosa.crudretrofitapp.interfaces;

import com.cavanosa.crudretrofitapp.dto.ProductDto;
import com.cavanosa.crudretrofitapp.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CRUDInterface {

    @GET("products")
    Call<List<Product>> getAll();

    @GET("products/{id}")
    Call<Product> getOne(@Path("id") int id);

    @POST("products")
    Call<Product> create(@Body ProductDto dto);

    @PUT("products/{id}")
    Call<Product> edit(@Path("id") int id, @Body ProductDto dto);

    @DELETE("products/{id}")
    Call<Product> delete(@Path("id") int id);
}
