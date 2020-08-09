/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtoassembler;

import cm.supinfo.formagreen.domain.Green_areaEntity;
import cm.supinfo.formagreen.domain.Green_area_typeEntity;
import cm.supinfo.formagreen.domain.MembersEntity;
import cm.supinfo.formagreen.domain.Members_typeEntity;
import cm.supinfo.formagreen.models.GreenAreaModels;
import cm.supinfo.formagreen.models.GreenAreaTypeModels;
import cm.supinfo.formagreen.models.MembersModels;
import cm.supinfo.formagreen.models.MembersTypeModels;

/**
 *
 * @author ryank
 */
public class DtoToEntityImpl implements DtoToEntity {

    @Override
    public MembersModels parseToEntity(MembersEntity data) {

        MembersModels mem = new MembersModels();
        mem.setAge(data.getAge());
        mem.setEmail(data.getEmail());
        mem.setId(data.getId());
        mem.setMaticule(data.getMatricule());
        mem.setNom(data.getName());
        mem.setPrenom(data.getFirstname());
        mem.setSex(data.getSex());
        mem.setSubscribeDate(data.getSubscription_date());
        mem.setType_de_compte(data.getMembers_typeId().getId());
        mem.setTéléphone(data.getTelephone());

        return mem;
    }

    @Override
    public MembersTypeModels parseToEntity(Members_typeEntity data) {
        MembersTypeModels mem = new MembersTypeModels();
        mem.setId(data.getId());
        mem.setName(data.getName());
        return mem;
    }

    @Override
    public GreenAreaModels parseToEntity(Green_areaEntity data) {
        GreenAreaModels green = new GreenAreaModels();
        green.setId(data.getId());
        green.setLocation(data.getLocation());
        green.setMatricule(data.getMatricule());
        green.setName(data.getName());
        return green;
    }

    @Override
    public GreenAreaTypeModels parseToEntity(Green_area_typeEntity data) {
        GreenAreaTypeModels green = new GreenAreaTypeModels();
        green.setId(data.getId());
        green.setName(data.getName());
        return green;
    }

}
