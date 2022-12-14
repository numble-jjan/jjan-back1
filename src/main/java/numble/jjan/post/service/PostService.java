package numble.jjan.post.service;

import numble.jjan.post.dto.PostListResponseDto;
import numble.jjan.post.dto.PostResponseDto;
import numble.jjan.post.dto.PostSaveRequestDto;
import numble.jjan.post.dto.PostUpdateRequestDto;

import java.util.List;

public interface PostService {

    Long save(PostSaveRequestDto requestDto);

    Long update(Long id, PostUpdateRequestDto requestDto);

    PostResponseDto findById(Long id);

    List<PostListResponseDto> findAllDesc();

    void delete(Long id);
}
