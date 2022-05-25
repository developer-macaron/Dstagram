package com.macaron.dstagram.service;

import com.macaron.dstagram.common.Status;
import com.macaron.dstagram.domain.Post;
import com.macaron.dstagram.repository.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    // TODO: hazel 나중에 요청에 대한 유저정보를 가져와서 요청 시 처리해야 한다. -> 파라미터 다시 생각해보기
    // TODO : hazel 추후에 리밋처리 필요할 듯?
    public List<Post> findActiveList() {
        return postRepository.findByStatusEquals(Status.ACTIVE.name());
    }

    public Optional<Post> findByPostId(Long postId) throws Exception {
        Optional<Post> post = postRepository.findOneByIdAndStatus(postId, Status.ACTIVE.name());
        if(post.isEmpty()) throw new Exception("post 없음"); // TODO : hazel 공통 Exception 만들기
        return postRepository.findById(postId);
    }

    public Optional<Post> findByPostIdIncludeDeletedPost(Long postId) throws Exception {
        Optional<Post> post = postRepository.findById(postId);
        if(post.isEmpty()) throw new Exception("post 없음");
        return postRepository.findById(postId);
    }

    public Post createPost(Post post) {
        // TODO : hazel attachment 저장도 추후에 추가되어야 한다.
        return postRepository.save(post);
    }

    @Transactional
    public void deletePost(Long postId) throws Exception {
        Optional<Post> post = postRepository.findOneByIdAndStatus(postId, Status.ACTIVE.name());
        if(post.isEmpty()) throw new Exception("post 없음");
        else post.get().setStatus(Status.DELETED.name());
    }

    @Transactional
    public void updatePost(Post post) throws Exception {
        Optional<Post> originPost = postRepository.findById(post.getId());
        if(originPost.isPresent()) {
            originPost.get().setContent(post.getContent());
            originPost.get().setGeoInfoId(post.getGeoInfoId());
        } else {
            throw new Exception("post 없음");
        }
    }
}
