package com.enigma.EnigmaREST.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class JsonTask {
    @JsonProperty
    private String name;

    @Override
    public String toString() {
        return "Task: "+name;
    }
}
