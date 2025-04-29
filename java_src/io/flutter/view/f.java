package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;
/* loaded from: classes.dex */
public class f {

    /* renamed from: e  reason: collision with root package name */
    private static f f10941e;

    /* renamed from: f  reason: collision with root package name */
    private static b f10942f;

    /* renamed from: b  reason: collision with root package name */
    private FlutterJNI f10944b;

    /* renamed from: a  reason: collision with root package name */
    private long f10943a = -1;

    /* renamed from: c  reason: collision with root package name */
    private c f10945c = new c(0);

    /* renamed from: d  reason: collision with root package name */
    private final FlutterJNI.b f10946d = new a();

    /* loaded from: classes.dex */
    class a implements FlutterJNI.b {
        a() {
        }

        private Choreographer.FrameCallback b(long j10) {
            if (f.this.f10945c != null) {
                f.this.f10945c.f10950j = j10;
                c cVar = f.this.f10945c;
                f.this.f10945c = null;
                return cVar;
            }
            return new c(j10);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j10) {
            Choreographer.getInstance().postFrameCallback(b(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private DisplayManager f10948a;

        b(DisplayManager displayManager) {
            this.f10948a = displayManager;
        }

        void a() {
            this.f10948a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                float refreshRate = this.f10948a.getDisplay(0).getRefreshRate();
                f.this.f10943a = (long) (1.0E9d / refreshRate);
                f.this.f10944b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Choreographer.FrameCallback {

        /* renamed from: j  reason: collision with root package name */
        private long f10950j;

        c(long j10) {
            this.f10950j = j10;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            long nanoTime = System.nanoTime() - j10;
            f.this.f10944b.onVsync(nanoTime < 0 ? 0L : nanoTime, f.this.f10943a, this.f10950j);
            f.this.f10945c = this;
        }
    }

    private f(FlutterJNI flutterJNI) {
        this.f10944b = flutterJNI;
    }

    public static f f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f10941e == null) {
            f10941e = new f(flutterJNI);
        }
        if (f10942f == null) {
            f fVar = f10941e;
            Objects.requireNonNull(fVar);
            b bVar = new b(displayManager);
            f10942f = bVar;
            bVar.a();
        }
        if (f10941e.f10943a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f10941e.f10943a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f10941e;
    }

    public void g() {
        this.f10944b.setAsyncWaitForVsyncDelegate(this.f10946d);
    }
}
