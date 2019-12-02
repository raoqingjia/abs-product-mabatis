package com.bboss.product.dao.interfaces;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bboss.product.entity.CharacterEntity;
import com.bboss.product.entity.TestResultMapEntity;

public interface SkuCharacterDao {
	// ��ѯȫ���Ĳ�Ʒ���Լ���
	List<Map<String,Object>> findCharacter();
	// ���ݲ�Ʒ���Ա����ѯ��Ʒ����    
	// CharacterEntity���Ҷ����ʵ���࣬findCharacterByCharNumҪ��֤��ѯ�Ľ����Ψһ�ģ�����Ƕ����Ҫ����Ϊһ��list
	List<CharacterEntity> findCharacterByCharNum(String charNum);
	// ����resultMap��ȡ����
	List<TestResultMapEntity> findCharacterByCharName(String charName);
	// ���Ʒ���Ա����������
    Integer insertCharacter(CharacterEntity entity);
    
    Integer updateCharNameByCharNum(@Param("charNum")String charNum,@Param("charName") String charName);
    
    Integer deleteCharNumByCharNum(String charNum);
}
