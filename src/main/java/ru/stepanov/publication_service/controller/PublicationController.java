package ru.stepanov.publication_service.controller;

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
import ru.stepanov.publication_service.entity.Publication;
import ru.stepanov.publication_service.model.request.PublicationCreateRequest;
import ru.stepanov.publication_service.model.response.PublicationResponse;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class PublicationController {
    @PostMapping("/publications")
    @Transactional
    public PublicationResponse createPublication(@RequestBody PublicationCreateRequest publicationCreateRequest) {
        //TODO service call
    }

    @GetMapping("/publications/{id}")
    @Transactional
    public PublicationResponse getPublicationById(@PathVariable UUID id) {
        //TODO repo call
    }

    @GetMapping("/publications/")
    @Transactional
    public List<PublicationResponse> getAllPublicationsByAuthor(@RequestParam UUID authorId) {
        //TODO
    }

    @GetMapping("/publications/")
    @Transactional
    public List<PublicationResponse> getAllPublicationsByCategory(@RequestParam UUID categoryId) {
        //TODO
    }

    @GetMapping("/publications/")
    @Transactional
    public List<PublicationResponse> getAllPublicationsByCitation(@RequestParam UUID citationId) {
        //TODO
    }

    @GetMapping("/publications/")
    @Transactional
    public List<PublicationResponse> getAllPublicationsByEdition(@RequestParam UUID editionId) {
        //TODO
    }

    @GetMapping("/publications/")
    @Transactional
    public List<PublicationResponse> getAllPublicationsByIssue(@RequestParam UUID issueId) {
        //TODO
    }

    @GetMapping("/publications/")
    @Transactional
    public List<PublicationResponse> getAllPublicationsByKeyword(@RequestParam UUID keywordId) {
        //TODO
    }

    @PutMapping("/publications/")
    @Transactional
    public ResponseEntity<PublicationResponse> updatePublication(@RequestBody Publication publication) {
        //TODO
    }

    @DeleteMapping("/publications/{id}")
    @Transactional
    public ResponseEntity<Publication> deletePublication(@PathVariable UUID id) {
        //TODO
    }
}
