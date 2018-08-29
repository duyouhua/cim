/**
 * Copyright 2013-2023 Xia Jun(3979434@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ***************************************************************************************
 *                                                                                     *
 *                        Website : http://www.farsunset.com                           *
 *                                                                                     *
 ***************************************************************************************
 */
package com.farsunset.cim.sdk.server.filter;

import org.apache.mina.filter.codec.demux.DemuxingProtocolDecoder;

import com.farsunset.cim.sdk.server.filter.decoder.AppMessageDecoder;
import com.farsunset.cim.sdk.server.filter.decoder.WebMessageDecoder;

/**
 * 服务端接收消息解码
 */
public class ServerMessageDecoder extends DemuxingProtocolDecoder {

	public ServerMessageDecoder() {
		addMessageDecoder(new AppMessageDecoder());
		addMessageDecoder(new WebMessageDecoder());
	}
}