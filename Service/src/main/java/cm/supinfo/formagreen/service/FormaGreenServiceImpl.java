/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.supinfo.formagreen.service;

import cm.supinfo.formagreen.models.GreenAreaModels;
import cm.supinfo.formagreen.models.GreenAreaTypeModels;
import cm.supinfo.formagreen.models.MembersModels;
import cm.supinfo.formagreen.models.MembersTypeModels;
import cm.supinfo.formagreen.repository.*;
import dtoassembler.DtoToEntity;
import dtoassembler.EntityToDto;
import java.util.List;
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

    @Override
    public void createMembers(MembersModels members) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMembers(MembersModels members) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMembers(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MembersModels> getMembers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MembersModels> scanQrCode(String matricule) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createMembersType(MembersTypeModels type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateMembersType(MembersTypeModels type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkSubscribeValidityDate(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createGreenArea(GreenAreaModels greenArea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteGreenArea(GreenAreaModels greenArea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateGreenArea(GreenAreaModels greenArea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createGreenAreaType(GreenAreaTypeModels greenAreaType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteGreenAreaType(GreenAreaTypeModels greenAreaType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateGreenAreaType(GreenAreaTypeModels greenAreaType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
