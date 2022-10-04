package com.shizuca.sazuki.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder
public class User
{
    @JsonProperty
    private int id;
    @JsonProperty
    private String firstName;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private String birthDay;
    @JsonProperty
    private String sex;
    @JsonProperty
    private String religion;
    @JsonProperty
    private String nationality;
    @JsonProperty
    private String corporate;

    public User getCloneUser(int id) {
        return User.builder()
            .id(id)
            .firstName("Shizuka")
            .lastName("Sazuki")
            .birthDay("2005-12-12")
            .sex("Female")
            .religion("")
            .nationality("Javanese")
            .corporate("Rikkei Japan")
            .build();
    }
}
