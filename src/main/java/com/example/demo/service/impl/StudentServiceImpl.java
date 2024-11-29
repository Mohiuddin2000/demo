package com.example.demo.service.impl;

import com.example.demo.dto.StudentDto;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import com.example.demo.service.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    public StudentDto saveStudent(StudentDto studentDto){
        return studentMapper.toDto(studentRepository.save(studentMapper.toEntity(studentDto)));
    }
}
