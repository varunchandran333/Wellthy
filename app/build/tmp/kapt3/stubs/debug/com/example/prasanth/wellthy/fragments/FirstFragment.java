package com.example.prasanth.wellthy.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001bJ&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010 2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/prasanth/wellthy/fragments/FirstFragment;", "Landroid/support/v4/app/Fragment;", "Landroid/view/View$OnTouchListener;", "()V", "Likes", "", "getLikes$app_debug", "()I", "setLikes$app_debug", "(I)V", "mDetector", "Landroid/support/v4/view/GestureDetectorCompat;", "mainRelativeLayout", "Landroid/widget/RelativeLayout;", "getMainRelativeLayout", "()Landroid/widget/RelativeLayout;", "setMainRelativeLayout", "(Landroid/widget/RelativeLayout;)V", "screenCenter", "getScreenCenter", "setScreenCenter", "windowwidth", "getWindowwidth", "setWindowwidth", "x", "y", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDynamicView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onTouch", "", "p0", "p1", "Landroid/view/MotionEvent;", "onViewCreated", "view", "MyGestureListener", "app_debug"})
public final class FirstFragment extends android.support.v4.app.Fragment implements android.view.View.OnTouchListener {
    private int windowwidth;
    private int screenCenter;
    private android.support.v4.view.GestureDetectorCompat mDetector;
    private int Likes;
    private int x;
    private int y;
    @org.jetbrains.annotations.Nullable()
    private android.widget.RelativeLayout mainRelativeLayout;
    private java.util.HashMap _$_findViewCache;
    
    public final int getWindowwidth() {
        return 0;
    }
    
    public final void setWindowwidth(int p0) {
    }
    
    public final int getScreenCenter() {
        return 0;
    }
    
    public final void setScreenCenter(int p0) {
    }
    
    public final int getLikes$app_debug() {
        return 0;
    }
    
    public final void setLikes$app_debug(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.RelativeLayout getMainRelativeLayout() {
        return null;
    }
    
    public final void setMainRelativeLayout(@org.jetbrains.annotations.Nullable()
    android.widget.RelativeLayout p0) {
    }
    
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.Nullable()
    android.view.View p0, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent p1) {
        return false;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onCreateDynamicView() {
    }
    
    public FirstFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J(\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/example/prasanth/wellthy/fragments/FirstFragment$MyGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/example/prasanth/wellthy/fragments/FirstFragment;)V", "onDoubleTap", "", "e", "Landroid/view/MotionEvent;", "onDown", "event", "onFling", "event1", "event2", "velocityX", "", "velocityY", "onLongPress", "", "onScroll", "e1", "e2", "distanceX", "distanceY", "onSingleTapConfirmed", "app_debug"})
    public final class MyGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        
        @java.lang.Override()
        public boolean onDown(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onSingleTapConfirmed(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override()
        public void onLongPress(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
        }
        
        @java.lang.Override()
        public boolean onDoubleTap(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onScroll(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e1, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onFling(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event1, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event2, float velocityX, float velocityY) {
            return false;
        }
        
        public MyGestureListener() {
            super();
        }
    }
}