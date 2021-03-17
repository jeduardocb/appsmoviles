package com.example.example3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context myContext;
    Toast myToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        myContext = getApplication();
        myToast = new Toast(myContext);
        AlertDialog.Builder dialogConf = new AlertDialog.Builder(this);
        dialogConf.setTitle("neutral dialog");
        dialogConf.setMessage("this is the text of  newutral dialog");
        dialogConf.setIcon(R.mipmap.ic_launcher);

        dialogConf.setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

                myToast.makeText(myContext,"clicked dismiss", Toast.LENGTH_LONG).show();
            }
        });


        dialogConf.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

                myToast.makeText(myContext,"clicked yes", Toast.LENGTH_LONG).show();
            }
        });

        dialogConf.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

                myToast.makeText(myContext,"clicked no", Toast.LENGTH_LONG).show();
            }
        });
    AlertDialog myDialog = dialogConf.create();
    myDialog.show();

        Notification.Builder notifConf = new Notification.Builder(this);
        notifConf.setContentText("this is my beautiful notifcation");
        notifConf.setContentText("this is the detail of the notification");
        notifConf.setSmallIcon(R.mipmap.ic_launcher);


        Intent myIntent = new Intent(this,ChildActivity.class);
        PendingIntent contentIntent=PendingIntent.getActivity(myContext,0,myIntent,0);
        notifConf.setContentIntent(contentIntent);
        NotificationManager myNotification= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        myNotification.notify(1234454,notifConf.build());

    }
}