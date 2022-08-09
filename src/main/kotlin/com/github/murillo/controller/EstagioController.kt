package com.github.murillo.controller

import com.github.murillo.model.Estagio
import com.github.murillo.repository.EstagioRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/estagio")
class EstagioController(private val estagioRepository: EstagioRepository) {


    @PostMapping("/cadastrarEstagio")
    fun cadastrarEstagio(@RequestBody estagio: Estagio): Estagio = estagioRepository.save(estagio)

    @GetMapping("/listarEstagio")
    fun listarEstagio(): List<Estagio> = estagioRepository.findAll()
}