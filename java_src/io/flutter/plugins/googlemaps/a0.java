package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, y> f10627a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f10628b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final r8.k f10629c;

    /* renamed from: d  reason: collision with root package name */
    private u4.c f10630d;

    /* renamed from: e  reason: collision with root package name */
    private final float f10631e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(r8.k kVar, float f10) {
        this.f10629c = kVar;
        this.f10631e = f10;
    }

    private void a(Object obj) {
        if (obj == null) {
            return;
        }
        x xVar = new x(this.f10631e);
        b(e.i(obj, xVar), xVar.k(), xVar.l());
    }

    private void b(String str, w4.r rVar, boolean z10) {
        w4.q d10 = this.f10630d.d(rVar);
        this.f10627a.put(str, new y(d10, z10, this.f10631e));
        this.f10628b.put(d10.a(), str);
    }

    private void d(Object obj) {
        if (obj == null) {
            return;
        }
        y yVar = this.f10627a.get(f(obj));
        if (yVar != null) {
            e.i(obj, yVar);
        }
    }

    private static String f(Object obj) {
        return (String) ((Map) obj).get("polylineId");
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
        String str2 = this.f10628b.get(str);
        if (str2 == null) {
            return false;
        }
        this.f10629c.c("polyline#onTap", e.q(str2));
        y yVar = this.f10627a.get(str2);
        if (yVar != null) {
            return yVar.k();
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
                y remove = this.f10627a.remove((String) obj);
                if (remove != null) {
                    remove.m();
                    this.f10628b.remove(remove.l());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(u4.c cVar) {
        this.f10630d = cVar;
    }
}
