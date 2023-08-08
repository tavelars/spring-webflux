package br.com.webflux.springwebflux.service;

import br.com.webflux.springwebflux.entity.User;
import br.com.webflux.springwebflux.mapper.UserMapper;
import br.com.webflux.springwebflux.model.request.UserRequest;
import br.com.webflux.springwebflux.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public Mono<User> save(final UserRequest userRequest){
        return userRepository.save(userMapper.toEntity(userRequest));
    }
}
