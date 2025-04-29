package x1;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p3.j0;
import s1.n1;
/* loaded from: classes.dex */
public final class i implements r {

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f20169o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: p  reason: collision with root package name */
    private static final a f20170p = new a(new a.InterfaceC0286a() { // from class: x1.h
        @Override // x1.i.a.InterfaceC0286a
        public final Constructor a() {
            Constructor f10;
            f10 = i.f();
            return f10;
        }
    });

    /* renamed from: q  reason: collision with root package name */
    private static final a f20171q = new a(new a.InterfaceC0286a() { // from class: x1.g
        @Override // x1.i.a.InterfaceC0286a
        public final Constructor a() {
            Constructor g10;
            g10 = i.g();
            return g10;
        }
    });

    /* renamed from: b  reason: collision with root package name */
    private boolean f20172b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20173c;

    /* renamed from: d  reason: collision with root package name */
    private int f20174d;

    /* renamed from: e  reason: collision with root package name */
    private int f20175e;

    /* renamed from: f  reason: collision with root package name */
    private int f20176f;

    /* renamed from: g  reason: collision with root package name */
    private int f20177g;

    /* renamed from: h  reason: collision with root package name */
    private int f20178h;

    /* renamed from: i  reason: collision with root package name */
    private int f20179i;

    /* renamed from: j  reason: collision with root package name */
    private int f20180j;

    /* renamed from: l  reason: collision with root package name */
    private int f20182l;

    /* renamed from: k  reason: collision with root package name */
    private int f20181k = 1;

    /* renamed from: n  reason: collision with root package name */
    private int f20184n = 112800;

    /* renamed from: m  reason: collision with root package name */
    private com.google.common.collect.q<n1> f20183m = com.google.common.collect.q.z();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0286a f20185a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f20186b = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        private Constructor<? extends l> f20187c;

        /* renamed from: x1.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0286a {
            Constructor<? extends l> a();
        }

        public a(InterfaceC0286a interfaceC0286a) {
            this.f20185a = interfaceC0286a;
        }

        private Constructor<? extends l> b() {
            synchronized (this.f20186b) {
                if (this.f20186b.get()) {
                    return this.f20187c;
                }
                try {
                    return this.f20185a.a();
                } catch (ClassNotFoundException unused) {
                    this.f20186b.set(true);
                    return this.f20187c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public l a(Object... objArr) {
            Constructor<? extends l> b10 = b();
            if (b10 == null) {
                return null;
            }
            try {
                return b10.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void e(int i10, List<l> list) {
        l bVar;
        switch (i10) {
            case 0:
                bVar = new h2.b();
                break;
            case 1:
                bVar = new h2.e();
                break;
            case 2:
                bVar = new h2.h((this.f20173c ? 2 : 0) | this.f20174d | (this.f20172b ? 1 : 0));
                break;
            case 3:
                bVar = new y1.b((this.f20173c ? 2 : 0) | this.f20175e | (this.f20172b ? 1 : 0));
                break;
            case 4:
                bVar = f20170p.a(Integer.valueOf(this.f20176f));
                if (bVar == null) {
                    bVar = new a2.d(this.f20176f);
                    break;
                }
                break;
            case 5:
                bVar = new b2.c();
                break;
            case 6:
                bVar = new d2.e(this.f20177g);
                break;
            case 7:
                bVar = new e2.f((this.f20173c ? 2 : 0) | this.f20180j | (this.f20172b ? 1 : 0));
                break;
            case 8:
                list.add(new f2.g(this.f20179i));
                bVar = new f2.k(this.f20178h);
                break;
            case 9:
                bVar = new g2.d();
                break;
            case 10:
                bVar = new h2.a0();
                break;
            case 11:
                bVar = new h2.h0(this.f20181k, new j0(0L), new h2.j(this.f20182l, this.f20183m), this.f20184n);
                break;
            case 12:
                bVar = new i2.b();
                break;
            case 13:
            default:
                return;
            case 14:
                bVar = new c2.a();
                break;
            case 15:
                bVar = f20171q.a(new Object[0]);
                if (bVar == null) {
                    return;
                }
                break;
            case 16:
                bVar = new z1.b();
                break;
        }
        list.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends l> f() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(l.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends l> g() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(l.class).getConstructor(new Class[0]);
    }

    @Override // x1.r
    public synchronized l[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // x1.r
    public synchronized l[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f20169o;
        arrayList = new ArrayList(iArr.length);
        int b10 = p3.k.b(map);
        if (b10 != -1) {
            e(b10, arrayList);
        }
        int c10 = p3.k.c(uri);
        if (c10 != -1 && c10 != b10) {
            e(c10, arrayList);
        }
        for (int i10 : iArr) {
            if (i10 != b10 && i10 != c10) {
                e(i10, arrayList);
            }
        }
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }
}
