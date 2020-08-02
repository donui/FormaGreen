/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.supinfo.formagreen.repository;

import cm.supinfo.formagreen.domain.Members_typeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ryank
 */

@Repository("MembersTypeInterface")
public interface MembersTypeInterface extends JpaRepository<Members_typeEntity,Long>{
    
}
