import com.itcast.ssm.dao.ItemsMapper;
import com.itcast.ssm.pojo.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsMapperTest {
    @Test
    public void testFindItemsById() {
        // 获取spring容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取Mapper
        ItemsMapper itemMapper = applicationContext.getBean(ItemsMapper.class);
        // 调用mapper方法
        Items items = itemMapper.findById(1);
        System.out.println(items);
    }
}
