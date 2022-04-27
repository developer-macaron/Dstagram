package com.macaron.dstagram.service;

import com.macaron.dstagram.common.Status;
import com.macaron.dstagram.domain.Post;
import com.macaron.dstagram.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class PostServiceTest {
    @Autowired
    private PostService postService;

    private Long correctPostId = 1L;
    private Long wrongPostId = -1L;
    private Post testPost = Post.builder()
            .accountId(-1L)
            .status(Status.ACTIVE.name())
            .content("테스트")
            .geoInfoId(-1L)
            .build();

    @Test
    public void postId로_post_조회시_입력한Id와_조회된Id가_동일하다() throws Exception {

        Optional<Post> post = postService.findByPostId(correctPostId);
        assertEquals(post.get().getId(), correctPostId);
    }

    @Test
    public void 존재하지_않는_postId로_post_조회시_Exception_발생한다() throws Exception {
        try {
            postService.findByPostId(wrongPostId);
        } catch (Exception e) {
            assertEquals("post 없음", e.getMessage());
        }
    }

    @Test
    public void 신규_post_생성() {
        int beforePostListLength = postService.findActiveList().size();
        postService.createPost(testPost);
        int afterPostListLength = postService.findActiveList().size();
        assertEquals(afterPostListLength, beforePostListLength+1);
    }

    @Test
    public void post_삭제() {

    }

    @Test
    public void post_수정() {

    }

}
