package com.config;

import com.auto.soundsystem.CDPlayer;
import com.auto.soundsystem.CompactDisc;
import com.auto.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration表明该类是一个配置类，该类应该包含在spring应用上下文如何创建bean的细节
 *
 * @author dongmei.gao
 * @date 2019/5/21 14:08
 */
@Configuration
public class JavaConfig {
    /**bean id 默认和方法名字同*/
    @Bean
    public CompactDisc sgtPeppers(){
        System.out.println("创建对象了----------------------");
        return new SgtPeppers();
    }

    @Bean
   public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
   }

}
