package com.demo.common.json.databind;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class NullValueSerializer extends JsonSerializer<Object> {

	@Override
	public void serialize(Object value, JsonGenerator jgen,
			SerializerProvider sp) throws IOException, JsonProcessingException {
		jgen.writeString("");
	}

}
