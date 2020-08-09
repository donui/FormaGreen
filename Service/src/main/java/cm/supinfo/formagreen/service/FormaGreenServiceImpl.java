/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.supinfo.formagreen.service;

import cm.supinfo.formagreen.repository.*;
import dtoassembler.DtoToEntity;
import dtoassembler.EntityToDto;
import javax.annotation.PostConstruct;
import org.apache.commons.lang.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author ryank
 */
@Service
public class FormaGreenServiceImpl implements FormaGreenService {

    protected final Logger log = LoggerFactory.getLogger(getClass());
    private final DtoToEntity dtoToEntity;
    private final EntityToDto entityToDto;

    private final Green_areaRepository green_areaRepository;
    private final Green_area_typeRepository green_area_typeRepository;
    private final MembersRepository membersRepository;
    private final MembersTypeRepository membersTypeRepository;

    @Autowired
    public FormaGreenServiceImpl(
            @Qualifier("Green_areaRepository") Green_areaRepository green_areaRepository,
            @Qualifier("Green_area_typeRepository") Green_area_typeRepository green_area_typeRepository,
            @Qualifier("MembersRepository") MembersRepository membersRepository,
            @Qualifier("MembersTypeRepository") MembersTypeRepository membersTypeRepository,
            DtoToEntity dtoToEntity,
            EntityToDto entityToDto
    ) {
        this.green_areaRepository = green_areaRepository;
        this.entityToDto = entityToDto;
        this.dtoToEntity = dtoToEntity;
        this.green_area_typeRepository = green_area_typeRepository;
        this.membersRepository = membersRepository;
        this.membersTypeRepository = membersTypeRepository;
    }

    @PostConstruct
    public void init() {
        log.info("Initializing " + getClass().getSimpleName() + " ...");
        Validate.notNull(green_areaRepository, "");
        Validate.notNull(green_area_typeRepository, "");
        Validate.notNull(membersRepository, "");
        Validate.notNull(membersTypeRepository, "");
        Validate.notNull(entityToDto, "entityToDto must not be null");
        Validate.notNull(dtoToEntity, "dtoToEntity must not be null");
        log.info(getClass().getSimpleName() + " successfully initialized");
    }

}
