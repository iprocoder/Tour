package com.xgr.tour.ui.base;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.umeng.analytics.MobclickAgent;
import com.xgr.tour.utils.Constant;
import com.xgr.tour.utils.Sputil;


/**
 * @author kingofglory
 *         email: kingofglory@yeah.net
 *         blog:  http:www.google.com
 * @date 2014-2-23
 * TODO
 */

public abstract class BaseFragment extends Fragment {
    public static String TAG;
    protected Context mContext;
    protected Sputil sputil;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getSimpleName();
        mContext = getActivity();
        if (null == sputil) {
            sputil = new Sputil(mContext, Constant.PRE_NAME);
        }
    }

    @Override
    public void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        MobclickAgent.onPageStart(TAG);
    }

    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        MobclickAgent.onPageEnd(TAG);
    }
}