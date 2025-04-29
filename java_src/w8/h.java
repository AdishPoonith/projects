package w8;

import com.google.firebase.firestore.f0;
import com.google.firebase.firestore.n;
import com.google.firebase.firestore.n0;
import com.google.firebase.firestore.u0;
import com.google.firebase.firestore.w0;
import com.google.firebase.firestore.z;
import java.util.Map;
import java.util.Objects;
import r8.d;
import v8.w;
/* loaded from: classes.dex */
public class h implements d.InterfaceC0247d {

    /* renamed from: a  reason: collision with root package name */
    f0 f20046a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(d.b bVar, n.a aVar, w0 w0Var, z zVar) {
        if (zVar == null) {
            if (w0Var != null) {
                w.f19514s.put(Integer.valueOf(w0Var.hashCode()), aVar);
            }
            bVar.a(w0Var);
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
        u0 u0Var = (u0) map.get("query");
        final n.a a10 = x8.b.a((String) map.get("serverTimestampBehavior"));
        if (u0Var == null) {
            throw new IllegalArgumentException("An error occurred while parsing query arguments, see native logs for more information. Please report this issue.");
        }
        this.f20046a = u0Var.d(n0Var, new com.google.firebase.firestore.o() { // from class: w8.g
            @Override // com.google.firebase.firestore.o
            public final void a(Object obj3, z zVar) {
                h.this.d(bVar, a10, (w0) obj3, zVar);
            }
        });
    }

    @Override // r8.d.InterfaceC0247d
    public void c(Object obj) {
        f0 f0Var = this.f20046a;
        if (f0Var != null) {
            f0Var.remove();
            this.f20046a = null;
        }
    }
}
