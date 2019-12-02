package com.bboss.product.dao.interfaces;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bboss.product.entity.CharacterEntity;
import com.bboss.product.entity.TestResultMapEntity;

public interface SkuCharacterDao {
	// 查询全部的产品属性集合
	List<Map<String,Object>> findCharacter();
	// 根据产品属性编码查询产品属性    
	// CharacterEntity是我定义的实体类，findCharacterByCharNum要保证查询的结果是唯一的，如果是多个就要定义为一个list
	List<CharacterEntity> findCharacterByCharNum(String charNum);
	// 测试resultMap获取数据
	List<TestResultMapEntity> findCharacterByCharName(String charName);
	// 向产品属性表里插入数据
    Integer insertCharacter(CharacterEntity entity);
    
    Integer updateCharNameByCharNum(@Param("charNum")String charNum,@Param("charName") String charName);
    
    Integer deleteCharNumByCharNum(String charNum);
}
