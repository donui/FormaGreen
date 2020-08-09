/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.supinfo.formagreen.service;

import cm.supinfo.formagreen.models.MembersModels;
import cm.supinfo.formagreen.models.*;
import java.util.List;

/**
 *
 * @author ryank
 */
public interface FormaGreenService {

    public void createMembers(MembersModels members);

    public void updateMembers(MembersModels members);

    public void deleteMembers(Long id);

    public List<MembersModels> getMembers();

    public List<MembersModels> scanQrCode(String matricule);

    public void createMembersType(MembersTypeModels type);

    public void updateMembersType(MembersTypeModels type);

    public boolean checkSubscribeValidityDate(Long id);

    public void createGreenArea(GreenAreaModels greenArea);

    public void deleteGreenArea(GreenAreaModels greenArea);

    public void updateGreenArea(GreenAreaModels greenArea);

    public void createGreenAreaType(GreenAreaTypeModels greenAreaType);

    public void deleteGreenAreaType(GreenAreaTypeModels greenAreaType);

    public void updateGreenAreaType(GreenAreaTypeModels greenAreaType);

    // public void createMembers()
}
