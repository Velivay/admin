package ur.veli.admin.dto;

import lombok.Data;
import ur.veli.admin.enusm.OperationType;
@Data
public class OperationDto {
    private Long id;
    private String name;
    private OperationType operationType;

}
