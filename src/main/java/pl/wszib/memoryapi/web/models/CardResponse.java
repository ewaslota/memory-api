package pl.wszib.memoryapi.web.models;

import pl.wszib.memoryapi.data.entities.CardEntity;
import pl.wszib.memoryapi.data.repositories.CardRepository;

public record CardResponse(Long id, Long categoryId, String term, String definition) {

    public CardResponse(Long categoryId, CardEntity savedCard) {
        this(
                savedCard.getId(),
                categoryId,
                savedCard.getTerm(),
                savedCard.getDefinition()
        );
    }
}
