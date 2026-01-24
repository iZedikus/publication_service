package ru.stepanov.publication_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.stepanov.publication_service.entity.ProtoPublication;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProtopublicationRepository extends JpaRepository<ProtoPublication, UUID> {
    Optional<ProtoPublication> findByTitle(String title);
}