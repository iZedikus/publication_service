package ru.stepanov.publication_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.stepanov.publication_service.model.Link;
import ru.stepanov.publication_service.model.Publication;

import java.util.List;
import java.util.UUID;

@Repository
public interface LinkRepository extends JpaRepository<Link, UUID> {
    List<Link> findByOriginPublication(Publication originPublication);
    List<Link> findByCitedPublication(Publication citedPublication);
    List<Link> findByOriginPublicationAndCitedPublication(Publication origin, Publication cited);
}
