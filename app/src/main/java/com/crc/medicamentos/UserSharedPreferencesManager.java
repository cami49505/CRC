package com.crc.medicamentos;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.google.gson.Gson;

public class UserSharedPreferencesManager {

    private static Context context;


    public UserSharedPreferencesManager(Context context) { this.context = context;}

    public void saveUser(UsuarioM usuariom) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("UsuarioM", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        String usuarioString = "ERROR";

        Gson gson = new Gson();
        usuarioString = gson.toJson(usuariom);

        editor.putString("usuariom", usuarioString);
        editor.apply();
        Toast.makeText(context, "Usuario Almacenado", Toast.LENGTH_SHORT).show();

    }

    public UsuarioM getUser(){
        SharedPreferences sharedPreferences = context.getSharedPreferences("UsuarioM", Context.MODE_PRIVATE);
        String usuarioString = sharedPreferences.getString("usuariom","{}");

        UsuarioM usuariom;
        Gson gson = new Gson();
        usuariom = gson.fromJson(usuarioString, UsuarioM.class);

        return usuariom;
    }

    public void updateUser(String newUsername){
        UsuarioM usiariom = getUser();
        usiariom.setUsername(newUsername);
        saveUser(usiariom);
    }

    public static void deleteUser(){
        SharedPreferences sharedPreferences = context.getSharedPreferences("UsuarioM", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove("usuariom");
        editor.apply();
    }

}
