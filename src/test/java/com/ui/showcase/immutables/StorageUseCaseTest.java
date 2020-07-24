package com.ui.showcase.immutables;

import org.immutables.criteria.backend.Backend;
import org.immutables.criteria.inmemory.InMemoryBackend;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class StorageUseCaseTest {
    private static final String ID = "some id";

    @Test
    void storesInMemory() {
        Backend backend = new InMemoryBackend();
        StorageUseCaseRepository repository = new StorageUseCaseRepository(backend);
        StorageUseCase object = new StorageUseCaseBuilder()
                .id(ID)
                .name("name")
                .build();
        repository.insert(object);

        List<StorageUseCase> fetched = repository.find(StorageUseCaseCriteria.storageUseCase.id.is(ID)).fetch();

        assertThat(fetched).containsExactly(object);
    }
}