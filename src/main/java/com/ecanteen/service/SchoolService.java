package com.ecanteen.service;

import com.ecanteen.service.dto.SchoolDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link com.ecanteen.domain.School}.
 */
public interface SchoolService {
    /**
     * Save a school.
     *
     * @param schoolDTO the entity to save.
     * @return the persisted entity.
     */
    SchoolDTO save(SchoolDTO schoolDTO);

    /**
     * Updates a school.
     *
     * @param schoolDTO the entity to update.
     * @return the persisted entity.
     */
    SchoolDTO update(SchoolDTO schoolDTO);

    /**
     * Partially updates a school.
     *
     * @param schoolDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<SchoolDTO> partialUpdate(SchoolDTO schoolDTO);

    /**
     * Get all the schools.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<SchoolDTO> findAll(Pageable pageable);

    /**
     * Get the "id" school.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<SchoolDTO> findOne(Long id);

    /**
     * Delete the "id" school.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
