package u8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r8.a;
import u8.v0;
/* loaded from: classes.dex */
public final /* synthetic */ class x0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements v0.i<Map<String, Object>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f19323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f19324b;

        a(Map map, a.e eVar) {
            this.f19323a = map;
            this.f19324b = eVar;
        }

        @Override // u8.v0.i
        public void b(Throwable th) {
            Map b10;
            Map map = this.f19323a;
            b10 = v0.b(th);
            map.put("error", b10);
            this.f19324b.a(this.f19323a);
        }

        @Override // u8.v0.i
        /* renamed from: c */
        public void a(Map<String, Object> map) {
            this.f19323a.put("result", map);
            this.f19324b.a(this.f19323a);
        }
    }

    public static r8.i<Object> a() {
        return v0.c.f19300d;
    }

    public static /* synthetic */ void b(v0.b bVar, Object obj, a.e eVar) {
        Map b10;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("resolverIdArg unexpectedly null.");
            }
            v0.h hVar = (v0.h) arrayList.get(1);
            if (hVar == null) {
                throw new NullPointerException("assertionArg unexpectedly null.");
            }
            bVar.a(str, hVar, new a(hashMap, eVar));
        } catch (Error | RuntimeException e10) {
            b10 = v0.b(e10);
            hashMap.put("error", b10);
            eVar.a(hashMap);
        }
    }

    public static void c(r8.c cVar, final v0.b bVar) {
        new r8.a(cVar, "dev.flutter.pigeon.MultiFactoResolverHostApi.resolveSignIn", a()).e(bVar != null ? new a.d() { // from class: u8.w0
            @Override // r8.a.d
            public final void a(Object obj, a.e eVar) {
                x0.b(v0.b.this, obj, eVar);
            }
        } : null);
    }
}
