package com.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Account;
@Repository
public interface AccountRepo extends CrudRepository<Account,Long> {

}
