package r3;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q3.j;
/* loaded from: classes.dex */
public final class d extends GLSurfaceView {

    /* renamed from: j  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f16679j;

    /* renamed from: k  reason: collision with root package name */
    private final SensorManager f16680k;

    /* renamed from: l  reason: collision with root package name */
    private final Sensor f16681l;

    /* renamed from: m  reason: collision with root package name */
    private final Handler f16682m;

    /* renamed from: n  reason: collision with root package name */
    private SurfaceTexture f16683n;

    /* renamed from: o  reason: collision with root package name */
    private Surface f16684o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f16685p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f16686q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f16687r;

    /* loaded from: classes.dex */
    public interface a {
        void l(Surface surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Surface surface = this.f16684o;
        if (surface != null) {
            Iterator<a> it = this.f16679j.iterator();
            while (it.hasNext()) {
                it.next().l(surface);
            }
        }
        c(this.f16683n, surface);
        this.f16683n = null;
        this.f16684o = null;
    }

    private static void c(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void e() {
        boolean z10 = this.f16685p && this.f16686q;
        Sensor sensor = this.f16681l;
        if (sensor == null || z10 == this.f16687r) {
            return;
        }
        if (z10) {
            this.f16680k.registerListener((SensorEventListener) null, sensor, 0);
        } else {
            this.f16680k.unregisterListener((SensorEventListener) null);
        }
        this.f16687r = z10;
    }

    public void d(a aVar) {
        this.f16679j.remove(aVar);
    }

    public r3.a getCameraMotionListener() {
        return null;
    }

    public j getVideoFrameMetadataListener() {
        return null;
    }

    public Surface getVideoSurface() {
        return this.f16684o;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16682m.post(new Runnable() { // from class: r3.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.b();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f16686q = false;
        e();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f16686q = true;
        e();
    }

    public void setDefaultStereoMode(int i10) {
        throw null;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f16685p = z10;
        e();
    }
}
