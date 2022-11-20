package Primavara.rest.repository;

import Primavara.rest.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Integer countByUsername(String username);
    Integer countByEmail(String email);

    AppUser findByUsername(String username);
}