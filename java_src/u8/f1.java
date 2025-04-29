package u8;

import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.p0;
import com.google.firebase.auth.q0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import r8.d;
/* loaded from: classes.dex */
public class f1 implements d.InterfaceC0247d {

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap<Integer, q0.a> f19201k = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<Activity> f19202a;

    /* renamed from: b  reason: collision with root package name */
    final FirebaseAuth f19203b;

    /* renamed from: c  reason: collision with root package name */
    final String f19204c;

    /* renamed from: d  reason: collision with root package name */
    final com.google.firebase.auth.t0 f19205d;

    /* renamed from: e  reason: collision with root package name */
    final int f19206e;

    /* renamed from: f  reason: collision with root package name */
    final b f19207f;

    /* renamed from: g  reason: collision with root package name */
    final com.google.firebase.auth.l0 f19208g;

    /* renamed from: h  reason: collision with root package name */
    String f19209h;

    /* renamed from: i  reason: collision with root package name */
    Integer f19210i;

    /* renamed from: j  reason: collision with root package name */
    private d.b f19211j;

    /* loaded from: classes.dex */
    class a extends q0.b {
        a() {
        }

        @Override // com.google.firebase.auth.q0.b
        public void a(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
            if (f1.this.f19211j != null) {
                f1.this.f19211j.a(hashMap);
            }
        }

        @Override // com.google.firebase.auth.q0.b
        public void b(String str, q0.a aVar) {
            int hashCode = aVar.hashCode();
            f1.f19201k.put(Integer.valueOf(hashCode), aVar);
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put("forceResendingToken", Integer.valueOf(hashCode));
            hashMap.put("name", "Auth#phoneCodeSent");
            if (f1.this.f19211j != null) {
                f1.this.f19211j.a(hashMap);
            }
        }

        @Override // com.google.firebase.auth.q0.b
        public void c(com.google.firebase.auth.o0 o0Var) {
            int hashCode = o0Var.hashCode();
            f1.this.f19207f.a(o0Var);
            HashMap hashMap = new HashMap();
            hashMap.put("token", Integer.valueOf(hashCode));
            if (o0Var.E() != null) {
                hashMap.put("smsCode", o0Var.E());
            }
            hashMap.put("name", "Auth#phoneVerificationCompleted");
            if (f1.this.f19211j != null) {
                f1.this.f19211j.a(hashMap);
            }
        }

        @Override // com.google.firebase.auth.q0.b
        public void d(w5.l lVar) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", lVar.getLocalizedMessage());
            hashMap.put("details", t0.q0(lVar));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("error", hashMap);
            hashMap2.put("name", "Auth#phoneVerificationFailed");
            if (f1.this.f19211j != null) {
                f1.this.f19211j.a(hashMap2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(com.google.firebase.auth.o0 o0Var);
    }

    public f1(Activity activity, Map<String, Object> map, com.google.firebase.auth.l0 l0Var, com.google.firebase.auth.t0 t0Var, b bVar) {
        AtomicReference<Activity> atomicReference = new AtomicReference<>(null);
        this.f19202a = atomicReference;
        atomicReference.set(activity);
        this.f19208g = l0Var;
        this.f19205d = t0Var;
        this.f19203b = t0.m0(map);
        this.f19204c = (String) map.get("phoneNumber");
        Object obj = map.get("timeout");
        Objects.requireNonNull(obj);
        this.f19206e = ((Integer) obj).intValue();
        if (map.containsKey("autoRetrievedSmsCodeForTesting")) {
            this.f19209h = (String) map.get("autoRetrievedSmsCodeForTesting");
        }
        if (map.containsKey("forceResendingToken")) {
            this.f19210i = (Integer) map.get("forceResendingToken");
        }
        this.f19207f = bVar;
    }

    @Override // r8.d.InterfaceC0247d
    public void b(Object obj, d.b bVar) {
        q0.a aVar;
        this.f19211j = bVar;
        a aVar2 = new a();
        if (this.f19209h != null) {
            this.f19203b.n().c(this.f19204c, this.f19209h);
        }
        p0.a aVar3 = new p0.a(this.f19203b);
        aVar3.b(this.f19202a.get());
        aVar3.c(aVar2);
        String str = this.f19204c;
        if (str != null) {
            aVar3.g(str);
        }
        com.google.firebase.auth.l0 l0Var = this.f19208g;
        if (l0Var != null) {
            aVar3.f(l0Var);
        }
        com.google.firebase.auth.t0 t0Var = this.f19205d;
        if (t0Var != null) {
            aVar3.e(t0Var);
        }
        aVar3.h(Long.valueOf(this.f19206e), TimeUnit.MILLISECONDS);
        Integer num = this.f19210i;
        if (num != null && (aVar = f19201k.get(num)) != null) {
            aVar3.d(aVar);
        }
        com.google.firebase.auth.q0.b(aVar3.a());
    }

    @Override // r8.d.InterfaceC0247d
    public void c(Object obj) {
        this.f19211j = null;
        this.f19202a.set(null);
    }
}
