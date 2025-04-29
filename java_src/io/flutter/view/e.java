package io.flutter.view;

import android.graphics.SurfaceTexture;
/* loaded from: classes.dex */
public interface e {

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public interface b {
        void onTrimMemory(int i10);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b(b bVar);

        void c(a aVar);

        SurfaceTexture d();

        long e();
    }

    c a();
}
