package com.enigma.EnigmaREST.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JsonDeviceInfo {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private Long latitude;
    @JsonProperty
    private Long longitude;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder
                .append("JsonDeviceInfo:")
                .append("\n\t")
                .append("ID: ").append(id)
                .append("\n\t")
                .append("Latitude: ").append(latitude)
                .append("\n\t")
                .append("Longitude: ").append(longitude);

        return builder.toString();
    }
}
