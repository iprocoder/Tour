package com.xgr.tour.ui;

import com.xgr.tour.ui.base.BaseFragment;
import com.xgr.tour.ui.base.BaseHomeActivity;

public class EditSignActivity extends BaseHomeActivity {

    @Override
    protected String getActionBarTitle() {
        // TODO Auto-generated method stub
        return "编辑签名";
    }

    @Override
    protected boolean isHomeAsUpEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    protected void onHomeActionClick() {
        // TODO Auto-generated method stub
        setResult(RESULT_OK);
        finish();
    }

    @Override
    protected BaseFragment getFragment() {
        // TODO Auto-generated method stub
        return EditSignFragment.newInstance();
    }

    @Override
    protected void addActions() {
        // TODO Auto-generated method stub

    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();
        setResult(RESULT_OK);
        finish();
    }

}
