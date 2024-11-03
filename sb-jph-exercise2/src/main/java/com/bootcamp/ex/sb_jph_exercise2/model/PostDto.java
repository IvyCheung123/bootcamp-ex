package com.bootcamp.ex.sb_jph_exercise2.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PostDto {
  private Long id;
  private String title;
  private String body;
  @Builder.Default
  private List<CommentDto> comments = new ArrayList<>();
}