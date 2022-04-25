/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package com.mycompany.mapper;

import com.mycompany.dto.Source;
import com.mycompany.entities.Target;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SourceTargetMapper {

    SourceTargetMapper MAPPER = Mappers.getMapper(SourceTargetMapper.class);

    @Mapping(source = "test", target = "testing")
    Target toTarget(Source s);
}
