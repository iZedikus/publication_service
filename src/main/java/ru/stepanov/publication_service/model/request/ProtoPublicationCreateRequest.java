package ru.stepanov.publication_service.model.request;

public record ProtoPublicationCreateRequest(
        String title,

        String issueNumber,
        String editionTitle,

        String authorName
) {
}
