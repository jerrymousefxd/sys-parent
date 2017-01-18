package com.eaju.service;

import com.eaju.entity.VoiceCall;

public interface VoiceCallService {
	int insert(VoiceCall vc);
	void update(int vc ,String callId);
}
