package com.example.proyecto.lan.Dao;


import com.example.proyecto.lan.modelo.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements  UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios(){
        String query = "SELECT FROM datos";
      return entityManager.createQuery(query).getResultList();

    }

}
