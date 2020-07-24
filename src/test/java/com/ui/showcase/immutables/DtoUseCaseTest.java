package com.ui.showcase.immutables;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


class DtoUseCaseTest {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final ObjectWriter WRITER = OBJECT_MAPPER.writer();
    private static final ObjectReader READER = OBJECT_MAPPER.reader();

    private static final String NAME = "name";
    private static final String JSON = "{\"custom_name\":\"name\"}";

    @Test
    void serializesToJson() throws JsonProcessingException {
        DtoUseCase instance = new ImmutableDtoUseCase(NAME);

        String json = WRITER.writeValueAsString(instance);

        assertThat(json).isEqualTo(JSON);
    }

    @Test
    void deserializesFromJson() throws IOException {
        DtoUseCase instance = READER.readValue(JSON, DtoUseCase.class);

        assertThat(instance.name()).isEqualTo(NAME);
    }
}