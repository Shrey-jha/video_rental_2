package com.example.rentvideoII.Repository;

import com.example.rentvideoII.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RentalRepository extends JpaRepository<Rental, Long> {
    long countByUser_IdAndReturnedAtIsNull(Long userId);
    Optional<Rental> findByUser_IdAndVideo_IdAndReturnedAtIsNull(Long userId, Long videoId);
}
