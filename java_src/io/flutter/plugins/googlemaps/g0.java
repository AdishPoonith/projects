package io.flutter.plugins.googlemaps;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugins.googlemaps.g0;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import r8.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g0 implements w4.b0 {

    /* renamed from: b  reason: collision with root package name */
    protected final String f10661b;

    /* renamed from: c  reason: collision with root package name */
    protected final r8.k f10662c;

    /* renamed from: d  reason: collision with root package name */
    protected final Handler f10663d = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f10664a = new CountDownLatch(1);

        /* renamed from: b  reason: collision with root package name */
        private final int f10665b;

        /* renamed from: c  reason: collision with root package name */
        private final int f10666c;

        /* renamed from: d  reason: collision with root package name */
        private final int f10667d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, ?> f10668e;

        a(int i10, int i11, int i12) {
            this.f10665b = i10;
            this.f10666c = i11;
            this.f10667d = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            g0 g0Var = g0.this;
            g0Var.f10662c.d("tileOverlay#getTile", e.r(g0Var.f10661b, this.f10665b, this.f10666c, this.f10667d), this);
        }

        @Override // r8.k.d
        public void a(Object obj) {
            this.f10668e = (Map) obj;
            this.f10664a.countDown();
        }

        @Override // r8.k.d
        public void b(String str, String str2, Object obj) {
            Log.e("TileProviderController", "Can't get tile: errorCode = " + str + ", errorMessage = " + str + ", date = " + obj);
            this.f10668e = null;
            this.f10664a.countDown();
        }

        @Override // r8.k.d
        public void c() {
            Log.e("TileProviderController", "Can't get tile: notImplemented");
            this.f10668e = null;
            this.f10664a.countDown();
        }

        w4.y e() {
            String format;
            g0.this.f10663d.post(new Runnable() { // from class: io.flutter.plugins.googlemaps.f0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.a.this.f();
                }
            });
            try {
                this.f10664a.await();
            } catch (InterruptedException e10) {
                e = e10;
                format = String.format("countDownLatch: can't get tile: x = %d, y= %d, zoom = %d", Integer.valueOf(this.f10665b), Integer.valueOf(this.f10666c), Integer.valueOf(this.f10667d));
            }
            try {
                return e.j(this.f10668e);
            } catch (Exception e11) {
                e = e11;
                format = "Can't parse tile data";
                Log.e("TileProviderController", format, e);
                return w4.b0.f19854a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(r8.k kVar, String str) {
        this.f10661b = str;
        this.f10662c = kVar;
    }

    @Override // w4.b0
    public w4.y a(int i10, int i11, int i12) {
        return new a(i10, i11, i12).e();
    }
}
