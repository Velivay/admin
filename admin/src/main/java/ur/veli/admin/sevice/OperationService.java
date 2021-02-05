package ur.veli.admin.sevice;

import ur.veli.admin.dto.OperationDto;
import ur.veli.admin.response.Response;

public interface OperationService {
    Response save(OperationDto operationDto);

    Response newOperation(Long id);

    Response editOperation(Long id);

    Response deleteOperation(Long id);

    OperationDto getOperationById(Long operationId);
}
