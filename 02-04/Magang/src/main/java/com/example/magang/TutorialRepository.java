package com.example.magang;

import com.example.magang.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);
}
