package u4;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
/* loaded from: classes.dex */
public class d extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    private final m f19041j;

    public d(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f19041j = new m(this, context, googleMapOptions);
        setClickable(true);
    }

    public void a(f fVar) {
        c4.s.e("getMapAsync() must be called on the main thread");
        c4.s.k(fVar, "callback must not be null.");
        this.f19041j.p(fVar);
    }

    public void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f19041j.c(bundle);
            if (this.f19041j.b() == null) {
                k4.a.i(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void c() {
        this.f19041j.d();
    }

    public void d() {
        this.f19041j.e();
    }

    public void e(Bundle bundle) {
        this.f19041j.f(bundle);
    }

    public void f() {
        this.f19041j.g();
    }

    public void g() {
        this.f19041j.h();
    }
}
