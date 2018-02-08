package com.liuxn.logger;


public class LogFactory {

	public static Log getLog(Class<?> clazz) {
		return new Log(clazz);
	}

}
