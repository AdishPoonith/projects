package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
/* loaded from: classes.dex */
public class i extends TextureView implements p8.c {

    /* renamed from: j  reason: collision with root package name */
    private boolean f10185j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10186k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10187l;

    /* renamed from: m  reason: collision with root package name */
    private p8.a f10188m;

    /* renamed from: n  reason: collision with root package name */
    private Surface f10189n;

    /* renamed from: o  reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f10190o;

    /* loaded from: classes.dex */
    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            d8.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            i.this.f10185j = true;
            if (i.this.f10186k) {
                i.this.l();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d8.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            i.this.f10185j = false;
            if (i.this.f10186k) {
                i.this.m();
            }
            if (i.this.f10189n != null) {
                i.this.f10189n.release();
                i.this.f10189n = null;
                return true;
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            d8.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (i.this.f10186k) {
                i.this.k(i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public i(Context context) {
        this(context, null);
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10185j = false;
        this.f10186k = false;
        this.f10187l = false;
        this.f10190o = new a();
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i10, int i11) {
        if (this.f10188m == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        d8.b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i10 + " x " + i11);
        this.f10188m.w(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f10188m == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f10189n;
        if (surface != null) {
            surface.release();
            this.f10189n = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f10189n = surface2;
        this.f10188m.u(surface2, this.f10187l);
        this.f10187l = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        p8.a aVar = this.f10188m;
        if (aVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        aVar.v();
        Surface surface = this.f10189n;
        if (surface != null) {
            surface.release();
            this.f10189n = null;
        }
    }

    private void n() {
        setSurfaceTextureListener(this.f10190o);
    }

    @Override // p8.c
    public void d() {
        if (this.f10188m == null) {
            d8.b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f10188m = null;
        this.f10187l = true;
        this.f10186k = false;
    }

    @Override // p8.c
    public void e() {
        if (this.f10188m == null) {
            d8.b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            d8.b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            m();
        }
        this.f10188m = null;
        this.f10186k = false;
    }

    @Override // p8.c
    public void f(p8.a aVar) {
        d8.b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f10188m != null) {
            d8.b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f10188m.v();
        }
        this.f10188m = aVar;
        this.f10186k = true;
        if (this.f10185j) {
            d8.b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
    }

    @Override // p8.c
    public p8.a getAttachedRenderer() {
        return this.f10188m;
    }

    public void setRenderSurface(Surface surface) {
        this.f10189n = surface;
    }
}
