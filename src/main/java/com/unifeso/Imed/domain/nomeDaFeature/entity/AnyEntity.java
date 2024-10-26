package com.unifeso.Imed.domain.nomeDaFeature.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "anyTable")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Builder
public class AnyEntity {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @Column(name= "field", nullable = false)
    private String field;

//    private InsideAny insideAny;

}
