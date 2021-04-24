package org.example.domain.maps;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Maps {
    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mapIdx;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 200, nullable = false)
    private String desc;

    private Long color;

    private Long open;

    @Builder
    public Maps(String name, String desc, Long color, Long open) {
        this.name = name;
        this.desc = desc;
        this.color = color;
        this.open = open;
    }
}
