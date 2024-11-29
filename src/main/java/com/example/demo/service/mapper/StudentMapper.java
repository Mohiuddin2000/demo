package com.example.demo.service.mapper;


import com.example.demo.domain.Student;
import com.example.demo.dto.StudentDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = {CourseMapper.class})
public interface StudentMapper {
    @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    StudentDto toDto(Student student);
    @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    Student toEntity(StudentDto studentDto);
}
