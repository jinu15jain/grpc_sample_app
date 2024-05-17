package org.example.grpc.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UserData")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="identifier")
    private Long id;
    @Column(name="fullName", length = 40, nullable = false)
    private String fullName;
    @Column(name="email", length = 50, unique = true, nullable = false)
    private String email;
}
