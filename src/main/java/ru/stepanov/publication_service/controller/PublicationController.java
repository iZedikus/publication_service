package ru.stepanov.publication_service.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.stepanov.publication_service.model.Publication;
import ru.stepanov.publication_service.repository.PublicationRepository;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class PublicationController {
    @PostMapping("/publications")
    @Transactional
    public ResponseEntity<Publication> createPublication(@RequestBody Publication publication) {
        log.debug("Post request to save publication: {}", publication);

        //TODO repo call

        log.info("Publication with ID {} was created", );
        log.debug("Publication data: ");
    }

    @GetMapping("/publications/{id}")
    @Transactional
    public ResponseEntity<Publication> getPublicationById(@PathVariable UUID id) {
        log.debug("Request to get publication with ID: {}", id);
        //TODO repo call
    }

    @GetMapping("/publications/")
    @Transactional
    public List<Publication> getAllPublicationsByAuthor(@RequestParam UUID authorId) {
        log.debug("Request to get publication with authorID: {}", authorId);
        //TODO
    }

    @GetMapping("/publications/")
    @Transactional
    public List<Publication> getAllPublicationsByCategory(@RequestParam UUID categoryId) {
        log.debug("Request to get publication with categoryID: {}", categoryId);
        //TODO
    }

    @GetMapping("/publications/")
    @Transactional
    public List<Publication> getAllPublicationsByCitation(@RequestParam UUID citationId) {
        log.debug("Request to get publication with citationID: {}", citationId);
        //TODO
    }

    @GetMapping("/publications/")
    @Transactional
    public List<Publication> getAllPublicationsByEdition(@RequestParam UUID editionId) {
        log.debug("Request to get publication with editionID: {}", editionId);
        //TODO
    }

    @GetMapping("/publications/")
    @Transactional
    public List<Publication> getAllPublicationsByIssue(@RequestParam UUID issueId) {
        log.debug("Request to get publication with issueID: {}", issueId);
        //TODO
    }

    @GetMapping("/publications/")
    @Transactional
    public List<Publication> getAllPublicationsByKeyword(@RequestParam UUID keywordId) {
        log.debug("Request to get publication with keywordID: {}", keywordId);
        //TODO
    }

    @PutMapping("/publications/")
    @Transactional
    public ResponseEntity<Publication> updatePublication(@RequestBody Publication publication) {
        log.debug("Put request to update publication: {}", publication);
        //TODO
        log.info("Publication with ID {} was updated", );
        log.debug("Publication data: {}", );
    }

    @DeleteMapping("/publications/{id}")
    @Transactional
    public ResponseEntity<Publication> deletePublication(@PathVariable UUID id) {
        log.debug("Request to delete publication with ID: {}", id);
        //TODO
    }
}
