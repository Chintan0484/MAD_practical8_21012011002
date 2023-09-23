package com.example.mad_practical8_21012011002

import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val card=findViewById<MaterialCardView>(R.id.card_cancle)

        val alarmbutton=findViewById<Button>(R.id.clock)
        alarmbutton.setOnClickListener {
            //card.visibility=View.VISIBLE
            TimePickerDialog(this,{tp,hour,minute->setalarmtime(hour,minute)},11,0,false).show()
        }

    }
    fun setalarmtime(hour:Int,Minute:Int){
        //card.visibility=View.GONE
    }
    fun setalarm(millitime:Long,action: String){
        val intentalarm = Intent(applicationContext,AlarmBroadcastReceiver::class.java)
        val pendingIntent=PendingIntent.getBroadcast(applicationContext,4356,intentalarm,PendingIntent.FLAG_UPDATE_CURRENT
    }
}