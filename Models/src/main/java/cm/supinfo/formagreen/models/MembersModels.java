/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.supinfo.formagreen.models;

import java.util.Date;
import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;

/**
 *
 * @author ryank
 */
@Getter
@Setter
public class MembersModels {

    @Min(value = 1L)
    private Long id;
    private String nom;
    private String prenom;

    @Min(value = 1)
    private int age;

    private String sex;

    @Email
    private String email;

    private String téléphone;

    private String maticule;

    @PastOrPresent
    private Date subscribeDate;

    @Min(value = 1L)
    private Long type_de_compte;

}
