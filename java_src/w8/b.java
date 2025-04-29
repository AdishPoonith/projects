package w8;

import com.google.firebase.firestore.f0;
import com.google.firebase.firestore.n0;
import com.google.firebase.firestore.z;
import java.util.Map;
import java.util.Objects;
import r8.d;
/* loaded from: classes.dex */
public class b implements d.InterfaceC0247d {

    /* renamed from: a  reason: collision with root package name */
    f0 f20038a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(d.b bVar, com.google.firebase.firestore.n nVar, z zVar) {
        if (zVar == null) {
            bVar.a(nVar);
            return;
        }
        bVar.b("firebase_firestore", zVar.getMessage(), x8.a.a(zVar));
        bVar.c();
        c(null);
    }

    @Override // r8.d.InterfaceC0247d
    public void b(Object obj, final d.b bVar) {
        Map map = (Map) obj;
        Object obj2 = map.get("includeMetadataChanges");
        Objects.requireNonNull(obj2);
        n0 n0Var = ((Boolean) obj2).booleanValue() ? n0.INCLUDE : n0.EXCLUDE;
        Object obj3 = map.get("reference");
        Objects.requireNonNull(obj3);
        this.f20038a = ((com.google.firebase.firestore.m) obj3).d(n0Var, new com.google.firebase.firestore.o() { // from class: w8.a
            @Override // com.google.firebase.firestore.o
            public final void a(Object obj4, z zVar) {
                b.this.d(bVar, (com.google.firebase.firestore.n) obj4, zVar);
            }
        });
    }

    @Override // r8.d.InterfaceC0247d
    public void c(Object obj) {
        f0 f0Var = this.f20038a;
        if (f0Var != null) {
            f0Var.remove();
            this.f20038a = null;
        }
    }
}
