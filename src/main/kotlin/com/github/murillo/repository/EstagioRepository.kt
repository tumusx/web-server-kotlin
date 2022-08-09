package com.github.murillo.repository

import com.github.murillo.model.Estagio
import org.springframework.data.jpa.repository.JpaRepository

interface EstagioRepository : JpaRepository<Estagio, Long> {
}