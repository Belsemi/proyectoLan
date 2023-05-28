package com.example.proyecto.lan.controller;

import com.example.proyecto.lan.Dao.UsuarioDao;
import com.example.proyecto.lan.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controlador {

    @Autowired
    UsuarioDao usuarioDao;

    @RequestMapping(value = "datos", method = RequestMethod.GET)
    public List<Usuario> getDatos(){
       return usuarioDao.getUsuarios();
    }
}
