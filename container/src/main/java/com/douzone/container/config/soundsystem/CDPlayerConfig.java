package com.douzone.container.config.soundsystem;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
// 스케닝 위치 알려주기
@ComponentScan(basePackages = {"com.douzone.container.soundsystem"})
public class CDPlayerConfig {
	//명시 할것이 없기 때문에 비워 놓는다
}
