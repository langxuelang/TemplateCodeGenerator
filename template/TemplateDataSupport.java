package com.bangstudy.xue.model.datasupport;

import com.bangstudy.xue.model.bean.CheckVersionResponseBean;
import com.bangstudy.xue.model.dataaction.AboutDataAction;
import com.bangstudy.xue.model.datacallback.AboutDataCallBack;

/**
 * @author 高腾
 * @Package com.bangstudy.xue.model.datasupport
 * @Description: 关于数据提供
 * @date 16/2/1 下午4:30
 */
public class AboutDataSupport extends BaseDataSupport implements AboutDataAction{

    private static final String TAG = AboutDataSupport.class.getSimpleName();
    private AboutDataCallBack mAboutDataCallBack;

    public AboutDataSupport(AboutDataCallBack aboutDataCallBack) {
        mAboutDataCallBack = aboutDataCallBack;
    }

    @Override
    public void init() {

    }
}
