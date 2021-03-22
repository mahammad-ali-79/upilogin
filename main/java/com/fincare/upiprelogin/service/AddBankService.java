package com.fincare.upiprelogin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fincare.upiprelogin.model.AddBank;
import com.fincare.upiprelogin.model.Common;
import com.fincare.upiprelogin.model.Parameters;
import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;
import com.fincare.upiprelogin.repository.UPIRepository;

@Service
public class AddBankService {
	
	
	@Autowired
	private UpiProxy upiProxy;
	@Autowired
	private UPIRepository  upiRepository;
	@Value("${upi.logType:Error}")
	private String errorLog;
	 private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	public Response getAddBank(AddBank addBank) {
		
		Map<String, String> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");
		Parameters paramsCustomerid = new Parameters();
		paramsCustomerid.setKey("customerId");
		paramsCustomerid.setValue(addBank.getCustomerid());
		Parameters paramsVPAId = new Parameters();
		paramsVPAId.setKey("VPAID");
		paramsVPAId.setValue(addBank.getVpaid());
		Parameters paramsVPA = new Parameters();
		paramsVPA.setKey("VPA");
		paramsVPA.setValue(addBank.getVpa());
		Parameters paramsAccno = new Parameters();
		paramsAccno.setKey("ACCNO");
		paramsAccno.setValue(addBank.getAccno());
		Parameters paramsAcIfsc = new Parameters();
		paramsAcIfsc.setKey("ACIFSC");
		paramsAcIfsc.setValue(addBank.getAccifsc());
		Parameters paramsName = new Parameters();
		paramsName.setKey("NAME");
		paramsName.setValue(addBank.getName());
		Parameters paramsNN = new Parameters();
		paramsNN.setKey("NN");
		paramsNN.setValue(addBank.getNn());
		Parameters paramsLimit = new Parameters();
		paramsLimit.setKey("LIMIT");
		paramsLimit.setValue(addBank.getLimit());
		Parameters paramsBank = new Parameters();
		paramsBank.setKey("BANK");
		paramsBank.setValue(addBank.getBank());
		Parameters paramsIsDefault = new Parameters();
		paramsIsDefault.setKey("ISDEFAULT");
		paramsIsDefault.setValue(addBank.getIsdefault());
		Parameters paramsAcType = new Parameters();
		paramsAcType.setKey("ACTYPE");
		paramsAcType.setValue(addBank.getAcctype());
		Parameters paramsMmid = new Parameters();
		paramsMmid.setKey("MMID");
		paramsMmid.setValue(addBank.getMmid());
		Parameters paramsCType = new Parameters();
		paramsCType.setKey("CTYPE");
		paramsCType.setValue(addBank.getCtype());
		Parameters paramsCSType = new Parameters();
		paramsCSType.setKey("CSTYPE");
		paramsCSType.setValue(addBank.getCstype());
		Parameters paramsCDType = new Parameters();
		paramsCDType.setKey("CDTYPE");
		paramsCDType.setValue(addBank.getCdtype());
		Parameters paramsCDLen = new Parameters();
		paramsCDLen.setKey("CDLEN");
		paramsCDLen.setValue(addBank.getCdlen());
		Parameters paramsInternal = new Parameters();
		paramsInternal.setKey("INTERNAL");
		paramsInternal.setValue(addBank.getInternal());
		Parameters paramsCAtMdType = new Parameters();
		paramsCAtMdType.setKey("CATMDTYPE");
		paramsCAtMdType.setValue(addBank.getCatmdtype());
		Parameters paramsCAtMdLen = new Parameters();
		paramsCAtMdLen.setKey("CATMDLEN");
		paramsCAtMdLen.setValue(addBank.getCatmdlen());
		Parameters paramsACName = new Parameters();
		paramsACName.setKey("ACNAME");
		paramsACName.setValue(addBank.getAcname());
		Parameters paramsSessionId = new Parameters();
		paramsSessionId.setKey("SESSIONID");
		paramsSessionId.setValue(addBank.getSessionid());
		Parameters paramsDt = new Parameters();
		paramsDt.setKey("DT");
		paramsDt.setValue(addBank.getDt());
		
		
		ArrayList<Parameters> param = new ArrayList<Parameters>();
		
		param.add(paramsSessionId);
		param.add(paramsACName);
		param.add(paramsCAtMdLen);
		param.add(paramsCAtMdType);
		param.add(paramsInternal);
		param.add(paramsCDLen);
		param.add(paramsCDType);
		param.add(paramsCSType);
		param.add(paramsCType);
		param.add(paramsAcType);
		param.add(paramsIsDefault);
		param.add(paramsName);
		param.add(paramsCustomerid);
		param.add(paramsVPAId);
		param.add(paramsVPA);
		param.add(paramsAccno);
		param.add(paramsAcIfsc);
		param.add(paramsNN);
		param.add(paramsLimit);
		param.add(paramsBank);
		param.add(paramsMmid);
		param.add(paramsDt);
		
		Request request = new Request();
		request.setParams(param);
		request.setDeviceId(0);
		request.setInitiatorId("");
		request.setService("AddBank");

		upiRepository.save(request);
		logger.info("InPut Request:",request);
		
		
		Common common = new Common();

		common.setRequest(request);
		System.out.println(common.toString());
		Response response = upiProxy.getResponse(headers, common);
		
		    	// System.out.println(response);
		    	if(errorLog.equals("Error")) {
		 		//logger.info("OutPut Response:",response);
		 		logger.error("OutPut Response:",response);
		    	}
		    	 return response;
		  
	
	}
		
	}
	
