package ru.stepanov.publication_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.stepanov.publication_service.entity.Citation;
import ru.stepanov.publication_service.entity.Link;

import java.util.List;
import java.util.UUID;

@Repository
public interface CitationRepository extends JpaRepository<Citation, UUID> {
    List<Citation> findByLink(Link link);
}