package testForTransactional;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eaju.entity.AllOrder;
import com.eaju.mapper.OrderMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-mybatis.xml,spring-mybatis2.xml")
public class TranTest {
	@Autowired
	private OrderMapper orderMapper;
	@Test
	public void test1(){
		List<AllOrder> orderByPrimary = orderMapper.getOrderByPrimary(" ");
	}
}
