package com.qf.service.impl;


import com.qf.entity.Student;
import com.qf.mapper.StudentMapper;
import com.qf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getStudentList() {
        return studentMapper.getStudentList();
    }
}
