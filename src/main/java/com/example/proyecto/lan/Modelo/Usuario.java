package com.example.proyecto.lan.Modelo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "falta colocar")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;
    @Getter @Setter @Column(name = "yape1")
    private int yape1;
    @Getter @Setter @Column(name = "yape2")
    private int yape2;

    @Getter @Setter @Column(name = "totalSumaYapes")
    private int totalSumaYapes;
    @Getter @Setter @Column(name = "tiempo")
    private LocalDate tiempo;
    @Getter @Setter @Column(name = "fiadosTotalesCliente")
    private int fiadosTotalesCliente;
    @Getter @Setter @Column(name = "efectivoTotal")
    private int efectivoTotal;
    @Getter @Setter @Column(name = "CyberPlanet")
    private int CyberPlanet;
    @Getter @Setter @Column(name = "restanteDinero")
    private int restanteDinero;


}
