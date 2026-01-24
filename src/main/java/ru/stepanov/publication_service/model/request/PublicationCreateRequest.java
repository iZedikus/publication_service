package ru.stepanov.publication_service.model.request;

import java.util.Set;

// При загрузке публикации в сервис в нем автоматически будут созданы все вытекающие группы
public record PublicationCreateRequest(
        String title,
        String annotation,
        String content,

        Integer pageNumber,
        Integer pageCount,

        String issueNumber,
        String editionTitle,

        String authorName,

        Set<String> keywords,
        Set<ProtoPublicationCreateRequest> links
) {
}
