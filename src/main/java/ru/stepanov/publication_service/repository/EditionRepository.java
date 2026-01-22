package ru.stepanov.publication_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.stepanov.publication_service.model.Category;
import ru.stepanov.publication_service.model.Edition;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface EditionRepository extends JpaRepository<Edition, UUID> {
    Optional<Edition> findByTitle(String title);
    List<Edition> findByCategory(Category category);
    List<Edition> findByPublicationDateBetween(LocalDate startDate, LocalDate endDate);
}