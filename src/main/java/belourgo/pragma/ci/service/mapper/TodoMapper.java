package belourgo.pragma.ci.service.mapper;


import belourgo.pragma.ci.domain.*;
import belourgo.pragma.ci.service.dto.TodoDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Todo} and its DTO {@link TodoDTO}.
 */
@Mapper(componentModel = "spring", uses = {CategorieMapper.class})
public interface TodoMapper extends EntityMapper<TodoDTO, Todo> {

    @Mapping(source = "categorie.id", target = "categorieId")
    TodoDTO toDto(Todo todo);

    @Mapping(source = "categorieId", target = "categorie")
    Todo toEntity(TodoDTO todoDTO);

    default Todo fromId(Long id) {
        if (id == null) {
            return null;
        }
        Todo todo = new Todo();
        todo.setId(id);
        return todo;
    }
}
