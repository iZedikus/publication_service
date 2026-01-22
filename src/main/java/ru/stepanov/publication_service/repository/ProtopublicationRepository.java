package ru.stepanov.publication_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.stepanov.publication_service.model.Protopublication;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProtopublicationRepository extends JpaRepository<Protopublication, UUID> {
    Optional<Protopublication> findByTitle(String title);
}