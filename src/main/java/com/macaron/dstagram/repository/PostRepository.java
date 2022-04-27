package com.macaron.dstagram.repository;

import com.macaron.dstagram.common.Status;
import com.macaron.dstagram.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> findByIdAndStatus(Long id, String status);
    List<Post> findByStatusEquals(String status);
}
