package com.simplilearn.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.simplilearn.event.SweetEvent;

@Component
public class SweetEventPublisher implements ApplicationEventPublisherAware {

	ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}
	
	public void distributeSweet() {
		SweetEvent se = new SweetEvent(this);
		publisher.publishEvent(se);
	}

}
