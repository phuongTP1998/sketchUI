package com.example.phuongbka.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    private Notification.Builder builder;
//    private NotificationManager notificationManager;
//    private int notification_id;
//    private RemoteViews remoteViews;
//    private Context context;

    //splash animation
//    private Button btnStart;
//    private Animation anim_fromBottom, anim_fromTop;
//    private ImageView ballon;
    private TextView scrollText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

//        context = this;
//        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        remoteViews = new RemoteViews(getPackageName(),R.layout.custom_notification);
//
//        remoteViews.setImageViewResource(R.id.notif_icon, R.drawable.Avatar);
//        remoteViews.setTextViewText(R.id.notif_title, "TEXT");
//        remoteViews.setProgressBar(R.id.progressBar, 100, 50 , true);
//
//        notification_id = (int) System.currentTimeMillis();
//        Intent button_intent = new Intent("button_clicked");
//        button_intent.putExtra("id", notification_id);
//
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(context,123,button_intent,0);
//        remoteViews.setOnClickPendingIntent(R.id.button, pendingIntent);
//
//        View view = findViewById(R.id.tv_hello);
//        SnackbarUtils.getInstance2(view, "hello");getstarted
//
//        findViewById(R.id.getstarted).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

//        //TO DO: animation from button
//        btnStart = (Button) findViewById(R.id.btn_start);
//        ballon = (ImageView) findViewById(R.id.iv_ballon);
//        anim_fromBottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
//        anim_fromTop = AnimationUtils.loadAnimation(this, R.anim.fromtop);
//        btnStart.setAnimation(anim_fromBottom);
//        ballon.setAnimation(anim_fromTop);

        //banner
        scrollText = findViewById(R.id.scroll_text);
        scrollText.setSelected(true);
    }
}
