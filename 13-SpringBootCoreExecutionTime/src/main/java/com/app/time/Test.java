package com.app.time;

import java.time.Duration;

import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


@Component
public class Test 
{
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println("START");
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			Math.pow( Math.pow(i+1,2), i+3);
		}
		System.out.println("DONE");
		Duration timeTakenToStartup = Duration.ofNanos(System.nanoTime() - startTime);
		
		System.out.println(timeTakenToStartup.getSeconds());
		System.out.println(timeTakenToStartup.getNano());
	}

	public static void main1(String[] args) {
		StopWatch sw = new StopWatch();
		
		sw.start();
		System.out.println("START");
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			Math.pow( Math.pow(i+1,2), i+3);
		}
		sw.stop();
		
		System.out.println("DONE");
		
		System.out.println(sw.getTotalTimeSeconds());
		System.out.println(sw.getTotalTimeMillis());
		System.out.println(sw.getTotalTimeNanos());

	}

}
