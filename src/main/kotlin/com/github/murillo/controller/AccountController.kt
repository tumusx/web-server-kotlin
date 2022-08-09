package com.github.murillo.controller

import com.github.murillo.model.Account
import com.github.murillo.repository.AccountRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/accounts")
class AccountController(private val repositoryAccount: AccountRepository) {

    @PostMapping
    fun createUser(@RequestBody accountUser: Account) : Account = repositoryAccount.save(accountUser)

    @GetMapping
    fun getUserAll(): List<Account> = repositoryAccount.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<Account> = repositoryAccount.findById(id).map {
        ResponseEntity.ok(it)
    }.orElse(ResponseEntity.notFound().build())

    @PutMapping("/{id}")
    fun updateUserAccount(@PathVariable idUser: Long, @RequestBody account: Account): ResponseEntity<Account> =
        repositoryAccount.findById(idUser).map {
            val accountToUpdateUser = it.copy(
                nameUserAccount = it.nameUserAccount,
                cpfUserAccount = it.cpfUserAccount,
                phoneUserAccount = it.phoneUserAccount
            )
            ResponseEntity.ok(repositoryAccount.save(accountToUpdateUser))
        }.orElse(ResponseEntity.notFound().build())

    @DeleteMapping("/{id}")
    fun deleteUserAccount(@PathVariable idUser: Long): ResponseEntity<Void> =
        repositoryAccount.findById(idUser).map { userAccount ->
            repositoryAccount.delete(userAccount)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())

}


