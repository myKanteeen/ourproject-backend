package com.ecanteen.service.dto;

import com.ecanteen.domain.Order;
import com.ecanteen.domain.enumeration.ROLE;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Objects;


/**
 * A DTO for the {@link com.ecanteen.domain.Order} entity.
 */
public class OrderDTO {

    private Long id;
    private String orderNumber;

    private String orderCode;

    private ZonedDateTime createdDate;

    private ZonedDateTime modifiedDate;

    private List<Order> orders;

    private ROLE role;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public ZonedDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(ZonedDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDTO orderDTO = (OrderDTO) o;
        return Objects.equals(id, orderDTO.id) && Objects.equals(orderNumber, orderDTO.orderNumber) && Objects.equals(orderCode, orderDTO.orderCode) && Objects.equals(createdDate, orderDTO.createdDate) && Objects.equals(modifiedDate, orderDTO.modifiedDate) && Objects.equals(orders, orderDTO.orders) && role == orderDTO.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNumber, orderCode, createdDate, modifiedDate, orders, role);
    }
}
