package com.auto;

import com.auto.soundsystem.AutoConfig;
import com.auto.soundsystem.CompactDisc;
import com.auto.soundsystem.MediaPlayer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dongmei.gao
 * @date 2019/5/21 11:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoConfig.class)
public class CDPlayerTest {
    /**获取控制台输出内容的*/
    @Rule
    public StandardOutputStreamLog log = new StandardOutputStreamLog();
    //只有一个实现，new CDPlayer
    @Autowired
    private MediaPlayer mediaPlayer;
    @Autowired
    private CompactDisc cd ;

    @Test
    public void cdShouldNotBeNull(){
        System.out.println("打印对象了" + cd);
        Assert.assertNotNull(cd);
    }
    /**
     * '\r' 回车，回到当前行的行首，而不会换到下一行，如果接着输出的话，本行以前的内容会被逐一覆盖；
     * '\n' 换行，换到当前位置的下一行，而不会回到行首；
     *  Unix系统里，每行结尾只有“<换行>”，即"\n"；Windows系统里面，每行结尾是“<回车><换行>”，即“\r\n”；Mac系统里，每行结尾是“<回车>”，即"\r"；
     */
    @Test
    public void play(){
        mediaPlayer.player();
        Assert.assertEquals("PlayingSgt Peppers Lonely Heart Club Band by The Beatles\r\n",log.getLog());
    }
}
