package com.auto.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配（***不适用在****）：在使用第三方组件时不可用，因为无法在他的jar包上加入component,autowire等
 *
 * 制定自动扫描的包配置，相当文档的CDplayerConfig类 ，自动扫描类可以设置为空的接口
 *
 * ComponentScan用来开启组件扫描，默认扫描和该类相同的包及其子包；
 * (1)basePackageClasses ,号分隔指定多个类
 * (2)basePackages制定扫描的包
 *
 * @author dongmei.gao
 * @date 2019/5/21 9:33
 */

/* 方法一
@Configuration
@ComponentScan(basePackageClasses = SgtPeppers.class)*/

@Configuration
@ComponentScan(basePackages = "com.auto.soundsystem")
public class AutoConfig {

}
