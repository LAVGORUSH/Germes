package com.lavgorush.germes.app.model.entity.base;

import com.lavgorush.germes.app.model.entity.person.Account;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Base class for all business entities
 *
 * @author admin
 */
public abstract class AbstractEntity {
    /**
     * Unique entity identifier
     */
    private int id;
    /**
     * Timestamp of entity creation
     */
    private LocalDateTime createdAt;
    /**
     * Timestamp of entity modified
     */
    private LocalDateTime modifiedAt;
    /**
     * Person who create specific entity
     */
    private Account createdBy;
    /**
     * Last person modified entity
     */
    private Account modifiedBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Account getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Account createdBy) {
        this.createdBy = createdBy;
    }

    public Account getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Account modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
