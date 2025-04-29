package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, u> f10698a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f10699b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final r8.k f10700c;

    /* renamed from: d  reason: collision with root package name */
    private final float f10701d;

    /* renamed from: e  reason: collision with root package name */
    private u4.c f10702e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(r8.k kVar, float f10) {
        this.f10700c = kVar;
        this.f10701d = f10;
    }

    private void a(Object obj) {
        if (obj == null) {
            return;
        }
        t tVar = new t(this.f10701d);
        b(e.h(obj, tVar), tVar.i(), tVar.j());
    }

    private void b(String str, w4.p pVar, boolean z10) {
        w4.o c10 = this.f10702e.c(pVar);
        this.f10698a.put(str, new u(c10, z10, this.f10701d));
        this.f10699b.put(c10.a(), str);
    }

    private void d(Object obj) {
        if (obj == null) {
            return;
        }
        u uVar = this.f10698a.get(f(obj));
        if (uVar != null) {
            e.h(obj, uVar);
        }
    }

    private static String f(Object obj) {
        return (String) ((Map) obj).get("polygonId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(List<Object> list) {
        if (list != null) {
            for (Object obj : list) {
                a(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(List<Object> list) {
        if (list != null) {
            for (Object obj : list) {
                d(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(String str) {
        String str2 = this.f10699b.get(str);
        if (str2 == null) {
            return false;
        }
        this.f10700c.c("polygon#onTap", e.p(str2));
        u uVar = this.f10698a.get(str2);
        if (uVar != null) {
            return uVar.i();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(List<Object> list) {
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                u remove = this.f10698a.remove((String) obj);
                if (remove != null) {
                    remove.k();
                    this.f10699b.remove(remove.j());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(u4.c cVar) {
        this.f10702e = cVar;
    }
}
