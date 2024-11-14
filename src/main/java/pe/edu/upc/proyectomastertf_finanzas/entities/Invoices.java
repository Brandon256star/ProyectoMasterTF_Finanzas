package pe.edu.upc.proyectomastertf_finanzas.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Invoices")
public class Invoices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Invoices;
    @Column(name = "issue_date",nullable = false,length = 70)
    private String issue_date;
    @Column(name = "expiration_date",nullable = false)
    private  double expiration_date
            ;
    @Column(name = "total_amount",nullable = false,length = 40)
    private String total_amount;
    @Column(name = "rate _type",nullable = false,length = 40)
    private String rate_type;
}
