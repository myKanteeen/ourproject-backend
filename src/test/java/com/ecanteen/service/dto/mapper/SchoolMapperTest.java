package com.ecanteen.service.dto.mapper;

import com.ecanteen.service.mapper.SchoolMapper;
import com.ecanteen.service.mapper.SchoolMapperImpl;
import org.junit.jupiter.api.BeforeEach;

class SchoolMapperTest {
    private SchoolMapper schoolMapper;

    @BeforeEach
    public void setUp() {
        schoolMapper = new SchoolMapperImpl();
    }
}
