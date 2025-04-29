package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, c0> f10643a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final r8.k f10644b;

    /* renamed from: c  reason: collision with root package name */
    private u4.c f10645c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(r8.k kVar) {
        this.f10644b = kVar;
    }

    private void a(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        b0 b0Var = new b0();
        String k10 = e.k(map, b0Var);
        b0Var.e(new g0(this.f10644b, k10));
        this.f10643a.put(k10, new c0(this.f10645c.e(b0Var.d())));
    }

    private void c(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        c0 c0Var = this.f10643a.get(f(map));
        if (c0Var != null) {
            e.k(map, c0Var);
        }
    }

    private static String f(Map<String, ?> map) {
        return (String) map.get("tileOverlayId");
    }

    private void h(String str) {
        c0 c0Var = this.f10643a.get(str);
        if (c0Var != null) {
            c0Var.f();
            this.f10643a.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(List<Map<String, ?>> list) {
        if (list == null) {
            return;
        }
        for (Map<String, ?> map : list) {
            a(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(List<Map<String, ?>> list) {
        if (list == null) {
            return;
        }
        for (Map<String, ?> map : list) {
            c(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str) {
        c0 c0Var;
        if (str == null || (c0Var = this.f10643a.get(str)) == null) {
            return;
        }
        c0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> g(String str) {
        c0 c0Var;
        if (str == null || (c0Var = this.f10643a.get(str)) == null) {
            return null;
        }
        return c0Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(List<String> list) {
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (str != null) {
                h(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(u4.c cVar) {
        this.f10645c = cVar;
    }
}
