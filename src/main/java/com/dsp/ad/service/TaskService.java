package com.dsp.ad.service;

import com.dsp.ad.entity.ext.ExtAd;
import com.dsp.ad.util.result.LLBResult;

public interface TaskService {

    LLBResult createTask(ExtAd ad);
}
