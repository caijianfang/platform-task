/* 
 * ReexchangeJob.java  
 * 
 * version TODO
 *
 * 2016年10月25日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.task.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlebank.zplatform.task.service.cmb.ReexchangeTaskService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年10月25日 下午2:40:59
 * @since 
 */
@Service
public class ReexchangeJob {

	@Autowired
	private ReexchangeTaskService reexchangeTaskService;
	
	public void  reexchange(){
		reexchangeTaskService.scanCMBCReexchange();
	}
}
