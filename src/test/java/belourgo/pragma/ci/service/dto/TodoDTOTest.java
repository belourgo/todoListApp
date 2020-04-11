package belourgo.pragma.ci.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import belourgo.pragma.ci.web.rest.TestUtil;

public class TodoDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(TodoDTO.class);
        TodoDTO todoDTO1 = new TodoDTO();
        todoDTO1.setId(1L);
        TodoDTO todoDTO2 = new TodoDTO();
        assertThat(todoDTO1).isNotEqualTo(todoDTO2);
        todoDTO2.setId(todoDTO1.getId());
        assertThat(todoDTO1).isEqualTo(todoDTO2);
        todoDTO2.setId(2L);
        assertThat(todoDTO1).isNotEqualTo(todoDTO2);
        todoDTO1.setId(null);
        assertThat(todoDTO1).isNotEqualTo(todoDTO2);
    }
}
