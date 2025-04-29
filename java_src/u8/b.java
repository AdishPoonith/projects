package u8;

import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import r8.d;
/* loaded from: classes.dex */
public class b implements d.InterfaceC0247d {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseAuth f19163a;

    /* renamed from: b  reason: collision with root package name */
    private FirebaseAuth.a f19164b;

    public b(FirebaseAuth firebaseAuth) {
        this.f19163a = firebaseAuth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(AtomicBoolean atomicBoolean, Map map, d.b bVar, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        com.google.firebase.auth.a0 m10 = firebaseAuth.m();
        map.put("user", m10 == null ? null : t0.s1(m10));
        bVar.a(map);
    }

    @Override // r8.d.InterfaceC0247d
    public void b(Object obj, final d.b bVar) {
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f19163a.l().q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.a aVar = new FirebaseAuth.a() { // from class: u8.a
            @Override // com.google.firebase.auth.FirebaseAuth.a
            public final void a(FirebaseAuth firebaseAuth) {
                b.d(atomicBoolean, hashMap, bVar, firebaseAuth);
            }
        };
        this.f19164b = aVar;
        this.f19163a.e(aVar);
    }

    @Override // r8.d.InterfaceC0247d
    public void c(Object obj) {
        FirebaseAuth.a aVar = this.f19164b;
        if (aVar != null) {
            this.f19163a.q(aVar);
            this.f19164b = null;
        }
    }
}
