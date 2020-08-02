/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.supinfo.formagreen.repository;

import cm.supinfo.formagreen.domain.Green_area_typeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ryank
 */

@Repository("Green_area_typeRepository")
public interface Green_area_typeInterface extends JpaRepository<Green_area_typeEntity, Long> {
    
}
