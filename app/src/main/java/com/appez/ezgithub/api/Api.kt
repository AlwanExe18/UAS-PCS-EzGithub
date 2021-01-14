package com.appez.ezgithub.api
import com.appez.ezgithub.data.model.DetailUserResponse
import com.appez.ezgithub.data.model.User
import com.appez.ezgithub.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token e3f0be0129a837e09b10eb1b71edc29c405371dd")
    fun getSearchUsers(
        @Query("q") query: String
    ) : Call<UserResponse>

    @GET("users/{username}")
    @Headers ("Authorization: token e3f0be0129a837e09b10eb1b71edc29c405371dd")
    fun getUserDetail(
            @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token e3f0be0129a837e09b10eb1b71edc29c405371dd")
    fun getFollowers(
            @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token e3f0be0129a837e09b10eb1b71edc29c405371dd")
    fun getFollowing(
            @Path("username") username: String
    ): Call<ArrayList<User>>
}