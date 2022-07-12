package com.ecanteen.service.impl;

import com.ecanteen.domain.School;
import com.ecanteen.domain.enumeration.ROLE;
import com.ecanteen.repository.SchoolRepository;
import com.ecanteen.service.dto.SchoolDTO;
import com.ecanteen.service.mapper.SchoolMapper;
<<<<<<< HEAD
=======
import com.ecanteen.web.rest.TestUtil;
>>>>>>> da5ef8ca032c50bb68d9df4b958be7a1c50141d2
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.MediaType;

import javax.persistence.EntityManager;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.Objects;
import java.util.Optional;
>>>>>>> da5ef8ca032c50bb68d9df4b958be7a1c50141d2
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = SchoolServiceImpl.class)
public class SchoolServiceImplTest {
    private static final String DEFAULT_NAME = "AAAAAAAAAA";
    private static final String UPDATED_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_EMAIL = "AAAAAAAAAA";
    private static final String UPDATED_EMAIL = "BBBBBBBBBB";

    private static final String DEFAULT_PHONE_NUMBER = "AAAAAAAAAA";
    private static final String UPDATED_PHONE_NUMBER = "BBBBBBBBBB";

    private static final String DEFAULT_ADDRESS = "AAAAAAAAAA";
    private static final String UPDATED_ADDRESS = "BBBBBBBBBB";

    private static final String DEFAULT_KK_USE_ID = "AAAAAAAAAA";
    private static final String UPDATED_KK_USE_ID = "BBBBBBBBBB";

    private static final ZonedDateTime DEFAULT_CREATED_DATE = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_CREATED_DATE = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);
    private static final ZonedDateTime SMALLER_CREATED_DATE = ZonedDateTime.ofInstant(Instant.ofEpochMilli(-1L), ZoneOffset.UTC);

    private static final ZonedDateTime DEFAULT_MODIFIED_DATE = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneOffset.UTC);
    private static final ZonedDateTime UPDATED_MODIFIED_DATE = ZonedDateTime.now(ZoneId.systemDefault()).withNano(0);
    private static final ZonedDateTime SMALLER_MODIFIED_DATE = ZonedDateTime.ofInstant(Instant.ofEpochMilli(-1L), ZoneOffset.UTC);

    private static final String DEFAULT_CREATED_BY = "AAAAAAAAAA";
    private static final String UPDATED_CREATED_BY = "BBBBBBBBBB";

    private static final String DEFAULT_MODIFIED_BY = "AAAAAAAAAA";
    private static final String UPDATED_MODIFIED_BY = "BBBBBBBBBB";

    private static final ROLE DEFAULT_ROLE = ROLE.ROLE_SCHOOL;
    private static final ROLE UPDATED_ROLE = ROLE.ROLE_STUDENT;

    private static final String ENTITY_API_URL = "/api/schools";
    private static final String ENTITY_API_URL_ID = ENTITY_API_URL + "/{id}";

    private static final Random random = new Random();
    private static final AtomicLong count = new AtomicLong(random.nextInt() + (2L * Integer.MAX_VALUE));
    @MockBean
    private SchoolServiceImpl schoolServiceImpl;
    private SchoolRepository schoolRepository;
<<<<<<< HEAD
    @Autowired
    @MockBean
