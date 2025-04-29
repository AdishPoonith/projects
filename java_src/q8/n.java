package q8;

import java.util.ArrayList;
import r8.k;
import r8.s;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final r8.k f16453a;

    /* renamed from: b  reason: collision with root package name */
    private b f16454b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f16455c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // r8.k.c
        public void I(r8.j jVar, k.d dVar) {
            if (n.this.f16454b == null) {
                d8.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f16777a;
            Object obj = jVar.f16778b;
            d8.b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                n.this.f16454b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e10) {
                dVar.b("error", e10.getMessage(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str, String str2, k.d dVar);
    }

    public n(e8.a aVar) {
        a aVar2 = new a();
        this.f16455c = aVar2;
        r8.k kVar = new r8.k(aVar, "flutter/spellcheck", s.f16792b);
        this.f16453a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f16454b = bVar;
    }
}
