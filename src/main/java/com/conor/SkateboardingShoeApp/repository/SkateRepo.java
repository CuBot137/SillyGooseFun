package com.conor.SkateboardingShoeApp.repository;

import com.conor.SkateboardingShoeApp.model.SkateModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkateRepo extends JpaRepository <SkateModel, Long> {

}
