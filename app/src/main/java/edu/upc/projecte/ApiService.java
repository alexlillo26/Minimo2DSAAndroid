package edu.upc.projecte;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import java.util.List;

public interface ApiService {
    @POST("users")
    Call<Void> registerUser(@Body User user);

    @POST("users/login")
    Call<Void> loginUser(@Body User user);

    @GET("store")
    Call<List<Item>> getItems();

    @GET("user/{id}/coins")
    Call<Integer> getUserCoins(@Path("id") String userId);

    @PUT("users/{username}/profile")
    Call<Void> updateUserProfile(@Path("username") String username, @Body User userProfileUpdate);

    @GET("users/{username}/profile")
    Call<User> getUserProfile(@Path("username") String username);

    @GET("/dsaApp/posts")
    Call<List<Message>> getMessages();
    //
}