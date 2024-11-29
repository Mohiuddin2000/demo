package com.example.demo.dto;

import com.example.demo.domain.Course;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private Long rollNo;
    private List<CourseDto> courses;
}
