package com.movieuidesign.pgs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
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
import android.view.View;

public class ViewActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private LinearLayout fundo;
	private LinearLayout linear28;
	private LinearLayout funcoes;
	private LinearLayout fundo2;
	private LinearLayout linear2;
	private LinearLayout linear13;
	private ImageView imageview1;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private ImageView imageview2;
	private LinearLayout linear18;
	private TextView textview1;
	private TextView avaliacao;
	private TextView textview9;
	private ImageView imageview3;
	private TextView textview3;
	private LinearLayout idade_linear;
	private TextView textview5;
	private TextView textview6;
	private TextView idade;
	private LinearLayout linear10;
	private LinearLayout linear9;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private TextView titulo;
	private TextView textview8;
	private LinearLayout linear17;
	private ImageView imageview4;
	private LinearLayout l1;
	private LinearLayout l2;
	private LinearLayout l3;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private ImageView imageview5;
	private TextView textview16;
	private ImageView imageview6;
	private TextView textview17;
	private ImageView imageview7;
	private TextView textview18;
	private ImageView imageview8;
	private TextView textview19;
	private ImageView imageview9;
	private TextView textview20;
	private ImageView imageview10;
	private TextView textview21;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.view);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		fundo = (LinearLayout) findViewById(R.id.fundo);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		funcoes = (LinearLayout) findViewById(R.id.funcoes);
		fundo2 = (LinearLayout) findViewById(R.id.fundo2);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview1 = (TextView) findViewById(R.id.textview1);
		avaliacao = (TextView) findViewById(R.id.avaliacao);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview3 = (TextView) findViewById(R.id.textview3);
		idade_linear = (LinearLayout) findViewById(R.id.idade_linear);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		idade = (TextView) findViewById(R.id.idade);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		titulo = (TextView) findViewById(R.id.titulo);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		l1 = (LinearLayout) findViewById(R.id.l1);
		l2 = (LinearLayout) findViewById(R.id.l2);
		l3 = (LinearLayout) findViewById(R.id.l3);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview20 = (TextView) findViewById(R.id.textview20);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview21 = (TextView) findViewById(R.id.textview21);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
				finish();
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_clickAnimation(linear17);
				final AlertDialog.Builder alert = new AlertDialog.Builder(ViewActivity.this);
				View view = getLayoutInflater().inflate(R.layout.play,null);
				LinearLayout parent = (LinearLayout)view.findViewById(R.id.parent);
				
				LinearLayout p1 = (LinearLayout)view.findViewById(R.id.p1);
				
				LinearLayout p2 = (LinearLayout)view.findViewById(R.id.p2);
				
				LinearLayout p3 = (LinearLayout)view.findViewById(R.id.p3);
				alert.setView(view);
				final AlertDialog dialog = alert.create();
				android.graphics.drawable.GradientDrawable GFHGJDF = new android.graphics.drawable.GradientDrawable();
				GFHGJDF.setColor(Color.parseColor("#FFFFFFFF"));
				GFHGJDF.setCornerRadii(new float[] { 50, 50, 50, 50, 50, 50, 50, 50 });
				parent.setBackground(GFHGJDF);
				if (true) {
					ObjectAnimator scaleX = new ObjectAnimator();
					scaleX.setTarget(parent);
					scaleX.setPropertyName("scaleX");
					scaleX.setFloatValues((float)0.8f,(float)1f);
					scaleX.setDuration(300);
					scaleX.setInterpolator(new AccelerateDecelerateInterpolator());
					scaleX.start();
					ObjectAnimator scaleY = new ObjectAnimator();
					scaleY.setTarget(parent);
					scaleY.setPropertyName("scaleY");
					scaleY.setFloatValues((float)0.8f,(float)1f);
					scaleY.setDuration(300);
					scaleY.setInterpolator(new AccelerateDecelerateInterpolator());
					scaleY.start();
					ObjectAnimator alpha = new ObjectAnimator();
					alpha.setTarget(parent);
					alpha.setPropertyName("alpha");
					alpha.setFloatValues((float)0f,(float)1);
					alpha.setDuration(300);
					alpha.setInterpolator(new AccelerateDecelerateInterpolator());
					alpha.start();
				}
				if (true) {
					android.graphics.drawable.GradientDrawable IFCIDJI = new android.graphics.drawable.GradientDrawable();
					IFCIDJI.setColor(Color.parseColor("#FF717171"));
					IFCIDJI.setCornerRadii(new float[] { 50, 50, 50, 50, 50, 50, 50, 50 });
					p1.setBackground(IFCIDJI);
					android.graphics.drawable.GradientDrawable CIBBEDB = new android.graphics.drawable.GradientDrawable();
					CIBBEDB.setColor(Color.parseColor("#FF323232"));
					CIBBEDB.setCornerRadii(new float[] { 50, 50, 50, 50, 50, 50, 50, 50 });
					p2.setBackground(CIBBEDB);
					android.graphics.drawable.GradientDrawable IJADAJJ = new android.graphics.drawable.GradientDrawable();
					IJADAJJ.setColor(Color.parseColor("#FFf96989"));
					IJADAJJ.setCornerRadii(new float[] { 50, 50, 50, 50, 50, 50, 50, 50 });
					p3.setBackground(IJADAJJ);
				}
				dialog.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.TRANSPARENT));
				p1.setOnClickListener(new View.OnClickListener() {
					@Override public void onClick(View v) {
						if (true) {
							SketchwareUtil.showMessage(getApplicationContext(), "player 1");
						}
						dialog.dismiss();}});
				p2.setOnClickListener(new View.OnClickListener() {
					@Override public void onClick(View v) {
						if (true) {
							SketchwareUtil.showMessage(getApplicationContext(), "player 2");
						}
						dialog.dismiss();}});
				p3.setOnClickListener(new View.OnClickListener() {
					@Override public void onClick(View v) {
						if (true) {
							SketchwareUtil.showMessage(getApplicationContext(), "download");
						}
						dialog.dismiss();}});
				dialog.show();
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
		overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
		finish();
	}
	private void _ui () {
		_roundImageView(imageview5, 100);
		_roundImageView(imageview6, 100);
		_roundImageView(imageview7, 100);
		_roundImageView(imageview8, 100);
		_roundImageView(imageview9, 100);
		_roundImageView(imageview10, 100);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
			Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(0xFF008375); w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); }
		linear2.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
		Window w = this.getWindow();
		w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
					w.setNavigationBarColor(Color.parseColor("#FFFFFF"));
		android.graphics.drawable.GradientDrawable EGBHGAA = new android.graphics.drawable.GradientDrawable();
		EGBHGAA.setColor(Color.parseColor("#FFf96989"));
		EGBHGAA.setCornerRadii(new float[] { 30, 30, 30, 30, 30, 30, 30, 30 });
		linear17.setBackground(EGBHGAA);
		android.graphics.drawable.GradientDrawable BEDDIHH = new android.graphics.drawable.GradientDrawable();
		BEDDIHH.setColor(Color.parseColor("#FFFFFFFF"));
		BEDDIHH.setCornerRadii(new float[] { 50, 50, 0, 0, 0, 0, 50, 50 });
		funcoes.setBackground(BEDDIHH);
		if(Build.VERSION.SDK_INT >= 21) { funcoes.setElevation(17f); }
		_ICC(imageview2, "#FFEB3B", "#FFEB3B");
		_rounded_btn_outline(l1, 60, 4, "#ff999999", "#00f0f8ff");
		_rounded_btn_outline(l3, 60, 4, "#ff999999", "#00f0f8ff");
		_rounded_btn_outline(l2, 60, 4, "#ff999999", "#00f0f8ff");
		_ICC(imageview4, "#FFFFFF", "#FFFFFF");
		_removeScollBar(hscroll1);
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
	
	
	private void _ICC (final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	private void _rounded_btn_outline (final View _view, final double _rd, final double _sw, final String _sc, final String _bc) {
		android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable(); drawable.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		    drawable.setStroke((int)_sw, Color.parseColor(_sc)); drawable.setColor(Color.parseColor(_bc)); drawable.setCornerRadius((int)_rd); _view.setBackgroundDrawable(drawable);
	}
	
	
	private void _funcao () {
		Display display = getWindowManager().getDefaultDisplay();
		float width = display.getWidth();
		TranslateAnimation animation = new TranslateAnimation(width-50, 0, 0, 0);
		animation.setDuration(1000);
		funcoes.startAnimation(animation);
		if (getIntent().getStringExtra("filme").equals("1")) {
			fundo.setBackgroundResource(R.drawable.fund4);
			avaliacao.setText(getIntent().getStringExtra("nota"));
			titulo.setText(getIntent().getStringExtra("titulo"));
			idade.setText(getIntent().getStringExtra("idade"));
			_ICC(imageview1, "#FFFFFF", "#FFFFFF");
		}
		else {
			if (getIntent().getStringExtra("filme").equals("2")) {
				linear1.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
				fundo.setBackgroundResource(R.drawable.fund1);
				avaliacao.setText(getIntent().getStringExtra("nota"));
				titulo.setText(getIntent().getStringExtra("titulo"));
				idade.setText(getIntent().getStringExtra("idade"));
			}
			else {
				if (getIntent().getStringExtra("filme").equals("3")) {
					fundo.setBackgroundResource(R.drawable.dj029cc06fe58ebb3154f31e99fda1b9);
					avaliacao.setText(getIntent().getStringExtra("nota"));
					titulo.setText(getIntent().getStringExtra("titulo"));
					idade.setText(getIntent().getStringExtra("idade"));
					_ICC(imageview1, "#FFFFFF", "#FFFFFF");
				}
			}
		}
		if (getIntent().getStringExtra("idade").equals("L")) {
			android.graphics.drawable.GradientDrawable HEGBIFJ = new android.graphics.drawable.GradientDrawable();
			HEGBIFJ.setColor(Color.parseColor("#FF4CAF50"));
			HEGBIFJ.setCornerRadii(new float[] { 20, 20, 20, 20, 20, 20, 20, 20 });
			idade_linear.setBackground(HEGBIFJ);
			idade.setTextColor(0xFFFFFFFF);
		}
		else {
			if ((Double.parseDouble(getIntent().getStringExtra("idade")) < 10) || (Double.parseDouble(getIntent().getStringExtra("idade")) == 10)) {
				android.graphics.drawable.GradientDrawable GGGDDFF = new android.graphics.drawable.GradientDrawable();
				GGGDDFF.setColor(Color.parseColor("#FFFFEB3B"));
				GGGDDFF.setCornerRadii(new float[] { 20, 20, 20, 20, 20, 20, 20, 20 });
				idade_linear.setBackground(GGGDDFF);
				idade.setTextColor(0xFF000000);
			}
			else {
				if ((Double.parseDouble(getIntent().getStringExtra("idade")) < 12) || (Double.parseDouble(getIntent().getStringExtra("idade")) == 12)) {
					android.graphics.drawable.GradientDrawable GGBAECE = new android.graphics.drawable.GradientDrawable();
					GGBAECE.setColor(Color.parseColor("#FFFFC107"));
					GGBAECE.setCornerRadii(new float[] { 20, 20, 20, 20, 20, 20, 20, 20 });
					idade_linear.setBackground(GGBAECE);
					idade.setTextColor(0xFF000000);
				}
				else {
					if ((Double.parseDouble(getIntent().getStringExtra("idade")) < 16) || (Double.parseDouble(getIntent().getStringExtra("idade")) == 16)) {
						android.graphics.drawable.GradientDrawable FJHBAGH = new android.graphics.drawable.GradientDrawable();
						FJHBAGH.setColor(Color.parseColor("#FFF44336"));
						FJHBAGH.setCornerRadii(new float[] { 20, 20, 20, 20, 20, 20, 20, 20 });
						idade_linear.setBackground(FJHBAGH);
						idade.setTextColor(0xFFFFFFFF);
					}
					else {
						if ((Double.parseDouble(getIntent().getStringExtra("idade")) < 18) || (Double.parseDouble(getIntent().getStringExtra("idade")) == 18)) {
							android.graphics.drawable.GradientDrawable CBAIDBJ = new android.graphics.drawable.GradientDrawable();
							CBAIDBJ.setColor(Color.parseColor("#FFD50000"));
							CBAIDBJ.setCornerRadii(new float[] { 20, 20, 20, 20, 20, 20, 20, 20 });
							idade_linear.setBackground(CBAIDBJ);
							idade.setTextColor(0xFFFFFFFF);
						}
					}
				}
			}
		}
	}
	
	
	private void _removeScollBar (final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
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
