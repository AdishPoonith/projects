package q8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r8.k;
import r8.s;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final r8.k f16326a;

    /* renamed from: b  reason: collision with root package name */
    private f8.a f16327b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<k.d>> f16328c;

    /* renamed from: d  reason: collision with root package name */
    final k.c f16329d;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // r8.k.c
        public void I(r8.j jVar, k.d dVar) {
            String str;
            if (b.this.f16327b == null) {
                return;
            }
            String str2 = jVar.f16777a;
            Map map = (Map) jVar.b();
            d8.b.f("DeferredComponentChannel", "Received '" + str2 + "' message.");
            int intValue = ((Integer) map.get("loadingUnitId")).intValue();
            String str3 = (String) map.get("componentName");
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case -1004447972:
                    if (str2.equals("uninstallDeferredComponent")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 399701758:
                    if (str2.equals("getDeferredComponentInstallState")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 520962947:
                    if (str2.equals("installDeferredComponent")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    b.this.f16327b.b(intValue, str3);
                    str = null;
                    break;
                case 1:
                    str = b.this.f16327b.a(intValue, str3);
                    break;
                case 2:
                    b.this.f16327b.f(intValue, str3);
                    if (!b.this.f16328c.containsKey(str3)) {
                        b.this.f16328c.put(str3, new ArrayList());
                    }
                    ((List) b.this.f16328c.get(str3)).add(dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
            dVar.a(str);
        }
    }

    public b(e8.a aVar) {
        a aVar2 = new a();
        this.f16329d = aVar2;
        r8.k kVar = new r8.k(aVar, "flutter/deferredcomponent", s.f16792b);
        this.f16326a = kVar;
        kVar.e(aVar2);
        this.f16327b = d8.a.e().a();
        this.f16328c = new HashMap();
    }

    public void c(f8.a aVar) {
        this.f16327b = aVar;
    }
}
