package study.querydsl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


//동작테스트 엔티티
@Entity
@Getter @Setter
public class Hello {

    @Id @GeneratedValue
    private Long id;
}
