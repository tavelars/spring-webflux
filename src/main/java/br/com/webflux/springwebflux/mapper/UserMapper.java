package br.com.webflux.springwebflux.mapper;

import br.com.webflux.springwebflux.entity.User;
import br.com.webflux.springwebflux.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = IGNORE,
        nullValueCheckStrategy = ALWAYS
)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(final UserRequest userRequest);

}
