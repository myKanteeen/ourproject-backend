package com.ecanteen.service.dto;


import com.ecanteen.domain.Order;
import com.ecanteen.domain.School;
import com.ecanteen.domain.enumeration.ROLE;
import org.joda.time.DateTimeZone;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link com.ecanteen.domain.Student} entity.
 */
public class StudentDTO implements Serializable {


    private Long id;
    private String fullName;

    private String email;

    private String phoneNumber;

    private String address;

    private String imageUrl;

    private Boolean isEnabled;

    private Boolean phoneVerified;

    private Boolean emailVerified;

    private String KkUesId;

    private ZonedDateTime createdDate;

    private ZonedDateTime modifiedDate;

    private String CreatedBy;

    private String modifiedBy;

    private ROLE role;

    private List <Order> orders;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public Boolean getPhoneVerified() {
        return phoneVerified;
    }

    public void setPhoneVerified(Boolean phoneVerified) {
        this.phoneVerified = phoneVerified;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getKkUesId() {
        return KkUesId;
    }

    public void setKkUesId(String kkUesId) {
        this.KkUesId = kkUesId;
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

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
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
        StudentDTO that = (StudentDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(fullName, that.fullName) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(address, that.address) && Objects.equals(imageUrl, that.imageUrl) && Objects.equals(isEnabled, that.isEnabled) && Objects.equals(phoneVerified, that.phoneVerified) && Objects.equals(emailVerified, that.emailVerified) && Objects.equals(KkUesId, that.KkUesId) && Objects.equals(createdDate, that.createdDate) && Objects.equals(modifiedDate, that.modifiedDate) && Objects.equals(CreatedBy, that.CreatedBy) && Objects.equals(modifiedBy, that.modifiedBy) && role == that.role && Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, email, phoneNumber, address, imageUrl, isEnabled, phoneVerified, emailVerified, KkUesId, createdDate, modifiedDate, CreatedBy, modifiedBy, role, orders);
    }
}
