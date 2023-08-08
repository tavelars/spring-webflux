package br.com.webflux.springwebflux.model.response;

public record UserResponse(
        String id,
        String name,
        String email,
        String password
) {
}
