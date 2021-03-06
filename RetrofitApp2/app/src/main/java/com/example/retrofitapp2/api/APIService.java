package com.example.retrofitapp2.api;

import com.example.retrofitapp2.model.Categories;
import com.example.retrofitapp2.model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("randomselection.php")
    Call<Meals> getRandomMeal();

    @GET("latest.php")
    Call<Meals> getLastMeal();

    @GET("categories.php")
    Call<Categories> getCategories();

    @GET("filter.php")
    Call<Meals> getMealByCategory(@Query("c") String category);

    @GET("search.php")
    Call<Meals> getMealByName(@Query("s") String mealName);

    @GET("lookup.php")
    Call<Meals> getMealById(@Query("i") String mealId);
}