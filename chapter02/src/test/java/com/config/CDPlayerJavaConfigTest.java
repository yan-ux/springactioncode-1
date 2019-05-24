package com.config;

import com.auto.soundsystem.CompactDisc;
import com.auto.soundsystem.MediaPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dongmei.gao
 * @date 2019/5/21 14:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class )
public class CDPlayerJavaConfigTest {
    @Autowired
    private CompactDisc cd ;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull(){
        System.out.println("打印对象了" + cd);
        Assert.assertNotNull(cd);
    }

    @Test
    public void play(){
        mediaPlayer.player();
    }
}
