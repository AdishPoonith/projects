package io.flutter.plugins.googlemaps;

import android.content.Context;
import r8.k;
import u4.e;
/* loaded from: classes.dex */
final class k implements u4.g, k.c {

    /* renamed from: m  reason: collision with root package name */
    private static k.d f10675m;

    /* renamed from: j  reason: collision with root package name */
    private final r8.k f10676j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f10677k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10678l = false;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10679a;

        static {
            int[] iArr = new int[e.a.values().length];
            f10679a = iArr;
            try {
                iArr[e.a.LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10679a[e.a.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, r8.c cVar) {
        this.f10677k = context;
        r8.k kVar = new r8.k(cVar, "plugins.flutter.dev/google_maps_android_initializer");
        this.f10676j = kVar;
        kVar.e(this);
    }

    private void b(String str, k.d dVar) {
        e.a aVar;
        if (this.f10678l || f10675m != null) {
            dVar.b("Renderer already initialized", "Renderer initialization called multiple times", null);
            return;
        }
        f10675m = dVar;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1109880953:
                if (str.equals("latest")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1106578487:
                if (str.equals("legacy")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                aVar = e.a.LATEST;
                break;
            case 1:
                aVar = e.a.LEGACY;
                break;
            case 2:
                c(null);
                return;
            default:
                f10675m.b("Invalid renderer type", "Renderer initialization called with invalid renderer type", null);
                f10675m = null;
                return;
        }
        c(aVar);
    }

    @Override // r8.k.c
    public void I(r8.j jVar, k.d dVar) {
        String str = jVar.f16777a;
        str.hashCode();
        if (str.equals("initializer#preferRenderer")) {
            b((String) jVar.a("value"), dVar);
        } else {
            dVar.c();
        }
    }

    @Override // u4.g
    public void a(e.a aVar) {
        k.d dVar;
        String str;
        this.f10678l = true;
        if (f10675m != null) {
            int i10 = a.f10679a[aVar.ordinal()];
            if (i10 == 1) {
                dVar = f10675m;
                str = "latest";
            } else if (i10 != 2) {
                f10675m.b("Unknown renderer type", "Initialized with unknown renderer type", null);
                f10675m = null;
            } else {
                dVar = f10675m;
                str = "legacy";
            }
            dVar.a(str);
            f10675m = null;
        }
    }

    public void c(e.a aVar) {
        u4.e.b(this.f10677k, aVar, this);
    }
}
