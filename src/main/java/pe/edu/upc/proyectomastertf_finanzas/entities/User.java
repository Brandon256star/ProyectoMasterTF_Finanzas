package pe.edu.upc.proyectomastertf_finanzas.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_User;
    @Column(name = "nameUser", nullable = false, length = 70)
    private String nameUser;
    @Column(name = "emailUser", nullable = false)
    private double emailUser;
    @Column(name = "password", nullable = false, length = 40)
    private String password;
    @Column(name = "creation_date", nullable = false, length = 40)
    private String provinceCity;
    @Column(name = "achievements", nullable = false, length = 40)
    private String achievements;


}
