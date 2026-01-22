package ru.stepanov.publication_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.stepanov.publication_service.model.Edition;
import ru.stepanov.publication_service.model.Issue;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface IssueRepository extends JpaRepository<Issue, UUID> {
    List<Issue> findByEdition(Edition edition);
    Optional<Issue> findByEditionAndNumber(Edition edition, Integer number);
}