package com.ecanteen.domain;


import com.ecanteen.domain.enumeration.ROLE;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "order")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "orderName")
    private String orderNumber;

    @Column(name = "orderCode")
    private String orderCode;


    @Column(name = "createdDate")
    private ZonedDateTime createdDate;


    @Column(name = "modifiedDate")
    private ZonedDateTime modifiedDate;


    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private ROLE role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private List<Student> orders = new ArrayList<Student>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(orderNumber, order.orderNumber) && Objects.equals(orderCode, order.orderCode) && Objects.equals(createdDate, order.createdDate) && Objects.equals(modifiedDate, order.modifiedDate) && role == order.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNumber, orderCode, createdDate, modifiedDate, role);
    }
}
