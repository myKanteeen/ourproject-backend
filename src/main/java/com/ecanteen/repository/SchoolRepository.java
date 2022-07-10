package com.ecanteen.repository;

import com.ecanteen.domain.School;
import org.springframework.data.jpa.repository.*;

/**
 * Spring Data SQL repository for the School entity.
 */
public interface SchoolRepository extends JpaRepository<School, Long>, JpaSpecificationExecutor<School> {}
