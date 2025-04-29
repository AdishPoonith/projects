package p3;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
/* loaded from: classes.dex */
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f15378q = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: j  reason: collision with root package name */
    private final Handler f15379j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f15380k;

    /* renamed from: l  reason: collision with root package name */
    private final a f15381l;

    /* renamed from: m  reason: collision with root package name */
    private EGLDisplay f15382m;

    /* renamed from: n  reason: collision with root package name */
    private EGLContext f15383n;

    /* renamed from: o  reason: collision with root package name */
    private EGLSurface f15384o;

    /* renamed from: p  reason: collision with root package name */
    private SurfaceTexture f15385p;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public j(Handler handler) {
        this(handler, null);
    }

    public j(Handler handler, a aVar) {
        this.f15379j = handler;
        this.f15381l = aVar;
        this.f15380k = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f15378q, 0, eGLConfigArr, 0, 1, iArr, 0);
        m.b(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, n0.C("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        m.b(eglCreateContext != null, "eglCreateContext failed");
        return eglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            m.b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        m.b(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    private void d() {
        a aVar = this.f15381l;
        if (aVar != null) {
            aVar.a();
        }
    }

    private static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        m.a();
    }

    private static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        m.b(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        m.b(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) p3.a.e(this.f15385p);
    }

    public void h(int i10) {
        EGLDisplay f10 = f();
        this.f15382m = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.f15382m, a10, i10);
        this.f15383n = b10;
        this.f15384o = c(this.f15382m, a10, b10, i10);
        e(this.f15380k);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f15380k[0]);
        this.f15385p = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public void i() {
        this.f15379j.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f15385p;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f15380k, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f15382m;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f15382m;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f15384o;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f15382m, this.f15384o);
            }
            EGLContext eGLContext = this.f15383n;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f15382m, eGLContext);
            }
            if (n0.f15397a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f15382m;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f15382m);
            }
            this.f15382m = null;
            this.f15383n = null;
            this.f15384o = null;
            this.f15385p = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f15379j.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f15385p;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
