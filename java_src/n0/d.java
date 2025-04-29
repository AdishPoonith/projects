package n0;

import android.os.Handler;
import android.os.Looper;
import r8.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements k.d {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f13986a;

    /* renamed from: b  reason: collision with root package name */
    private final k.d f13987b;

    public d(k.d result) {
        kotlin.jvm.internal.l.e(result, "result");
        this.f13986a = new Handler(Looper.getMainLooper());
        this.f13987b = result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(d this$0, String errorCode, String str, Object obj) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(errorCode, "$errorCode");
        this$0.f13987b.b(errorCode, str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(d this$0) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        this$0.f13987b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(d this$0, Object obj) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        this$0.f13987b.a(obj);
    }

    @Override // r8.k.d
    public void a(final Object obj) {
        this.f13986a.post(new Runnable() { // from class: n0.b
            @Override // java.lang.Runnable
            public final void run() {
                d.i(d.this, obj);
            }
        });
    }

    @Override // r8.k.d
    public void b(final String errorCode, final String str, final Object obj) {
        kotlin.jvm.internal.l.e(errorCode, "errorCode");
        this.f13986a.post(new Runnable() { // from class: n0.c
            @Override // java.lang.Runnable
            public final void run() {
                d.g(d.this, errorCode, str, obj);
            }
        });
    }

    @Override // r8.k.d
    public void c() {
        this.f13986a.post(new Runnable() { // from class: n0.a
            @Override // java.lang.Runnable
            public final void run() {
                d.h(d.this);
            }
        });
    }
}
