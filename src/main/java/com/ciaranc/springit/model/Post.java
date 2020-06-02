package com.ciaranc.springit.model;

import lombok.*;
import javax.validation.constraints.NotBlank;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.Instant;

@Data //generates getters/setters
@Entity
@Builder //generates builder methods
@AllArgsConstructor //generates constructors
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @NotBlank(message = "Post can not be empty")
    private String postName;
    @Nullable
    private String url;
    @org.springframework.lang.Nullable @Lob private String description;
    private Integer voteCount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId") private User user;
    private Instant createdDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Subspringit subspringit;
}
