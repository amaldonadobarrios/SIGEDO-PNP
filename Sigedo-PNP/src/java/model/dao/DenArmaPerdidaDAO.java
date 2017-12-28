/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.dto.DenArmaPerdida;

/**
 *
 * @author 31424836
 */
public interface DenArmaPerdidaDAO {
    public List<DenArmaPerdida> getDenArmaPerdidaxSerie(String serie) throws  Exception;
}
