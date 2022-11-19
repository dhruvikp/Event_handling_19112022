package com.simplilearn.listener;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.event.SweetEvent;

@Component
public class AppListener {

	@EventListener
	public void onApplicationEvent(ContextStartedEvent cse) {
		System.out.println("Context started !!!!");
	}

	@EventListener
	public void onApplicationEvent1(ContextStartedEvent cse) {
		System.out.println("Context started $$$$");
	}

	@EventListener
	public void onContextStopped(ContextStoppedEvent cse) {
		System.out.println("Context stopped &&&&");
	}

	@EventListener
	public void chetan(SweetEvent cse) {
		System.out.println("Chetan received sweet..");
	}

	@EventListener
	public void selvi(SweetEvent cse) {
		System.out.println("Selvi received sweet..");
	}
}
