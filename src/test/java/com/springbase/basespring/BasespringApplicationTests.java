package com.springbase.basespring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasespringApplicationTests {
    @Autowired
    DatosUsuariosRepositoryImplRetrofit2 datosUsuariosRepositoryImplRetrofit2;

    @Test
    public void contextLoads() {
        try {
            List<DatosUsuario> datosUsuarios = datosUsuariosRepositoryImplRetrofit2.getAllUsers();
            for (DatosUsuario data : datosUsuarios){
                System.out.println("usuario " + data.getName() );
            }
        }
        catch (Exception e){
            System.out.println("error = " + e.getMessage());
        }
    }

}
