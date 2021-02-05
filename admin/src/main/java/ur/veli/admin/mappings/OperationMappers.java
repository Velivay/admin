package ur.veli.admin.mappings;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ur.veli.admin.dto.OperationDto;
import ur.veli.admin.entyty.Operation;

@Mapper
public interface OperationMappers {
    OperationMappers INSTANCE=Mappers.getMapper(OperationMappers.class);
    Operation toOperation (OperationDto operationDto);
    OperationDto toOperationDto(Operation operation);
}
