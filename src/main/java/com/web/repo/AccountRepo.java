package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.model.AccountDetails;

public interface AccountRepo extends JpaRepository<AccountDetails, Integer> {
	

}
