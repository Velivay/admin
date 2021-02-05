package ur.veli.admin.mappings;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ur.veli.admin.dto.AdminDto;
import ur.veli.admin.entyty.Admin;

@Mapper
public interface AdminMappers {
    AdminMappers INSTANCE= Mappers.getMapper(AdminMappers.class);
    Admin toAdmin(AdminDto adminDto);
    AdminDto toAdminDto(Admin admin);
}
