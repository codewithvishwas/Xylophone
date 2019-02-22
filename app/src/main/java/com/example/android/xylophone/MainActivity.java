package com.example.android.xylophone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    private int mc7SoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds

        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,2);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,3);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,4);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,5);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,6);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,7);
        mc7SoundId = mSoundPool.load(getApplicationContext(),R.raw.note_8c,8);



    }

    // TODO: Add the play methods triggered by the buttons

    public void playC(View v){
        mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);


    }

    public void playD(View v){
        mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);

    }

    public void playE(View v){
        mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);

    }

    public void playF(View v){
        mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);

    }

    public void playG(View v){
        mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);

    }

    public void playA(View v){
        mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);

    }

    public void playB(View v){
        mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);

    }

    public void playC7(View v) {
        mSoundPool.play(mc7SoundId, LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);

    }

}

