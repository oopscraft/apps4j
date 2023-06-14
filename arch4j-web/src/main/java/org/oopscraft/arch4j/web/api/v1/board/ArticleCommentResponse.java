package org.oopscraft.arch4j.web.api.v1.board;

import lombok.*;
import org.oopscraft.arch4j.core.board.ArticleComment;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ArticleCommentResponse {

    private String articleId;

    private String commentId;

    private String parentCommentId;

    private LocalDateTime createdAt;

    private String content;

    private String userId;

    private String userName;

    @Builder.Default
    private Long likeCount = 0L;

    /**
     * factory method
     * @param articleComment article comment
     * @return article comment response
     */
    public static ArticleCommentResponse from(ArticleComment articleComment) {
        return ArticleCommentResponse.builder()
                .articleId(articleComment.getArticleId())
                .commentId(articleComment.getCommentId())
                .parentCommentId(articleComment.getParentCommentId())
                .createdAt(articleComment.getCreatedAt())
                .content(articleComment.getContent())
                .userId(articleComment.getUserId())
                .userName(articleComment.getUserName())
                .likeCount(articleComment.getLikeCount())
                .build();
    }

}