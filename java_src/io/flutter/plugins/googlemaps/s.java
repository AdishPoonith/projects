package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r8.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, q> f10687a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f10688b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final r8.k f10689c;

    /* renamed from: d  reason: collision with root package name */
    private u4.c f10690d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(r8.k kVar) {
        this.f10689c = kVar;
    }

    private void a(Object obj) {
        if (obj == null) {
            return;
        }
        p pVar = new p();
        b(e.g(obj, pVar), pVar.l(), pVar.m());
    }

    private void b(String str, w4.m mVar, boolean z10) {
        w4.l b10 = this.f10690d.b(mVar);
        this.f10687a.put(str, new q(b10, z10));
        this.f10688b.put(b10.a(), str);
    }

    private void d(Object obj) {
        if (obj == null) {
            return;
        }
        q qVar = this.f10687a.get(f(obj));
        if (qVar != null) {
            e.g(obj, qVar);
        }
    }

    private static String f(Object obj) {
        return (String) ((Map) obj).get("markerId");
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
    public void g(String str, k.d dVar) {
        q qVar = this.f10687a.get(str);
        if (qVar == null) {
            dVar.b("Invalid markerId", "hideInfoWindow called with invalid markerId", null);
            return;
        }
        qVar.n();
        dVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(String str, k.d dVar) {
        q qVar = this.f10687a.get(str);
        if (qVar != null) {
            dVar.a(Boolean.valueOf(qVar.o()));
        } else {
            dVar.b("Invalid markerId", "isInfoWindowShown called with invalid markerId", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(String str) {
        String str2 = this.f10688b.get(str);
        if (str2 == null) {
            return;
        }
        this.f10689c.c("infoWindow#onTap", e.n(str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(String str, LatLng latLng) {
        String str2 = this.f10688b.get(str);
        if (str2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("markerId", str2);
        hashMap.put("position", e.l(latLng));
        this.f10689c.c("marker#onDrag", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(String str, LatLng latLng) {
        String str2 = this.f10688b.get(str);
        if (str2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("markerId", str2);
        hashMap.put("position", e.l(latLng));
        this.f10689c.c("marker#onDragEnd", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(String str, LatLng latLng) {
        String str2 = this.f10688b.get(str);
        if (str2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("markerId", str2);
        hashMap.put("position", e.l(latLng));
        this.f10689c.c("marker#onDragStart", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m(String str) {
        String str2 = this.f10688b.get(str);
        if (str2 == null) {
            return false;
        }
        this.f10689c.c("marker#onTap", e.n(str2));
        q qVar = this.f10687a.get(str2);
        if (qVar != null) {
            return qVar.l();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(List<Object> list) {
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                q remove = this.f10687a.remove((String) obj);
                if (remove != null) {
                    remove.p();
                    this.f10688b.remove(remove.m());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(u4.c cVar) {
        this.f10690d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(String str, k.d dVar) {
        q qVar = this.f10687a.get(str);
        if (qVar == null) {
            dVar.b("Invalid markerId", "showInfoWindow called with invalid markerId", null);
            return;
        }
        qVar.q();
        dVar.a(null);
    }
}
