package com.Investify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Investify.model.InvestorInfo;

public interface InvestorInfoRepository extends JpaRepository<InvestorInfo,Long> {

}
