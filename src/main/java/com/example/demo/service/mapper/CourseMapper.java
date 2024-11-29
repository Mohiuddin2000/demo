package com.example.demo.service.mapper;

import com.example.demo.domain.Course;
import com.example.demo.dto.CourseDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    CourseDto toDto(Course course);

    @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
    Course toEntity(CourseDto courseDto);
}
