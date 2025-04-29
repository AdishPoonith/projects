package u8;

import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import r8.d;
/* loaded from: classes.dex */
public class e1 implements d.InterfaceC0247d {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseAuth f19194a;

    /* renamed from: b  reason: collision with root package name */
    private FirebaseAuth.b f19195b;

    public e1(FirebaseAuth firebaseAuth) {
        this.f19194a = firebaseAuth;
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
        hashMap.put("appName", this.f19194a.l().q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.b bVar2 = new FirebaseAuth.b() { // from class: u8.d1
            @Override // com.google.firebase.auth.FirebaseAuth.b
            public final void a(FirebaseAuth firebaseAuth) {
                e1.d(atomicBoolean, hashMap, bVar, firebaseAuth);
            }
        };
        this.f19195b = bVar2;
        this.f19194a.f(bVar2);
    }

    @Override // r8.d.InterfaceC0247d
    public void c(Object obj) {
        FirebaseAuth.b bVar = this.f19195b;
        if (bVar != null) {
            this.f19194a.r(bVar);
            this.f19195b = null;
        }
    }
}
