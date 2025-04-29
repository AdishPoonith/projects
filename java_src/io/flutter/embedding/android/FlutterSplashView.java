package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FlutterSplashView extends FrameLayout {

    /* renamed from: s  reason: collision with root package name */
    private static String f10119s = "FlutterSplashView";

    /* renamed from: j  reason: collision with root package name */
    private x f10120j;

    /* renamed from: k  reason: collision with root package name */
    private k f10121k;

    /* renamed from: l  reason: collision with root package name */
    private View f10122l;

    /* renamed from: m  reason: collision with root package name */
    Bundle f10123m;

    /* renamed from: n  reason: collision with root package name */
    private String f10124n;

    /* renamed from: o  reason: collision with root package name */
    private String f10125o;

    /* renamed from: p  reason: collision with root package name */
    private final k.f f10126p;

    /* renamed from: q  reason: collision with root package name */
    private final p8.b f10127q;

    /* renamed from: r  reason: collision with root package name */
    private final Runnable f10128r;

    @Keep
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new a();
        private String previousCompletedSplashIsolate;
        private Bundle splashScreenState;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    /* loaded from: classes.dex */
    class a implements k.f {
        a() {
        }

        @Override // io.flutter.embedding.android.k.f
        public void a() {
        }

        @Override // io.flutter.embedding.android.k.f
        public void b(io.flutter.embedding.engine.a aVar) {
            FlutterSplashView.this.f10121k.A(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.g(flutterSplashView.f10121k, FlutterSplashView.this.f10120j);
        }
    }

    /* loaded from: classes.dex */
    class b implements p8.b {
        b() {
        }

        @Override // p8.b
        public void c() {
        }

        @Override // p8.b
        public void f() {
            if (FlutterSplashView.this.f10120j != null) {
                FlutterSplashView.this.k();
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f10122l);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            flutterSplashView2.f10125o = flutterSplashView2.f10124n;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10126p = new a();
        this.f10127q = new b();
        this.f10128r = new c();
        setSaveEnabled(true);
    }

    private boolean h() {
        k kVar = this.f10121k;
        if (kVar != null) {
            if (kVar.x()) {
                return this.f10121k.getAttachedFlutterEngine().i().k() != null && this.f10121k.getAttachedFlutterEngine().i().k().equals(this.f10125o);
            }
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
        throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
    }

    private boolean i() {
        k kVar = this.f10121k;
        return (kVar == null || !kVar.x() || this.f10121k.v() || h()) ? false : true;
    }

    private boolean j() {
        x xVar;
        k kVar = this.f10121k;
        return kVar != null && kVar.x() && (xVar = this.f10120j) != null && xVar.b() && l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f10124n = this.f10121k.getAttachedFlutterEngine().i().k();
        String str = f10119s;
        d8.b.f(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f10124n);
        this.f10120j.a(this.f10128r);
    }

    private boolean l() {
        k kVar = this.f10121k;
        if (kVar != null) {
            if (kVar.x()) {
                return this.f10121k.v() && !h();
            }
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
        throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
    }

    public void g(k kVar, x xVar) {
        k kVar2 = this.f10121k;
        if (kVar2 != null) {
            kVar2.B(this.f10127q);
            removeView(this.f10121k);
        }
        View view = this.f10122l;
        if (view != null) {
            removeView(view);
        }
        this.f10121k = kVar;
        addView(kVar);
        this.f10120j = xVar;
        if (xVar != null) {
            if (i()) {
                d8.b.f(f10119s, "Showing splash screen UI.");
                View c10 = xVar.c(getContext(), this.f10123m);
                this.f10122l = c10;
                addView(c10);
                kVar.m(this.f10127q);
            } else if (!j()) {
                if (kVar.x()) {
                    return;
                }
                d8.b.f(f10119s, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
                kVar.l(this.f10126p);
            } else {
                d8.b.f(f10119s, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
                View c11 = xVar.c(getContext(), this.f10123m);
                this.f10122l = c11;
                addView(c11);
                k();
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f10125o = savedState.previousCompletedSplashIsolate;
        this.f10123m = savedState.splashScreenState;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.previousCompletedSplashIsolate = this.f10125o;
        x xVar = this.f10120j;
        savedState.splashScreenState = xVar != null ? xVar.d() : null;
        return savedState;
    }
}
