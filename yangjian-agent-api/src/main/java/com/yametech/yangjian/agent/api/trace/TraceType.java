/*
 * Copyright 2020 yametech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yametech.yangjian.agent.api.trace;

/**
 * 链路Span类型
 * 
 * @author liuzhao
 */
public enum TraceType {
	DUBBO_CLIENT("dubbo-client"),
	DUBBO_SERVER("dubbo-server"),
	MQ_PUBLISH("mq-publish"),
	MQ_CONSUME("mq-consume"),
	CUSTOM_MARK("custom-mark"),
	HTTP_SERVER("http-server"),
	HTTP_CLIENT("http-client");

	private String key;
	private TraceType(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
}
