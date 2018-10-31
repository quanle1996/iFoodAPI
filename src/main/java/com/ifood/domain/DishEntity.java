package com.ifood.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "Dish", schema = "dbo", catalog = "I_Food")
public class DishEntity {
    private UUID id;
    private UUID authorId;
    private String name;
    private String description;
    private Timestamp createOn;
    private Double rate;
    private Boolean isActive;
    private Boolean isDelete;

    @Transient
    private List<IngredientEntity> ingredients;

    public List<IngredientEntity> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientEntity> ingredients) {
        this.ingredients = ingredients;
    }

    @Id
    @Column(name = "Id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AuthorId")
    public UUID getAuthorId() {
        return authorId;
    }

    public void setAuthorId(UUID authorId) {
        this.authorId = authorId;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "CreateOn")
    public Timestamp getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Timestamp createOn) {
        this.createOn = createOn;
    }

    @Basic
    @Column(name = "Rate")
    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "IsActive")
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "IsDelete")
    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DishEntity that = (DishEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(authorId, that.authorId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(createOn, that.createOn) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(isActive, that.isActive) &&
                Objects.equals(isDelete, that.isDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, authorId, name, description, createOn, rate, isActive, isDelete);
    }
}
