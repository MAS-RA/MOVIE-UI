package com.movieuidesign.pgs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private ImageView imageview1;
	private ImageView imageview2;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear9;
	private LinearLayout linear11;
	private LinearLayout linear21;
	private LinearLayout linear23;
	private TextView t1;
	private LinearLayout l1;
	private TextView t2;
	private LinearLayout l2;
	private TextView t3;
	private LinearLayout l3;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear13;
	private LinearLayout a1;
	private LinearLayout a2;
	private LinearLayout a3;
	private LinearLayout a4;
	private LinearLayout a5;
	private LinearLayout a6;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview11;
	private TextView textview9;
	private TextView textview10;
	private HorizontalScrollView hscroll3;
	private LinearLayout slider;
	private LinearLayout linear35;
	private LinearLayout linear43;
	private LinearLayout linear39;
	private ImageView imageview3;
	private TextView titulo1;
	private LinearLayout linear38;
	private ImageView imageview4;
	private TextView av1;
	private ImageView imageview9;
	private TextView titulo2;
	private LinearLayout linear44;
	private ImageView imageview10;
	private TextView av2;
	private ImageView imageview5;
	private TextView titulo3;
	private LinearLayout linear40;
	private ImageView imageview6;
	private TextView av3;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear7;
	private ImageView _drawer_imageview2;
	private LinearLayout _drawer_linear8;
	private LinearLayout _drawer_fun;
	private LinearLayout _drawer_linear9;
	private LinearLayout _drawer_linear10;
	private LinearLayout _drawer_linear11;
	private LinearLayout _drawer_linear17;
	private LinearLayout _drawer_linear12;
	private LinearLayout _drawer_linear13;
	private LinearLayout _drawer_linear16;
	private LinearLayout _drawer_linear14;
	private LinearLayout _drawer_linear15;
	private ImageView _drawer_im;
	private LinearLayout _drawer_linear18;
	private TextView _drawer_textview2;
	private TextView _drawer_textview9;
	private ImageView _drawer_imageview4;
	private TextView _drawer_textview4;
	private ImageView _drawer_imageview8;
	private TextView _drawer_textview8;
	private ImageView _drawer_imageview5;
	private TextView _drawer_textview5;
	private ImageView _drawer_imageview6;
	private TextView _drawer_textview6;
	private ImageView _drawer_imageview7;
	private TextView _drawer_textview7;
	private LinearLayout _drawer_b1;
	private LinearLayout _drawer_linear21;
	private LinearLayout _drawer_b2;
	private LinearLayout _drawer_linear23;
	private LinearLayout _drawer_b3;
	private LinearLayout _drawer_linear25;
	private LinearLayout _drawer_b4;
	private LinearLayout _drawer_linear27;
	private LinearLayout _drawer_b5;
	private LinearLayout _drawer_linear29;
	private LinearLayout _drawer_b6;
	private LinearLayout _drawer_linear49;
	private LinearLayout _drawer_b7;
	private ImageView _drawer_imageview9;
	private ImageView _drawer_imageview10;
	private ImageView _drawer_imageview11;
	private ImageView _drawer_imageview12;
	private ImageView _drawer_imageview13;
	private ImageView _drawer_imageview22;
	private ImageView _drawer_imageview31;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear6;
	private ImageView _drawer_imageview1;
	private TextView _drawer_textview1;
	
	private TimerTask timer;
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		t1 = (TextView) findViewById(R.id.t1);
		l1 = (LinearLayout) findViewById(R.id.l1);
		t2 = (TextView) findViewById(R.id.t2);
		l2 = (LinearLayout) findViewById(R.id.l2);
		t3 = (TextView) findViewById(R.id.t3);
		l3 = (LinearLayout) findViewById(R.id.l3);
		hscroll2 = (HorizontalScrollView) findViewById(R.id.hscroll2);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		a1 = (LinearLayout) findViewById(R.id.a1);
		a2 = (LinearLayout) findViewById(R.id.a2);
		a3 = (LinearLayout) findViewById(R.id.a3);
		a4 = (LinearLayout) findViewById(R.id.a4);
		a5 = (LinearLayout) findViewById(R.id.a5);
		a6 = (LinearLayout) findViewById(R.id.a6);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		hscroll3 = (HorizontalScrollView) findViewById(R.id.hscroll3);
		slider = (LinearLayout) findViewById(R.id.slider);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		titulo1 = (TextView) findViewById(R.id.titulo1);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		av1 = (TextView) findViewById(R.id.av1);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		titulo2 = (TextView) findViewById(R.id.titulo2);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		av2 = (TextView) findViewById(R.id.av2);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		titulo3 = (TextView) findViewById(R.id.titulo3);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		av3 = (TextView) findViewById(R.id.av3);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = (LinearLayout) _nav_view.findViewById(R.id.linear2);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_linear4 = (LinearLayout) _nav_view.findViewById(R.id.linear4);
		_drawer_linear7 = (LinearLayout) _nav_view.findViewById(R.id.linear7);
		_drawer_imageview2 = (ImageView) _nav_view.findViewById(R.id.imageview2);
		_drawer_linear8 = (LinearLayout) _nav_view.findViewById(R.id.linear8);
		_drawer_fun = (LinearLayout) _nav_view.findViewById(R.id.fun);
		_drawer_linear9 = (LinearLayout) _nav_view.findViewById(R.id.linear9);
		_drawer_linear10 = (LinearLayout) _nav_view.findViewById(R.id.linear10);
		_drawer_linear11 = (LinearLayout) _nav_view.findViewById(R.id.linear11);
		_drawer_linear17 = (LinearLayout) _nav_view.findViewById(R.id.linear17);
		_drawer_linear12 = (LinearLayout) _nav_view.findViewById(R.id.linear12);
		_drawer_linear13 = (LinearLayout) _nav_view.findViewById(R.id.linear13);
		_drawer_linear16 = (LinearLayout) _nav_view.findViewById(R.id.linear16);
		_drawer_linear14 = (LinearLayout) _nav_view.findViewById(R.id.linear14);
		_drawer_linear15 = (LinearLayout) _nav_view.findViewById(R.id.linear15);
		_drawer_im = (ImageView) _nav_view.findViewById(R.id.im);
		_drawer_linear18 = (LinearLayout) _nav_view.findViewById(R.id.linear18);
		_drawer_textview2 = (TextView) _nav_view.findViewById(R.id.textview2);
		_drawer_textview9 = (TextView) _nav_view.findViewById(R.id.textview9);
		_drawer_imageview4 = (ImageView) _nav_view.findViewById(R.id.imageview4);
		_drawer_textview4 = (TextView) _nav_view.findViewById(R.id.textview4);
		_drawer_imageview8 = (ImageView) _nav_view.findViewById(R.id.imageview8);
		_drawer_textview8 = (TextView) _nav_view.findViewById(R.id.textview8);
		_drawer_imageview5 = (ImageView) _nav_view.findViewById(R.id.imageview5);
		_drawer_textview5 = (TextView) _nav_view.findViewById(R.id.textview5);
		_drawer_imageview6 = (ImageView) _nav_view.findViewById(R.id.imageview6);
		_drawer_textview6 = (TextView) _nav_view.findViewById(R.id.textview6);
		_drawer_imageview7 = (ImageView) _nav_view.findViewById(R.id.imageview7);
		_drawer_textview7 = (TextView) _nav_view.findViewById(R.id.textview7);
		_drawer_b1 = (LinearLayout) _nav_view.findViewById(R.id.b1);
		_drawer_linear21 = (LinearLayout) _nav_view.findViewById(R.id.linear21);
		_drawer_b2 = (LinearLayout) _nav_view.findViewById(R.id.b2);
		_drawer_linear23 = (LinearLayout) _nav_view.findViewById(R.id.linear23);
		_drawer_b3 = (LinearLayout) _nav_view.findViewById(R.id.b3);
		_drawer_linear25 = (LinearLayout) _nav_view.findViewById(R.id.linear25);
		_drawer_b4 = (LinearLayout) _nav_view.findViewById(R.id.b4);
		_drawer_linear27 = (LinearLayout) _nav_view.findViewById(R.id.linear27);
		_drawer_b5 = (LinearLayout) _nav_view.findViewById(R.id.b5);
		_drawer_linear29 = (LinearLayout) _nav_view.findViewById(R.id.linear29);
		_drawer_b6 = (LinearLayout) _nav_view.findViewById(R.id.b6);
		_drawer_linear49 = (LinearLayout) _nav_view.findViewById(R.id.linear49);
		_drawer_b7 = (LinearLayout) _nav_view.findViewById(R.id.b7);
		_drawer_imageview9 = (ImageView) _nav_view.findViewById(R.id.imageview9);
		_drawer_imageview10 = (ImageView) _nav_view.findViewById(R.id.imageview10);
		_drawer_imageview11 = (ImageView) _nav_view.findViewById(R.id.imageview11);
		_drawer_imageview12 = (ImageView) _nav_view.findViewById(R.id.imageview12);
		_drawer_imageview13 = (ImageView) _nav_view.findViewById(R.id.imageview13);
		_drawer_imageview22 = (ImageView) _nav_view.findViewById(R.id.imageview22);
		_drawer_imageview31 = (ImageView) _nav_view.findViewById(R.id.imageview31);
		_drawer_linear5 = (LinearLayout) _nav_view.findViewById(R.id.linear5);
		_drawer_linear6 = (LinearLayout) _nav_view.findViewById(R.id.linear6);
		_drawer_imageview1 = (ImageView) _nav_view.findViewById(R.id.imageview1);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.openDrawer(GravityCompat.START);
				Display display = getWindowManager().getDefaultDisplay();
				float width = display.getWidth();
				TranslateAnimation animation = new TranslateAnimation(width-50, 0, 0, 0);
				animation.setDuration(1000);
				_drawer_fun.startAnimation(animation);
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				l1.setVisibility(View.VISIBLE);
				l2.setVisibility(View.INVISIBLE);
				l3.setVisibility(View.INVISIBLE);
				t1.setTextColor(0xFF000000);
				t2.setTextColor(0xFF9E9E9E);
				t3.setTextColor(0xFF9E9E9E);
				_clickAnimation(linear11);
			}
		});
		
		linear21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				l1.setVisibility(View.INVISIBLE);
				l2.setVisibility(View.VISIBLE);
				l3.setVisibility(View.INVISIBLE);
				t1.setTextColor(0xFF9E9E9E);
				t2.setTextColor(0xFF000000);
				t3.setTextColor(0xFF9E9E9E);
				_clickAnimation(linear21);
			}
		});
		
		linear23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(linear23);
				l1.setVisibility(View.INVISIBLE);
				l2.setVisibility(View.INVISIBLE);
				l3.setVisibility(View.VISIBLE);
				t1.setTextColor(0xFF9E9E9E);
				t2.setTextColor(0xFF9E9E9E);
				t3.setTextColor(0xFF000000);
			}
		});
		
		a1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(a1);
			}
		});
		
		a2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(a2);
			}
		});
		
		a3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(a3);
			}
		});
		
		a4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(a4);
			}
		});
		
		a5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(a5);
			}
		});
		
		a6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(a6);
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(linear35);
				i.setClass(getApplicationContext(), ViewActivity.class);
				i.putExtra("titulo", titulo1.getText().toString());
				i.putExtra("idade", "18");
				i.putExtra("nota", av1.getText().toString());
				i.putExtra("filme", "1");
				startActivity(i);
				overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(linear43);
				i.setClass(getApplicationContext(), ViewActivity.class);
				i.putExtra("titulo", titulo2.getText().toString());
				i.putExtra("idade", "12");
				i.putExtra("nota", av2.getText().toString());
				i.putExtra("filme", "2");
				startActivity(i);
				overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(linear39);
				i.setClass(getApplicationContext(), ViewActivity.class);
				i.putExtra("titulo", titulo3.getText().toString());
				i.putExtra("idade", "L");
				i.putExtra("nota", av3.getText().toString());
				i.putExtra("filme", "3");
				startActivity(i);
				overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
			}
		});
		
		_drawer_linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_fun.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	private void initializeLogic() {
		_ui();
		_funcao();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			finish();
		}
	}
	private void _ui () {
		LinearLayout mNavigationView = (LinearLayout ) findViewById(R.id._nav_view);
		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		DrawerLayout.LayoutParams params = (DrawerLayout.LayoutParams) mNavigationView.getLayoutParams();
		params.width = metrics.widthPixels;
		mNavigationView.setLayoutParams(params);
		getSupportActionBar().hide();
		LinearLayout _nav_view = findViewById(R.id._nav_view) ;
		_nav_view. setBackgroundColor(Color. TRANSPARENT) ;
		linear1.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		Window w = this.getWindow();
		w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
					w.setNavigationBarColor(Color.parseColor("#FFFFFF"));
		linear2.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
		_ICC(imageview4, "#FFEB3B", "#FFEB3B");
		_ICC(imageview10, "#FFEB3B", "#FFEB3B");
		_ICC(imageview6, "#FFEB3B", "#FFEB3B");
		_ICC(imageview2, "#000000", "#000000");
		android.graphics.drawable.GradientDrawable EGHBAAB = new android.graphics.drawable.GradientDrawable();
		EGHBAAB.setColor(Color.parseColor("#FFf96989"));
		EGHBAAB.setCornerRadii(new float[] { 50, 50, 50, 50, 50, 50, 50, 50 });
		l1.setBackground(EGHBAAB);
		android.graphics.drawable.GradientDrawable GCHGDJH = new android.graphics.drawable.GradientDrawable();
		GCHGDJH.setColor(Color.parseColor("#FFf96989"));
		GCHGDJH.setCornerRadii(new float[] { 50, 50, 50, 50, 50, 50, 50, 50 });
		l2.setBackground(GCHGDJH);
		android.graphics.drawable.GradientDrawable GGFHEDD = new android.graphics.drawable.GradientDrawable();
		GGFHEDD.setColor(Color.parseColor("#FFf96989"));
		GGFHEDD.setCornerRadii(new float[] { 50, 50, 50, 50, 50, 50, 50, 50 });
		l3.setBackground(GGFHEDD);
		_roundImageView(imageview3, 60);
		_roundImageView(imageview5, 60);
		_roundImageView(imageview9, 60);
		_rounded_btn_outline(a1, 60, 4, "#ff999999", "#00f0f8ff");
		_rounded_btn_outline(a2, 60, 4, "#ff999999", "#00f0f8ff");
		_rounded_btn_outline(a3, 60, 4, "#ff999999", "#00f0f8ff");
		_rounded_btn_outline(a4, 60, 4, "#ff999999", "#00f0f8ff");
		_rounded_btn_outline(a5, 60, 4, "#ff999999", "#00f0f8ff");
		_rounded_btn_outline(a6, 60, 4, "#ff999999", "#00f0f8ff");
		_removeScollBar(hscroll1);
		_removeScollBar(hscroll2);
		_removeScollBar(hscroll3);
		_click_effect(_drawer_linear11, "#EEEEEE");
		_click_effect(_drawer_linear16, "#EEEEEE");
		_click_effect(_drawer_linear13, "#EEEEEE");
		_click_effect(_drawer_linear15, "#EEEEEE");
		_click_effect(_drawer_linear17, "#EEEEEE");
		android.graphics.drawable.GradientDrawable DDAHDAF = new android.graphics.drawable.GradientDrawable();
		DDAHDAF.setColor(Color.parseColor("#FFFFFFFF"));
		DDAHDAF.setCornerRadii(new float[] { 20, 20, 20, 20, 20, 20, 20, 20 });
		_drawer_linear7.setBackground(DDAHDAF);
		android.graphics.drawable.GradientDrawable FADEHEH = new android.graphics.drawable.GradientDrawable();
		FADEHEH.setColor(Color.parseColor("#FFFFFFFF"));
		FADEHEH.setCornerRadii(new float[] { 0, 0, 20, 20, 20, 20, 0, 0 });
		_drawer_linear8.setBackground(FADEHEH);
		android.graphics.drawable.GradientDrawable CBAIJBB = new android.graphics.drawable.GradientDrawable();
		CBAIJBB.setColor(Color.parseColor("#FFF44336"));
		CBAIJBB.setCornerRadii(new float[] { 20, 20, 0, 0, 1, 1, 20, 20 });
		_drawer_linear5.setBackground(CBAIJBB);
		android.graphics.drawable.GradientDrawable BJCACJJ = new android.graphics.drawable.GradientDrawable();
		BJCACJJ.setColor(Color.parseColor("#FFFFFFFF"));
		BJCACJJ.setCornerRadii(new float[] { 0, 0, 20, 20, 20, 20, 0, 0 });
		_drawer_linear6.setBackground(BJCACJJ);
		android.graphics.drawable.GradientDrawable BCAAEFI = new android.graphics.drawable.GradientDrawable();
		BCAAEFI.setColor(Color.parseColor("#FFFFFFFF"));
		BCAAEFI.setCornerRadii(new float[] { 30, 30, 30, 30, 30, 30, 30, 30 });
		_drawer_fun.setBackground(BCAAEFI);
		_click_effect(_drawer_b1, "#EEEEEE");
		_click_effect(_drawer_b2, "#EEEEEE");
		_click_effect(_drawer_b3, "#EEEEEE");
		_click_effect(_drawer_b4, "#EEEEEE");
		_click_effect(_drawer_b5, "#EEEEEE");
		_click_effect(_drawer_b6, "#EEEEEE");
		_click_effect(_drawer_b7, "#EEEEEE");
		_roundImageView(_drawer_im, 50);
	}
	
	
	private void _ICC (final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	private void _roundImageView (final ImageView _imageview, final double _round) {
		//Made by Ilyasse Salama
		Bitmap bm = ((android.graphics.drawable.BitmapDrawable)_imageview.getDrawable()).getBitmap();
		
		_imageview.setImageBitmap(getRoundedCornerBitmap(bm, ((int)_round)));
		
	}
	public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int pixels) {
		Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(output);
		final int color = 0xff424242;
		final Paint paint = new Paint();
		final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
		final RectF rectF = new RectF(rect);
		final float roundPx = pixels;
		paint.setAntiAlias(true);
		canvas.drawARGB(0, 0, 0, 0);
		paint.setColor(color);
		canvas.drawRoundRect(rectF, roundPx, roundPx, paint); 
		paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN)); 
		canvas.drawBitmap(bitmap, rect, rect, paint);
		return output;
	}
	
	
	private void _rounded_btn_outline (final View _view, final double _rd, final double _sw, final String _sc, final String _bc) {
		android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable(); drawable.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		    drawable.setStroke((int)_sw, Color.parseColor(_sc)); drawable.setColor(Color.parseColor(_bc)); drawable.setCornerRadius((int)_rd); _view.setBackgroundDrawable(drawable);
	}
	
	
	private void _removeScollBar (final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	private void _funcao () {
		l2.setVisibility(View.INVISIBLE);
		l3.setVisibility(View.INVISIBLE);
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										hscroll3.smoothScrollTo((slider.getWidth()/3)-100, 0);
									}
								});
							}
						};
						_timer.schedule(timer, (int)(3000));
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										hscroll3.smoothScrollTo(3000, 0);
									}
								});
							}
						};
						_timer.schedule(timer, (int)(6000));
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										hscroll3.smoothScrollTo(0, 0);
									}
								});
							}
						};
						_timer.schedule(timer, (int)(9000));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(timer, (int)(0), (int)(9000));
	}
	
	
	private void _click_effect (final View _view, final String _c) {
		_view.setBackground(Drawables.getSelectableDrawableFor(Color.parseColor(_c)));
		_view.setClickable(true);
		
	}
	
	public static class Drawables {
		    public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
				            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_pressed},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_focused},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            return stateListDrawable;
				        } else {
				            android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
				            android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
				            
				android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
				            return new android.graphics.drawable.RippleDrawable(
				                pressedColor,
				                defaultColor,
				                rippleColor
				            );
				        }
			    }
		
		    private static android.graphics.drawable.Drawable getRippleColor(int color) {
			        float[] outerRadii = new float[8];
			        Arrays.fill(outerRadii, 0);
			        android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
			        
			android.graphics.drawable.ShapeDrawable shapeDrawable = new 
			android.graphics.drawable.ShapeDrawable(r);
			        shapeDrawable.getPaint().setColor(color);
			        return shapeDrawable;
			    }
		 
		    private static int lightenOrDarken(int color, double fraction) {
			        if (canLighten(color, fraction)) {
				            return lighten(color, fraction);
				        } else {
				            return darken(color, fraction);
				        }
			    }
		 
		    private static int lighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = lightenColor(red, fraction);
			        green = lightenColor(green, fraction);
			        blue = lightenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static int darken(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = darkenColor(red, fraction);
			        green = darkenColor(green, fraction);
			        blue = darkenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			 
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static boolean canLighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        return canLightenComponent(red, fraction)
			            && canLightenComponent(green, fraction)
			            && canLightenComponent(blue, fraction);
			    }
		 
		    private static boolean canLightenComponent(int colorComponent, double fraction) {
			        int red = Color.red(colorComponent);
			        int green = Color.green(colorComponent);
			        int blue = Color.blue(colorComponent);
			        return red + (red * fraction) < 255
			            && green + (green * fraction) < 255
			            && blue + (blue * fraction) < 255;
			    }
		 
		    private static int darkenColor(int color, double fraction) {
			        return (int) Math.max(color - (color * fraction), 0);
			    }
		 
		    private static int lightenColor(int color, double fraction) {
			        return (int) Math.min(color + (color * fraction), 255);
			    }
	}
	public static class CircleDrawables {
		    public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
				            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_pressed},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_focused},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            return stateListDrawable;
				        } else {
				            android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
				            android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
				            
				android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
				            return new android.graphics.drawable.RippleDrawable(
				                pressedColor,
				                defaultColor,
				                rippleColor
				            );
				        }
			    }
		
		    private static android.graphics.drawable.Drawable getRippleColor(int color) {
			        float[] outerRadii = new float[180];
			        Arrays.fill(outerRadii, 80);
			        android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
			        
			android.graphics.drawable.ShapeDrawable shapeDrawable = new 
			android.graphics.drawable.ShapeDrawable(r);
			        shapeDrawable.getPaint().setColor(color);
			        return shapeDrawable;
			    }
		 
		    private static int lightenOrDarken(int color, double fraction) {
			        if (canLighten(color, fraction)) {
				            return lighten(color, fraction);
				        } else {
				            return darken(color, fraction);
				        }
			    }
		 
		    private static int lighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = lightenColor(red, fraction);
			        green = lightenColor(green, fraction);
			        blue = lightenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static int darken(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = darkenColor(red, fraction);
			        green = darkenColor(green, fraction);
			        blue = darkenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			 
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static boolean canLighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        return canLightenComponent(red, fraction)
			            && canLightenComponent(green, fraction)
			            && canLightenComponent(blue, fraction);
			    }
		 
		    private static boolean canLightenComponent(int colorComponent, double fraction) {
			        int red = Color.red(colorComponent);
			        int green = Color.green(colorComponent);
			        int blue = Color.blue(colorComponent);
			        return red + (red * fraction) < 255
			            && green + (green * fraction) < 255
			            && blue + (blue * fraction) < 255;
			    }
		 
		    private static int darkenColor(int color, double fraction) {
			        return (int) Math.max(color - (color * fraction), 0);
			    }
		 
		    private static int lightenColor(int color, double fraction) {
			        return (int) Math.min(color + (color * fraction), 255);
		}
	}
	
	public void drawableclass() {
	}
	
	
	private void _clickAnimation (final View _view) {
		ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
		fade_in.setDuration(300);
		fade_in.setFillAfter(true);
		_view.startAnimation(fade_in);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
