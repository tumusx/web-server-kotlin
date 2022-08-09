package com.github.murillo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "accounts")
data class Account(
    @Id @GeneratedValue
    var idUser: Long? = null,
    var nameUserAccount: String?,
    var cpfUserAccount: String?,
    var phoneUserAccount: String?,
)