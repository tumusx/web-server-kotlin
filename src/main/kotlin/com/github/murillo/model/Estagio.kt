package com.github.murillo.model

import com.google.gson.annotations.SerializedName
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "estagio")
data class Estagio(

    @Id @GeneratedValue
    @SerializedName("ID")
    var id: Long? = null,

    @SerializedName("NIVELVAGA")
    val nivelVagaEstagio: String? = null,

    @SerializedName("DESCRICAOVAGA")
    val descricaoVagaEstagio: String? = null,

    @SerializedName("HORARIO_VAGA")
    val horarioVaga: String? = null,

    )