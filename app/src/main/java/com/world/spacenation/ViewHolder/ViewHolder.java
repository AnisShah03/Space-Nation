package com.world.spacenation.ViewHolder;

import android.app.Application;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.world.spacenation.R;


public class ViewHolder extends RecyclerView.ViewHolder {


    View mView;
    SimpleExoPlayer exoPlayer;
    private PlayerView mExoPlayerView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mView = itemView;
    }


    public void setvideo(final Application ctx, String title, final String url) {
        TextView mtextview = mView.findViewById(R.id.video_title1);
        mExoPlayerView = mView.findViewById(R.id.exoplayer_view1);


        mtextview.setText(title);
        try {

            BandwidthMeter bandwidthMeter = new DefaultBandwidthMeter.Builder(ctx).build();

            TrackSelector trackSelector = new DefaultTrackSelector(new AdaptiveTrackSelection.Factory(bandwidthMeter));
            exoPlayer = (SimpleExoPlayer) ExoPlayerFactory.newSimpleInstance(ctx,trackSelector);

            Uri video = Uri.parse(url);

            DefaultHttpDataSourceFactory dataSourceFactory = new DefaultHttpDataSourceFactory("video");
            ExtractorsFactory extractorsFactory = new DefaultExtractorsFactory();
            MediaSource  mediaSource = new ExtractorMediaSource(video,dataSourceFactory,extractorsFactory,null,null);


            mExoPlayerView.setPlayer(exoPlayer);
            exoPlayer.prepare(mediaSource);
            exoPlayer.setPlayWhenReady(false);

        } catch (Exception e) {
            Log.e("ViewHolder", "Exoplayer Error..." + e.toString());
        }


    }


}
