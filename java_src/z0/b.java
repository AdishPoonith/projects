package z0;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import s9.q;
import t9.g0;
import t9.m0;
import z0.f;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f20635m = new a(null);

    /* renamed from: n  reason: collision with root package name */
    private static final Map<String, String> f20636n;

    /* renamed from: a  reason: collision with root package name */
    private final z0.a f20637a;

    /* renamed from: b  reason: collision with root package name */
    private final z0.a f20638b;

    /* renamed from: c  reason: collision with root package name */
    private final z0.a f20639c;

    /* renamed from: d  reason: collision with root package name */
    private final z0.a f20640d;

    /* renamed from: e  reason: collision with root package name */
    private final z0.a f20641e;

    /* renamed from: f  reason: collision with root package name */
    private final z0.a f20642f;

    /* renamed from: g  reason: collision with root package name */
    private final z0.a f20643g;

    /* renamed from: h  reason: collision with root package name */
    private final z0.a f20644h;

    /* renamed from: i  reason: collision with root package name */
    private final z0.a f20645i;

    /* renamed from: j  reason: collision with root package name */
    private final z0.a f20646j;

    /* renamed from: k  reason: collision with root package name */
    private final z0.a f20647k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, z0.a> f20648l;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final Map<String, z0.a> b(File file) {
            j jVar = j.f20674a;
            Map<String, z0.a> c10 = j.c(file);
            if (c10 != null) {
                HashMap hashMap = new HashMap();
                Map a10 = b.a();
                for (Map.Entry<String, z0.a> entry : c10.entrySet()) {
                    String key = entry.getKey();
                    if (a10.containsKey(entry.getKey()) && (key = (String) a10.get(entry.getKey())) == null) {
                        return null;
                    }
                    hashMap.put(key, entry.getValue());
                }
                return hashMap;
            }
            return null;
        }

        public final b a(File file) {
            l.e(file, "file");
            Map<String, z0.a> b10 = b(file);
            if (b10 == null) {
                return null;
            }
            try {
                return new b(b10, null);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        HashMap e10;
        e10 = g0.e(q.a("embedding.weight", "embed.weight"), q.a("dense1.weight", "fc1.weight"), q.a("dense2.weight", "fc2.weight"), q.a("dense3.weight", "fc3.weight"), q.a("dense1.bias", "fc1.bias"), q.a("dense2.bias", "fc2.bias"), q.a("dense3.bias", "fc3.bias"));
        f20636n = e10;
    }

    private b(Map<String, z0.a> map) {
        Set<String> f10;
        z0.a aVar = map.get("embed.weight");
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20637a = aVar;
        i iVar = i.f20673a;
        z0.a aVar2 = map.get("convs.0.weight");
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20638b = i.l(aVar2);
        z0.a aVar3 = map.get("convs.1.weight");
        if (aVar3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20639c = i.l(aVar3);
        z0.a aVar4 = map.get("convs.2.weight");
        if (aVar4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20640d = i.l(aVar4);
        z0.a aVar5 = map.get("convs.0.bias");
        if (aVar5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20641e = aVar5;
        z0.a aVar6 = map.get("convs.1.bias");
        if (aVar6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20642f = aVar6;
        z0.a aVar7 = map.get("convs.2.bias");
        if (aVar7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20643g = aVar7;
        z0.a aVar8 = map.get("fc1.weight");
        if (aVar8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20644h = i.k(aVar8);
        z0.a aVar9 = map.get("fc2.weight");
        if (aVar9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20645i = i.k(aVar9);
        z0.a aVar10 = map.get("fc1.bias");
        if (aVar10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20646j = aVar10;
        z0.a aVar11 = map.get("fc2.bias");
        if (aVar11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f20647k = aVar11;
        this.f20648l = new HashMap();
        f10 = m0.f(f.a.MTML_INTEGRITY_DETECT.g(), f.a.MTML_APP_EVENT_PREDICTION.g());
        for (String str : f10) {
            String k10 = l.k(str, ".weight");
            String k11 = l.k(str, ".bias");
            z0.a aVar12 = map.get(k10);
            z0.a aVar13 = map.get(k11);
            if (aVar12 != null) {
                i iVar2 = i.f20673a;
                this.f20648l.put(k10, i.k(aVar12));
            }
            if (aVar13 != null) {
                this.f20648l.put(k11, aVar13);
            }
        }
    }

    public /* synthetic */ b(Map map, kotlin.jvm.internal.g gVar) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (k1.a.d(b.class)) {
            return null;
        }
        try {
            return f20636n;
        } catch (Throwable th) {
            k1.a.b(th, b.class);
            return null;
        }
    }

    public final z0.a b(z0.a dense, String[] texts, String task) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            l.e(dense, "dense");
            l.e(texts, "texts");
            l.e(task, "task");
            i iVar = i.f20673a;
            z0.a c10 = i.c(i.e(texts, 128, this.f20637a), this.f20638b);
            i.a(c10, this.f20641e);
            i.i(c10);
            z0.a c11 = i.c(c10, this.f20639c);
            i.a(c11, this.f20642f);
            i.i(c11);
            z0.a g10 = i.g(c11, 2);
            z0.a c12 = i.c(g10, this.f20640d);
            i.a(c12, this.f20643g);
            i.i(c12);
            z0.a g11 = i.g(c10, c10.b(1));
            z0.a g12 = i.g(g10, g10.b(1));
            z0.a g13 = i.g(c12, c12.b(1));
            i.f(g11, 1);
            i.f(g12, 1);
            i.f(g13, 1);
            z0.a d10 = i.d(i.b(new z0.a[]{g11, g12, g13, dense}), this.f20644h, this.f20646j);
            i.i(d10);
            z0.a d11 = i.d(d10, this.f20645i, this.f20647k);
            i.i(d11);
            z0.a aVar = this.f20648l.get(l.k(task, ".weight"));
            z0.a aVar2 = this.f20648l.get(l.k(task, ".bias"));
            if (aVar != null && aVar2 != null) {
                z0.a d12 = i.d(d11, aVar, aVar2);
                i.j(d12);
                return d12;
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }
}
