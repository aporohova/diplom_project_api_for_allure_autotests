package models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectResponse {
    String name, createdBy, lastModifiedBy;
    int id;
    boolean isPublic;
    Long createdDate,lastModifiedDate;
}
