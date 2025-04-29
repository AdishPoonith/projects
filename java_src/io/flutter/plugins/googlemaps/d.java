package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b> f10638a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f10639b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final r8.k f10640c;

    /* renamed from: d  reason: collision with root package name */
    private final float f10641d;

    /* renamed from: e  reason: collision with root package name */
    private u4.c f10642e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(r8.k kVar, float f10) {
        this.f10640c = kVar;
        this.f10641d = f10;
    }

    private void a(Object obj) {
        if (obj == null) {
            return;
        }
        a aVar = new a(this.f10641d);
        b(e.d(obj, aVar), aVar.d(), aVar.i());
    }

    private void b(String str, w4.f fVar, boolean z10) {
        w4.e a10 = this.f10642e.a(fVar);
        this.f10638a.put(str, new b(a10, z10, this.f10641d));
        this.f10639b.put(a10.a(), str);
    }

    private void d(Object obj) {
        if (obj == null) {
            return;
        }
        b bVar = this.f10638a.get(f(obj));
        if (bVar != null) {
            e.d(obj, bVar);
        }
    }

    private static String f(Object obj) {
        return (String) ((Map) obj).get("circleId");
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
        String str2 = this.f10639b.get(str);
        if (str2 == null) {
            return false;
        }
        this.f10640c.c("circle#onTap", e.b(str2));
        b bVar = this.f10638a.get(str2);
        if (bVar != null) {
            return bVar.d();
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
                b remove = this.f10638a.remove((String) obj);
                if (remove != null) {
                    remove.j();
                    this.f10639b.remove(remove.i());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(u4.c cVar) {
        this.f10642e = cVar;
    }
}
