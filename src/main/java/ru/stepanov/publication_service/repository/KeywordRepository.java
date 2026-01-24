package ru.stepanov.publication_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.stepanov.publication_service.entity.Keyword;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface KeywordRepository extends JpaRepository<Keyword, UUID> {
    Optional<Keyword> findByWord(String word);
}