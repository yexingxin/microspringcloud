package com.yxx.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * spring的配置文件，此处通过java程序的方法配置文件，而不是.xml文件配置
 * @author 叶星鑫
 * 2021年5月24日-下午4:57:19
 */
@Configuration
public class ConfigBean {
	
	/**
	 * 负载均衡默认采用轮询算法，除此之外还有随机分配算法，等等
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	//只要在配置文件中配置了该算法，那么负载均衡时会优先使用用户自己定义的算法，否则默认使用轮询算法
	@Bean
	public IRule myRule() {
//		return new RoundRobinRule();//轮询算法
//		return new RetryRule();//重试算法，默认是轮询算法，当一个机器死机后，它试几次不可以连接，即放弃该机器
		return new RandomRule();//随机算法
//		除此之外还可以自己定义负载均衡算法
	}
	

}
