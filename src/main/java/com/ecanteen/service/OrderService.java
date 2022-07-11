package com.ecanteen.service;

import com.ecanteen.service.dto.OrderDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

/**
 * Service Interface for managing {@link com.ecanteen.domain.Order}.
 */

public interface OrderService  {

    OrderDTO save(OrderDTO orderDTO);


    OrderDTO update(OrderDTO orderDTO);

    Optional<OrderDTO> partialUpdate(OrderDTO orderDTO);

    Page<OrderDTO> findAll(Pageable pageable);


    Optional<OrderDTO> findOne(Long id);


    void delete(Long id);
}

