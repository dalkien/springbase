package com.springbase.basespring;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

public interface DatosUsuarioResourceService {

    @Headers({ "Accept: application/json" })
    @GET("user/all")
    Call <List<DatosUsuario>> getAllUsers();

}
