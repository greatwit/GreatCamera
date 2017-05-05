
package com.great.happyness.camera;



import android.app.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.ImageView;

public class NativeDecodeActivity extends Activity implements SurfaceHolder.Callback 
{
	private final int width = 1280;
	private final int height = 720;
	
	private static String fileString = "/sdcard/camera.h264";
	private SurfaceHolder holder = null;
	private ImageView imageView = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);

		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		setContentView(R.layout.activity_decode);
		SurfaceView sfv_video = (SurfaceView) findViewById(R.id.sfv_video);
		imageView = (ImageView)findViewById(R.id.image_view);
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		// TODO Auto-generated method stub
		
	}
}