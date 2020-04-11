package belourgo.pragma.ci.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link belourgo.pragma.ci.domain.Todo} entity.
 */
public class TodoDTO implements Serializable {
    
    private Long id;

    private String tache;

    private Boolean status;


    private Long categorieId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Long categorieId) {
        this.categorieId = categorieId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TodoDTO todoDTO = (TodoDTO) o;
        if (todoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), todoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
            "id=" + getId() +
            ", tache='" + getTache() + "'" +
            ", status='" + isStatus() + "'" +
            ", categorieId=" + getCategorieId() +
            "}";
    }
}
