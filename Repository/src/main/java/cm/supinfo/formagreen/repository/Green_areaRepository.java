/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.supinfo.formagreen.repository;

import cm.supinfo.formagreen.domain.Green_areaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ryank
 */
@Repository("Green_areaRepository")
public interface Green_areaRepository extends JpaRepository<Green_areaEntity, Long> {

}
