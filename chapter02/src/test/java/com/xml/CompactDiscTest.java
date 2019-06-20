package com.xml;

import com.auto.soundsystem.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Qualifier注解表示限定符，指定bean完成注入；因为有2个构造体了,配置了2个bean，不知道注入哪个
 * ContextConfiguration(locations={ "classpath:soundsystem.xml"}),可以不用chapter 的KnightMain一样测试了
 *
 * @author dongmei.gao
 * @date 2019/5/22 11:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:soundsystem.xml"})
public class CompactDiscTest {
    @Autowired
    @Qualifier("compactDisc")
    private CompactDisc cd ;
    @Autowired
    @Qualifier("compactDiscList")
    private CompactDisc cdList ;

    @Test
    public void cdShouldNotBeNull(){
        cd.play();
        System.out.println("打印对象了" + cd);
        Assert.assertNotNull(cd);
    }

    @Test
    public void cdListShouldNotBeNull(){
        cdList.playList();
        System.out.println("打印对象了" + cdList);
        Assert.assertNotNull(cdList);
    }
}
