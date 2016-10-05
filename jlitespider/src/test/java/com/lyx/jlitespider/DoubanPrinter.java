package com.lyx.jlitespider;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.lyx.jlitespider.core.Freeman;
import com.lyx.jlitespider.core.MessageQueue;

public class DoubanPrinter implements Freeman {

	@Override
	public void doSomeThing(String key, Object msg, Map<String, MessageQueue> mQueue) throws IOException {
		// TODO Auto-generated method stub
		List<String> urList = (List<String>) msg;
		System.out.println(key + " "+ urList.size());
	}

}
