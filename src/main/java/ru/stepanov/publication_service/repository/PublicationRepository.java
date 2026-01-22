package ru.stepanov.publication_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.stepanov.publication_service.model.Author;
import ru.stepanov.publication_service.model.Issue;
import ru.stepanov.publication_service.model.Keyword;
import ru.stepanov.publication_service.model.Publication;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, UUID> {
    Optional<Publication> findByTitle(String title);
    List<Publication> findByIssue(Issue issue);

    @Query("SELECT p FROM Publication p JOIN p.authors a WHERE a = :author")
    List<Publication> findByAuthor(@Param("author") Author author);

    @Query("SELECT p FROM Publication p JOIN p.keywords k WHERE k = :keyword")
    List<Publication> findByKeyword(@Param("keyword") Keyword keyword);

    @Query("SELECT p FROM Publication p WHERE LOWER(p.title) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(p.annotation) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Publication> searchByTitleOrAnnotation(@Param("searchTerm") String searchTerm);
}
