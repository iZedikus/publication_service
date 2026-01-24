package ru.stepanov.publication_service.model.response;

import java.util.Set;
import java.util.UUID;

public record PublicationResponse(
        UUID id,

        String title,
        String annotation,
        String content,

        Integer pageNumber,
        Integer pageCount,

        UUID issueId,
        UUID editionId,

        Set<UUID> authorIds,

        Set<UUID> keywordIds
) {
}
