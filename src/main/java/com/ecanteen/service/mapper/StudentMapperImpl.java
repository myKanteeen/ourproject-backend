package com.ecanteen.service.mapper;


import com.ecanteen.domain.Student;
import com.ecanteen.service.dto.StudentDTO;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;



@Component
public class StudentMapperImpl implements StudentMapper {
    @Override
    public Student toEntity(StudentDTO dto) {
        if (dto == null) {
            return null;
        }

        Student student = new Student();

        student.setId(dto.getId());
        student.setFullName(dto.getFullName());
        student.setEmail(dto.getEmail());
        student.setAddress(dto.getAddress());
        student.setImageUrl(dto.getImageUrl());
        student.setIsEnabled(dto.getEnabled());
        student.setKkUesId(dto.getKkUesId());
        student.setCreatedBy(dto.getCreatedBy());
        student.setCreatedDate(dto.getCreatedDate());
        student.setModifiedBy(dto.getModifiedBy());
        student.setEmailVerified(dto.getEmailVerified());
        student.setPhoneVerified(dto.getPhoneVerified());
        student.setPhoneNumber(dto.getPhoneNumber());
        student.setModifiedDate(dto.getModifiedDate());
        student.setRole(dto.getRole());

        return student;
    }

    @Override
    public StudentDTO toDto(Student entity) {
        if (entity == null) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        Student student = new Student();
        student.setId(entity.getId());
        student.setFullName(entity.getFullName());
        student.setEmail(entity.getEmail());
        student.setAddress(entity.getAddress());
        student.setImageUrl(entity.getImageUrl());
        student.setIsEnabled(entity.getIsEnabled());
        student.setKkUesId(entity.getKkUesId());
        student.setCreatedBy(entity.getCreatedBy());
        student.setCreatedDate(entity.getCreatedDate());
        student.setModifiedBy(entity.getModifiedBy());
        student.setEmailVerified(entity.getEmailVerified());
        student.setPhoneVerified(entity.getPhoneVerified());
        student.setPhoneNumber(entity.getPhoneNumber());
        student.setModifiedDate(entity.getModifiedDate());
        student.setRole(entity.getRole());
        return studentDTO;
    }

    @Override
    public List<Student> toEntity(List<StudentDTO> dtoList) {
        if (dtoList == null) {
            return null;
        }

        List<Student> list = new ArrayList<Student>(dtoList.size());
        for (StudentDTO studentDTO : dtoList) {
            list.add(toEntity(studentDTO));
        }

        return list;
    }

    @Override
    public List<StudentDTO> toDto(List<Student> entityList) {
        if (entityList == null) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>(entityList.size());
        for (Student student : entityList) {
            list.add(toDto(student));
        }

        return list;
    }

    @Override
    public void partialUpdate(Student entity, StudentDTO dto) {
        if (dto == null) {
            return;
        }


        Student student = new Student();
        student.setId(entity.getId());
        student.setFullName(entity.getFullName());
        student.setEmail(entity.getEmail());
        student.setAddress(entity.getAddress());
        student.setImageUrl(entity.getImageUrl());
        student.setIsEnabled(entity.getIsEnabled());
        student.setKkUesId(entity.getKkUesId());
        student.setCreatedBy(entity.getCreatedBy());
        student.setCreatedDate(entity.getCreatedDate());
        student.setModifiedBy(entity.getModifiedBy());
        student.setEmailVerified(entity.getEmailVerified());
        student.setPhoneVerified(entity.getPhoneVerified());
        student.setPhoneNumber(entity.getPhoneNumber());
        student.setModifiedDate(entity.getModifiedDate());
        student.setRole(entity.getRole());


        if (dto.getId() != null) {
            entity.setId(dto.getId());
        }
        if (dto.getFullName() != null) {
            entity.setFullName(dto.getFullName());
        }
        if (dto.getEmail() != null) {
            entity.setEmail(dto.getEmail());
        }
        if (dto.getImageUrl() != null) {
            entity.setImageUrl(dto.getImageUrl());
        }
        if (dto.getEnabled() != null) {
            entity.setIsEnabled(dto.getEnabled());
        }
        if (dto.getKkUesId() != null) {
            entity.setKkUesId(dto.getKkUesId());
        }
        if (dto.getCreatedBy() != null) {
            entity.setCreatedBy(dto.getCreatedBy());
        }
        if (dto.getModifiedBy() != null) {
            entity.setModifiedBy(dto.getModifiedBy());
        }
        if (dto.getEmailVerified() != null) {
            entity.setEmailVerified(dto.getEmailVerified());
        }
        if (dto.getModifiedDate() != null) {
            entity.setModifiedDate(dto.getModifiedDate());
        }
        if (dto.getCreatedDate() != null) {
            entity.setCreatedDate(dto.getCreatedDate());
        }
        if (dto.getPhoneNumber() != null) {
            entity.setPhoneNumber(dto.getPhoneNumber());
        }
        if (dto.getPhoneVerified() != null) {
            entity.setPhoneVerified(dto.getPhoneVerified());
        }
        if (dto.getAddress() != null) {
            entity.setAddress(dto.getAddress());
        }
        if (dto.getRole() != null) {
            entity.setRole(dto.getRole());
        }


    }
}
