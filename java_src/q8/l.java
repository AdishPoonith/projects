package q8;

import java.util.HashMap;
import java.util.Map;
import r8.k;
import r8.s;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16436a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f16437b;

    /* renamed from: c  reason: collision with root package name */
    private r8.k f16438c;

    /* renamed from: d  reason: collision with root package name */
    private k.d f16439d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16440e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16441f;

    /* renamed from: g  reason: collision with root package name */
    private final k.c f16442g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f16443a;

        a(byte[] bArr) {
            this.f16443a = bArr;
        }

        @Override // r8.k.d
        public void a(Object obj) {
            l.this.f16437b = this.f16443a;
        }

        @Override // r8.k.d
        public void b(String str, String str2, Object obj) {
            d8.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // r8.k.d
        public void c() {
        }
    }

    /* loaded from: classes.dex */
    class b implements k.c {
        b() {
        }

        @Override // r8.k.c
        public void I(r8.j jVar, k.d dVar) {
            Map i10;
            String str = jVar.f16777a;
            Object obj = jVar.f16778b;
            str.hashCode();
            if (str.equals("get")) {
                l.this.f16441f = true;
                if (!l.this.f16440e) {
                    l lVar = l.this;
                    if (lVar.f16436a) {
                        lVar.f16439d = dVar;
                        return;
                    }
                }
                l lVar2 = l.this;
                i10 = lVar2.i(lVar2.f16437b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                l.this.f16437b = (byte[]) obj;
                i10 = null;
            }
            dVar.a(i10);
        }
    }

    public l(e8.a aVar, boolean z10) {
        this(new r8.k(aVar, "flutter/restoration", s.f16792b), z10);
    }

    l(r8.k kVar, boolean z10) {
        this.f16440e = false;
        this.f16441f = false;
        b bVar = new b();
        this.f16442g = bVar;
        this.f16438c = kVar;
        this.f16436a = z10;
        kVar.e(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void g() {
        this.f16437b = null;
    }

    public byte[] h() {
        return this.f16437b;
    }

    public void j(byte[] bArr) {
        this.f16440e = true;
        k.d dVar = this.f16439d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f16439d = null;
        } else if (this.f16441f) {
            this.f16438c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f16437b = bArr;
    }
}
