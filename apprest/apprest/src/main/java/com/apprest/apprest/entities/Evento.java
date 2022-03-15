package com.apprest.apprest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "evento")
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "Campo nome é de preencimento obrigatório.")
    @Column(name = "nm_evento")
    private String nome;

    @NotNull(message = "Campo local é de preencimento obrigatório.")
    @Column(name = "nm_local")
    private String local;

    @NotNull(message = "Campo data é de preencimento obrigatório.")
    @Column(name = "dt_dataevento")
    private String data;

    @NotNull(message = "Campo horario é de preencimento obrigatório.")
    @Column(name = "ds_horarioevento")
    private String horario;

}