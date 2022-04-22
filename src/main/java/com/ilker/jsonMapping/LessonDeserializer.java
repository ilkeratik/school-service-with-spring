package com.ilker.jsonMapping;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.ilker.model.University.Lesson;

import java.io.IOException;

public class LessonDeserializer extends JsonDeserializer<Lesson> {
    @Override
    public Lesson deserialize(JsonParser j, DeserializationContext ctxt) throws IOException {
        JsonNode jsonNode = j.getCodec().readTree(j);

        String id = jsonNode.get("lessonId").asText();
        String name = jsonNode.get("lessonName").asText();

        return new Lesson(id, name);
    }
}
