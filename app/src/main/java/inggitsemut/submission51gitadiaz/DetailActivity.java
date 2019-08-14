package inggitsemut.submission51gitadiaz;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class DetailActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView tvTitle, tvSinger, tvLyric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Detail");

        // receive data
        Intent intentDetail = getIntent();
        String img = intentDetail.getExtras().getString("Image");
        String title = intentDetail.getExtras().getString("Title");
        String singer = intentDetail.getExtras().getString("Singer");
        String lyric = intentDetail.getExtras().getString("Lyric");

        imageView = findViewById(R.id.detail_img);
        tvTitle = findViewById(R.id.detail_title);
        tvSinger = findViewById(R.id.detail_singer);
        tvLyric = findViewById(R.id.detail_lyric);

        Glide.with(this)
                .load(img)
                .apply(new RequestOptions())
                .into(imageView);
        tvTitle.setText(title);
        tvSinger.setText(singer);
        tvLyric.setText(lyric);

    }
}
