package com.eaju.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;


public class SingletonThreadPool {
	private ExecutorService threadPool;
	private static Logger logger = Logger.getLogger(SingletonThreadPool.class);

	private SingletonThreadPool() {
		threadPool = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1500),
				new RejectedExecutionHandler() {
					@Override
					public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
						// TODO Auto-generated method stub
						logger.error("线程池队列溢出");
					}
				});
	}

	private static class SingletonContainer {
		private static SingletonThreadPool instance = new SingletonThreadPool();
	}

	public static SingletonThreadPool getInstance() {
		return SingletonContainer.instance;
	}

	public ExecutorService getThreadPool() {
		return threadPool;
	}
}
