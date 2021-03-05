package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fincare.upiprelogin.model.AddBen;
import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;

@Service
public class AddBenService {
	
	@Autowired
	private UpiProxy upiProxy;
	
	
	public String getAddBen(AddBen addBen) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		
		Parameters paramsCustomerId = new Parameters();
		paramsCustomerId.setKey("CUSTOMERID");
		paramsCustomerId.setValue(addBen.getCustomerid());
		Parameters paramsBenType = new Parameters();
		paramsBenType.setKey("BENTYPE");
		paramsBenType.setValue(addBen.getBentype());
		Parameters paramsNickName = new Parameters();
		paramsNickName.setKey("NICKNAME");
		paramsNickName.setValue(addBen.getNickname());
		Parameters paramsLimit = new Parameters();
		paramsLimit.setKey("LIMIT");
		paramsLimit.setValue(addBen.getLimit());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(addBen.getDt());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(addBen.getSessionid());
		Parameters paramsAccNo = new Parameters();
		paramsAccNo.setKey("ACCNO");
		paramsAccNo.setValue(addBen.getAccno());
		Parameters paramsAcIfsc = new Parameters();
		paramsAcIfsc.setKey("ACCNO");
		paramsAcIfsc.setValue(addBen.getAcifsc());
		
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsNickName);
		param.add(paramsBenType);
		param.add(paramsCustomerId);
		param.add(paramsAcIfsc);
		param.add(paramsAccNo);
		param.add(paramsDt);
		param.add(paramsLimit);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("AddBen");

		
		Common common = new Common();

		common.setRequest(request);
		System.out.println(common.toString());
		String response = upiProxy.getResponse(headers, common);

		return response;
	}
		
	

}
