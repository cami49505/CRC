package com.crc.medicamentos;

import java.io.Serializable;

public class UsuarioM implements Serializable {
    private String username;

    public UsuarioM(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
