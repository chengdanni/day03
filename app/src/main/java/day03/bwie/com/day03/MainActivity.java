package day03.bwie.com.day03;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.logo);
        Linshi mWaterView = (Linshi) findViewById(R.id.wave_view);

        final RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        mWaterView.animation(new Linshi.AnimationListener() {
            @Override
            public void animation(float y) {
                params.setMargins(0, 0, 0, (int) y);
                imageView.setLayoutParams(params);
            }
        });

    }
}
