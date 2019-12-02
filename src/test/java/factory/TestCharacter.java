package factory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import com.bboss.product.dao.interfaces.SkuCharacterDao;
import com.bboss.product.entity.CharacterEntity;
import com.bboss.product.entity.TestResultMapEntity;

public class TestCharacter {
	
	 private static SqlSessionFactory factory;
	 @Before
     public void init() throws IOException {
    	 factory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));	 
     }
	 
     @Test
     public void findCharacter() {
    	 SqlSession session=factory.openSession();
    	 SkuCharacterDao dao= session.getMapper(SkuCharacterDao.class);
    	 List<Map<String,Object>> listChar= dao.findCharacter();
    	 System.out.println(listChar);
    	 for(int i=0;i<listChar.size();i++){
    		 System.out.println(listChar.get(i)); 
    	 }
    	 session.close();
     }
     
     @Test
     public void findCharacterByCharNum() {
    	 SqlSession session=factory.openSession();
    	 SkuCharacterDao dao=session.getMapper(SkuCharacterDao.class);
    	 List<CharacterEntity>  listChar= dao.findCharacterByCharNum("1000000001");
    	 System.out.println(listChar);
    	 session.close();
    	 
     }
     @Test
     public void findCharacterByCharName() {
    	 SqlSession session=factory.openSession();
    	 SkuCharacterDao dao=session.getMapper(SkuCharacterDao.class);
    	 List<TestResultMapEntity>  listChar= dao.findCharacterByCharName("集团客户联系人邮箱");
    	 System.out.println(listChar);
    	 session.close();
     }
     
     @Test
     public void insertCharacter() {
    	 // 禁止自动开启事务，手动执行事务  如果插入失败自动回滚
    	SqlSession session=factory.openSession(false);
    	SkuCharacterDao dao=session.getMapper(SkuCharacterDao.class);
    	CharacterEntity entity=new CharacterEntity();
    	entity.setId("1");
    	entity.setSkuNum("2");
    	entity.setCharName("测试产品属性名称");
    	entity.setCharNum("1000000001");
        entity.setCharType("2");
        entity.setToBossFlag("0");
//        System.out.print(entity);
    	Integer result= dao.insertCharacter(entity);
    	System.out.print(result);
    	session.commit();
    	session.close();
     }
     
     @Test
     public void updateCharNameByCharNum() {
    	 SqlSession session=factory.openSession(false);
    	 SkuCharacterDao dao=session.getMapper(SkuCharacterDao.class);
    	 Integer result = dao.updateCharNameByCharNum("1000000001","测试产品属性名称01");
    	 System.out.print(result);
    	 session.commit();
    	 session.close();
     }
     @Test
     public void deleteCharNumByCharNum() {
    	 SqlSession session = factory.openSession(false);
    	 SkuCharacterDao dao=session.getMapper(SkuCharacterDao.class);
    	 Integer result=dao.deleteCharNumByCharNum("1000000001");
    	 System.out.print(result);
    	 session.commit();
    	 session.close();
     }
}
