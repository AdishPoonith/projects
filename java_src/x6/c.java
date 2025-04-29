package x6;

import android.content.Context;
import android.util.Log;
import c4.s;
import java.util.Random;
/* loaded from: classes.dex */
public class c {

    /* renamed from: f  reason: collision with root package name */
    private static final Random f20245f = new Random();

    /* renamed from: g  reason: collision with root package name */
    static e f20246g = new f();

    /* renamed from: h  reason: collision with root package name */
    static h4.d f20247h = h4.f.c();

    /* renamed from: a  reason: collision with root package name */
    private final Context f20248a;

    /* renamed from: b  reason: collision with root package name */
    private final a6.b f20249b;

    /* renamed from: c  reason: collision with root package name */
    private final z5.b f20250c;

    /* renamed from: d  reason: collision with root package name */
    private long f20251d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f20252e;

    public c(Context context, a6.b bVar, z5.b bVar2, long j10) {
        this.f20248a = context;
        this.f20249b = bVar;
        this.f20250c = bVar2;
        this.f20251d = j10;
    }

    public void a() {
        this.f20252e = true;
    }

    public boolean b(int i10) {
        return (i10 >= 500 && i10 < 600) || i10 == -2 || i10 == 429 || i10 == 408;
    }

    public void c() {
        this.f20252e = false;
    }

    public void d(y6.e eVar) {
        e(eVar, true);
    }

    public void e(y6.e eVar, boolean z10) {
        s.j(eVar);
        long a10 = f20247h.a() + this.f20251d;
        String c10 = i.c(this.f20249b);
        String b10 = i.b(this.f20250c);
        if (z10) {
            eVar.C(c10, b10, this.f20248a);
        } else {
            eVar.E(c10, b10);
        }
        int i10 = 1000;
        while (f20247h.a() + i10 <= a10 && !eVar.w() && b(eVar.p())) {
            try {
                f20246g.a(f20245f.nextInt(250) + i10);
                if (i10 < 30000) {
                    if (eVar.p() != -2) {
                        i10 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i10 = 1000;
                    }
                }
                if (this.f20252e) {
                    return;
                }
                eVar.G();
                String c11 = i.c(this.f20249b);
                String b11 = i.b(this.f20250c);
                if (z10) {
                    eVar.C(c11, b11, this.f20248a);
                } else {
                    eVar.E(c11, b11);
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
