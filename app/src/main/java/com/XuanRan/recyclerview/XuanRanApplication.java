package com.XuanRan.recyclerview;
import android.app.*;

public class XuanRanApplication extends Application
{

	@Override
	public void onCreate()
	{
		super.onCreate();
		com.XuanRan.Exception.Handing.CrashHandler.init(this,"/sdcard/XuanRan/"+"RecyclerViewTest"+"/Log/");
	}
	
}
