package com.example.rentvideoII.Repository;

import com.example.rentvideoII.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {

}
