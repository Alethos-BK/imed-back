package com.unifeso.Imed.domain.usuario.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.unifeso.Imed.domain.rating.entity.RatingEntity;
import com.unifeso.Imed.domain.utils.Address;
import com.unifeso.Imed.domain.utils.Characterization;
import com.unifeso.Imed.domain.utils.Image;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name= "user")
public class UserEntity {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @Column(name= "name", nullable = false)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false)
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false)
    private Image mainImage;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false)
    private Characterization preferences;

    public UserEntity(Long id, String name, Address address, Image mainImage, Characterization preferences, List<RatingEntity> ratings) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mainImage = mainImage;
        this.preferences = preferences;
        this.ratings = ratings;
    }

    public List<RatingEntity> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingEntity> ratings) {
        this.ratings = ratings;
    }

    public Characterization getPreferences() {
        return preferences;
    }

    public void setPreferences(Characterization preferences) {
        this.preferences = preferences;
    }

    public Image getMainImage() {
        return mainImage;
    }

    public void setMainImage(Image mainImage) {
        this.mainImage = mainImage;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false)
    private List<RatingEntity> ratings;
}
