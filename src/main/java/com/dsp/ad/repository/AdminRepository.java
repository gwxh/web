package com.dsp.ad.repository;

import com.dsp.ad.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

    @Query("from Admin a where a.username = ?1 and a.status!=2")
    Admin selectAdminByName(String username);
}
