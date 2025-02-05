package com.management.jobadvertisements1.article.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArticleCreateRequestDto {

    Long fkUserId;

    String title;

    String description;

    LocalDate publishedDate;

    String imageUrl;

    String category;


}
