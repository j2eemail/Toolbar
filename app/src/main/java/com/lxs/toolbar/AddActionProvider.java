package com.lxs.toolbar;


import android.content.Context;
import android.support.v4.view.ActionProvider;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/**
 * Created by Administrator on 2017/5/18.
 */

public class AddActionProvider extends ActionProvider {

    public AddActionProvider(Context context) {
        super(context);
    }

    @Override
    public View onCreateActionView() {
        return null;
    }

    @Override
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();

        subMenu.add("add_01")
                .setIcon(R.mipmap.add_01)
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Log.d("CESHI", "ADD_01");
                        return true;
                    }
                });
        subMenu.add("add_02")
                .setIcon(R.mipmap.add_02)
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Log.d("CESHI", "ADD_02");
                        return true;
                    }
                });
        subMenu.add("add_03")
                .setIcon(R.mipmap.add_03)
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Log.d("CESHI", "ADD_03");
                        return true;
                    }
                });
    }

    @Override
    public boolean hasSubMenu() {
        return true;
    }
}