=======
>>>>>>> da5ef8ca032c50bb68d9df4b958be7a1c50141d2
    private EntityManager em;
    @Autowired
    private MockMvc mockMvc;
    private SchoolMapper schoolMapper;
    private School school;
    private Pageable pageable;


    /**
     * Create an entity for this test.
     * <p>
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static School createEntity(EntityManager em) {
        School school = new School();
        school.setName(DEFAULT_NAME);
        school.setEmail(DEFAULT_EMAIL);
        school.setPhoneNumber(DEFAULT_PHONE_NUMBER);
        school.setAddress(DEFAULT_ADDRESS);
        school.setCreatedDate(DEFAULT_CREATED_DATE);
        school.setKkUseId(DEFAULT_KK_USE_ID);
        school.setModifiedDate(DEFAULT_MODIFIED_DATE);
        school.setCreatedBy(DEFAULT_CREATED_BY);
        school.setModifiedBy(DEFAULT_MODIFIED_BY);
        school.setRole(DEFAULT_ROLE);
        return school;
    }

    /**
     * Create an updated entity for this test.
     * <p>
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static School createUpdatedEntity(EntityManager em) {
        School school = new School();
        school.setName(UPDATED_NAME);
        school.setEmail(UPDATED_EMAIL);
        school.setPhoneNumber(UPDATED_PHONE_NUMBER);
        school.setAddress(UPDATED_ADDRESS);
        school.setCreatedDate(UPDATED_CREATED_DATE);
        school.setKkUseId(UPDATED_KK_USE_ID);
        school.setModifiedDate(UPDATED_MODIFIED_DATE);
        school.setCreatedBy(UPDATED_CREATED_BY);
        school.setModifiedBy(UPDATED_MODIFIED_BY);
        school.setRole(UPDATED_ROLE);
        return school;
    }

    // with this annotation each test would be a SchoolServiceImpl instance
    @BeforeEach
    void setUp() {
        school = createEntity(em);
        schoolRepository = Mockito.mock(SchoolRepository.class);
<<<<<<< HEAD
=======
        schoolServiceImpl = new SchoolServiceImpl(schoolRepository, schoolMapper);
    }

    //   Unit test using Mockito : Do not want to talk to db
    @Test
    void shouldReturnSchoolDto() throws Exception {
        mockMvc.perform(post("/api/schools").contentType(MediaType.ALL).content(TestUtil.convertObjectToJsonBytes(school)))
            .andExpect(status().isCreated());

>>>>>>> da5ef8ca032c50bb68d9df4b958be7a1c50141d2
    }

    @Test
    void createSchool() throws Exception {
        int databaseSizeBeforeCreate = schoolRepository.findAll().size();
<<<<<<< HEAD
        mockMvc.perform(post("/api/schools")).andExpect(status().isOk());
=======
        mockMvc.perform(post("/api/schools", school)).andExpect(status().isOk());
>>>>>>> da5ef8ca032c50bb68d9df4b958be7a1c50141d2
//        SchoolDTO schoolDTO = org.mapstruct.factory.Mappers.getMapper(SchoolMapper.class).toDto(school);
//        System.out.println(databaseSizeBeforeCreate);
//        when(schoolRepository.save(any(School.class))).thenReturn(school);
        // Validate the School in the database
//        List<School> schoolList = schoolRepository.findAll();
//        assertThat(schoolList).hasSize(1);
//        School testSchool = schoolList.get(schoolList.size());
//        assertThat(testSchool.getName()).isEqualTo(DEFAULT_NAME);
//        assertThat(testSchool.getEmail()).isEqualTo(DEFAULT_EMAIL);
//        assertThat(testSchool.getPhoneNumber()).isEqualTo(DEFAULT_PHONE_NUMBER);
//        assertThat(testSchool.getAddress()).isEqualTo(DEFAULT_ADDRESS);
//        assertThat(testSchool.getKkUseId()).isEqualTo(DEFAULT_KK_USE_ID);
//        assertThat(testSchool.getCreatedDate()).isEqualTo(DEFAULT_CREATED_DATE);
//        assertThat(testSchool.getModifiedDate()).isEqualTo(DEFAULT_MODIFIED_DATE);
//        assertThat(testSchool.getCreatedBy()).isEqualTo(DEFAULT_CREATED_BY);
//        assertThat(testSchool.getModifiedBy()).isEqualTo(DEFAULT_MODIFIED_BY);
//        assertThat(testSchool.getRole()).isEqualTo(DEFAULT_ROLE);
    }
}
