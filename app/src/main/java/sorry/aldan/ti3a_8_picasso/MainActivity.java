package sorry.aldan.ti3a_8_picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView ivHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String imageUri = "https://t4.rbxcdn.com/2d5d9e7b8bb8d4524a7dfcf9c48c889c";
        ivHero = (ImageView) findViewById(R.id.iv_hero);
        Picasso.with(getApplicationContext()).load(imageUri).into(ivHero);
        Picasso.with(getApplicationContext()).load(imageUri).placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background).into(ivHero);

    }
}
