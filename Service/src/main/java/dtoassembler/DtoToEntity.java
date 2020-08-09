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
public interface DtoToEntity {

    public MembersModels parseToEntity(MembersEntity data);

    public MembersTypeModels parseToEntity(Members_typeEntity data);

    public GreenAreaModels parseToEntity(Green_areaEntity data);

    public GreenAreaTypeModels parseToEntity(Green_area_typeEntity data);
}
