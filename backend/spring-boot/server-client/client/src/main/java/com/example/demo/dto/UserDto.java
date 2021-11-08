package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    @JsonIgnore
    Long id;
    String name;
    String family;
    @JsonIgnore
    String nationalCode;

}
