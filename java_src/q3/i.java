package q3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p3.m;
/* loaded from: classes.dex */
public final class i extends Surface {

    /* renamed from: m  reason: collision with root package name */
    private static int f16091m;

    /* renamed from: n  reason: collision with root package name */
    private static boolean f16092n;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f16093j;

    /* renamed from: k  reason: collision with root package name */
    private final b f16094k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f16095l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: j  reason: collision with root package name */
        private p3.j f16096j;

        /* renamed from: k  reason: collision with root package name */
        private Handler f16097k;

        /* renamed from: l  reason: collision with root package name */
        private Error f16098l;

        /* renamed from: m  reason: collision with root package name */
        private RuntimeException f16099m;

        /* renamed from: n  reason: collision with root package name */
        private i f16100n;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) {
            p3.a.e(this.f16096j);
            this.f16096j.h(i10);
            this.f16100n = new i(this, this.f16096j.g(), i10 != 0);
        }

        private void d() {
            p3.a.e(this.f16096j);
            this.f16096j.i();
        }

        public i a(int i10) {
            boolean z10;
            start();
            this.f16097k = new Handler(getLooper(), this);
            this.f16096j = new p3.j(this.f16097k);
            synchronized (this) {
                z10 = false;
                this.f16097k.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f16100n == null && this.f16099m == null && this.f16098l == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f16099m;
            if (runtimeException == null) {
                Error error = this.f16098l;
                if (error == null) {
                    return (i) p3.a.e(this.f16100n);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            p3.a.e(this.f16097k);
            this.f16097k.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    try {
                        b(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (m.a e10) {
                        p3.r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                        this.f16099m = new IllegalStateException(e10);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e11) {
                    p3.r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f16098l = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    p3.r.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f16099m = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    private i(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f16094k = bVar;
        this.f16093j = z10;
    }

    private static int a(Context context) {
        if (p3.m.c(context)) {
            return p3.m.d() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (i.class) {
            if (!f16092n) {
                f16091m = a(context);
                f16092n = true;
            }
            z10 = f16091m != 0;
        }
        return z10;
    }

    public static i c(Context context, boolean z10) {
        p3.a.f(!z10 || b(context));
        return new b().a(z10 ? f16091m : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f16094k) {
            if (!this.f16095l) {
                this.f16094k.c();
                this.f16095l = true;
            }
        }
    }
}
