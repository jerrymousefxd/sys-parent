package com.eaju.service.serviceImpl;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eaju.appmapper.VoiceCallMapper;
import com.eaju.entity.VoiceCall;
import com.eaju.service.VoiceCallService;
@Service
@Transactional
public class VoiceCallServiceImpl implements VoiceCallService {
	@Autowired
	private VoiceCallMapper voiceCallMapper;
	@Override
	public int insert(VoiceCall vc) {
		// TODO Auto-generated method stub
		if(StringUtils.isBlank(vc.getPhonenumberfrom())||StringUtils.isBlank(vc.getPhonenumberto())){
			return 0;
		}
		voiceCallMapper.insert(vc);
		return vc.getId().intValue();
	}
	@Override
	public void update(int id, String callId) {
		// TODO Auto-generated method stub
		VoiceCall vc=new VoiceCall();
		vc.setCallidentifier(callId);
		vc.setId(new BigDecimal(id));
		voiceCallMapper.updateByPrimaryKeySelective(vc);
	}

}
