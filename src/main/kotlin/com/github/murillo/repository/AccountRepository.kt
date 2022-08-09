package com.github.murillo.repository

import com.github.murillo.model.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long> {
}