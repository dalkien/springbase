package com.springbase.basespring;

import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

@Repository
public class DatosUsuariosRepositoryImplRetrofit2 {
    private static final String URI_DATOS = "http://localhost:8034";

    public List<DatosUsuario> getAllUsers() throws Exception{
        Retrofit retrofit = new Retrofit.Builder().baseUrl(URI_DATOS)
                .addConverterFactory(GsonConverterFactory.create()).build();

        DatosUsuarioResourceService datosUsuarioResourse = retrofit.create(DatosUsuarioResourceService.class);
        Call<List<DatosUsuario>> datosUsuario = datosUsuarioResourse.getAllUsers();
        return datosUsuario.execute().body();
    }
}
