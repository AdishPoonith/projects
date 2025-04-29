package u8;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.e;
import com.google.firebase.auth.n0;
import com.google.firebase.auth.z0;
import i8.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import r8.d;
import r8.k;
import u8.f1;
import u8.v0;
/* loaded from: classes.dex */
public class t0 implements FlutterFirebasePlugin, k.c, i8.a, j8.a, v0.d, v0.b {

    /* renamed from: q  reason: collision with root package name */
    static final HashMap<Integer, com.google.firebase.auth.h> f19281q = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private r8.c f19282j;

    /* renamed from: k  reason: collision with root package name */
    private r8.k f19283k;

    /* renamed from: l  reason: collision with root package name */
    private Activity f19284l;

    /* renamed from: m  reason: collision with root package name */
    private final Map<r8.d, d.InterfaceC0247d> f19285m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private final Map<String, Map<String, com.google.firebase.auth.h0>> f19286n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private final Map<String, com.google.firebase.auth.l0> f19287o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private final Map<String, com.google.firebase.auth.k0> f19288p = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends HashMap<String, Object> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ FirebaseAuth f19289j;

        a(FirebaseAuth firebaseAuth) {
            this.f19289j = firebaseAuth;
            put("languageCode", firebaseAuth.o());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A0(v0.i iVar, Task task) {
        if (task.isSuccessful()) {
            iVar.a(null);
        } else {
            iVar.b(task.getException());
        }
    }

    private Task<String> A1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.o
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.K0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            HashMap hashMap = new HashMap();
            hashMap.put("providers", ((com.google.firebase.auth.v0) Tasks.await(m02.k((String) obj))).a());
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> B1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.x
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.L0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(Map map, TaskCompletionSource taskCompletionSource) {
        Map<String, Object> u12;
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            Object obj = map.get("forceRefresh");
            Objects.requireNonNull(obj);
            Boolean bool = (Boolean) obj;
            Object obj2 = map.get("tokenOnly");
            Objects.requireNonNull(obj2);
            Boolean bool2 = (Boolean) obj2;
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
                return;
            }
            com.google.firebase.auth.c0 c0Var = (com.google.firebase.auth.c0) Tasks.await(p02.C(bool.booleanValue()));
            if (bool2.booleanValue()) {
                u12 = new HashMap<>();
                u12.put("token", c0Var.g());
            } else {
                u12 = u1(c0Var);
            }
            taskCompletionSource.setResult(u12);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private void C1() {
        for (r8.d dVar : this.f19285m.keySet()) {
            d.InterfaceC0247d interfaceC0247d = this.f19285m.get(dVar);
            if (interfaceC0247d != null) {
                interfaceC0247d.c(null);
            }
            dVar.d(null);
        }
        this.f19285m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D0(w5.f fVar, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVar);
            com.google.firebase.auth.a0 m10 = firebaseAuth.m();
            String o10 = firebaseAuth.o();
            Map<String, Object> s12 = m10 == null ? null : s1(m10);
            if (o10 != null) {
                hashMap.put("APP_LANGUAGE_CODE", o10);
            }
            if (s12 != null) {
                hashMap.put("APP_CURRENT_USER", s12);
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> D1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.f0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.N0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(v0.i iVar, Task task) {
        if (!task.isSuccessful()) {
            iVar.b(task.getException());
            return;
        }
        String uuid = UUID.randomUUID().toString();
        this.f19287o.put(uuid, (com.google.firebase.auth.l0) task.getResult());
        iVar.a(new v0.g.a().b(uuid).a());
    }

    private Task<Void> E1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.r
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.O0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            com.google.firebase.auth.h n02 = n0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
            } else if (n02 == null) {
                taskCompletionSource.setException(u0.d());
            } else {
                taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(p02.I(n02))));
            }
        } catch (Exception e10) {
            if (e10.getCause() instanceof com.google.firebase.auth.u) {
                s0(map, taskCompletionSource, e10);
                return;
            }
            String message = e10.getMessage();
            if (message == null || !message.contains("User has already been linked to the given provider.")) {
                taskCompletionSource.setException(e10);
            } else {
                taskCompletionSource.setException(u0.a());
            }
        }
    }

    private Task<Void> F1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.i
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.P0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G0(k.d dVar, Task task) {
        if (task.isSuccessful()) {
            dVar.a(task.getResult());
            return;
        }
        Exception exception = task.getException();
        dVar.b("firebase_auth", exception != null ? exception.getMessage() : null, q0(exception));
    }

    private Task<Map<String, Object>> G1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.u
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.Q0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            com.google.firebase.auth.h n02 = n0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
            } else if (n02 == null) {
                taskCompletionSource.setException(u0.d());
            } else {
                taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(p02.J(n02))));
            }
        } catch (Exception e10) {
            if (e10.getCause() instanceof com.google.firebase.auth.u) {
                s0(map, taskCompletionSource, e10);
            } else {
                taskCompletionSource.setException(e10);
            }
        }
    }

    private Task<Void> H1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.o0
            @Override // java.lang.Runnable
            public final void run() {
                t0.R0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            Object obj = map.get("signInProvider");
            Objects.requireNonNull(obj);
            List<String> list = (List) map.get("scopes");
            Map<String, String> map2 = (Map) map.get("customParameters");
            n0.a d10 = com.google.firebase.auth.n0.d((String) obj);
            if (list != null) {
                d10.c(list);
            }
            if (map2 != null) {
                d10.a(map2);
            }
            taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(p02.O(this.f19284l, d10.b()))));
        } catch (Exception e10) {
            if (e10.getCause() instanceof com.google.firebase.auth.u) {
                s0(map, taskCompletionSource, e10);
            } else {
                taskCompletionSource.setException(e10);
            }
        }
    }

    private Task<Map<String, Object>> I1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.q
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.S0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(Map map, TaskCompletionSource taskCompletionSource) {
        FirebaseAuth m02;
        try {
            b bVar = new b(m0(map));
            String str = "plugins.flutter.io/firebase_auth/auth-state/" + m02.l().q();
            r8.d dVar = new r8.d(this.f19282j, str);
            dVar.d(bVar);
            this.f19285m.put(dVar, bVar);
            taskCompletionSource.setResult(str);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> J1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.t
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.T0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(Map map, TaskCompletionSource taskCompletionSource) {
        FirebaseAuth m02;
        try {
            e1 e1Var = new e1(m0(map));
            String str = "plugins.flutter.io/firebase_auth/id-token/" + m02.l().q();
            r8.d dVar = new r8.d(this.f19282j, str);
            dVar.d(e1Var);
            this.f19285m.put(dVar, e1Var);
            taskCompletionSource.setResult(str);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> K1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.k0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.U0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
                return;
            }
            Tasks.await(p02.K());
            taskCompletionSource.setResult(s1(p0(map)));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> L1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.c0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.V0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(v0.i iVar, Task task) {
        if (task.isSuccessful()) {
            iVar.a(r1((com.google.firebase.auth.i) task.getResult()));
        } else {
            iVar.b(task.getException());
        }
    }

    private Task<Map<String, Object>> M1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.a0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.W0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
                return;
            }
            Object obj = map.get("actionCodeSettings");
            if (obj == null) {
                Tasks.await(p02.L());
                taskCompletionSource.setResult(null);
                return;
            }
            Tasks.await(p02.M(j0((Map) obj)));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> N1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.b0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.X0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            Object obj2 = map.get("actionCodeSettings");
            if (obj2 == null) {
                Tasks.await(m02.s(str));
                taskCompletionSource.setResult(null);
                return;
            }
            Tasks.await(m02.t(str, j0((Map) obj2)));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> O1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.d
            @Override // java.lang.Runnable
            public final void run() {
                t0.Y0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("actionCodeSettings");
            Objects.requireNonNull(obj2);
            Tasks.await(m02.u((String) obj, j0((Map) obj2)));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> P1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.g0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.Z0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            String str = (String) map.get("languageCode");
            if (str == null) {
                m02.E();
            } else {
                m02.v(str);
            }
            taskCompletionSource.setResult(new a(m02));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> Q1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.k
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.b1(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Boolean bool = (Boolean) map.get("appVerificationDisabledForTesting");
            Boolean bool2 = (Boolean) map.get("forceRecaptchaFlow");
            String str = (String) map.get("phoneNumber");
            String str2 = (String) map.get("smsCode");
            if (bool != null) {
                m02.n().b(bool.booleanValue());
            }
            if (bool2 != null) {
                m02.n().a(bool2.booleanValue());
            }
            if (str != null && str2 != null) {
                m02.n().c(str, str2);
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> R1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.w
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.c1(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(m0(map).x())));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> S1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.z
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.d1(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            com.google.firebase.auth.h n02 = n0(map);
            if (n02 == null) {
                throw u0.d();
            }
            taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(m02.y(n02))));
        } catch (Exception e10) {
            if (e10.getCause() instanceof com.google.firebase.auth.u) {
                s0(map, taskCompletionSource, e10);
            } else {
                taskCompletionSource.setException(e10);
            }
        }
    }

    private Task<Map<String, Object>> T1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.i0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.e1(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("token");
            Objects.requireNonNull(obj);
            taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(m02.z((String) obj))));
        } catch (Exception e10) {
            if (e10.getCause() instanceof com.google.firebase.auth.u) {
                s0(map, taskCompletionSource, e10);
            } else {
                taskCompletionSource.setException(e10);
            }
        }
    }

    private Task<Map<String, Object>> U1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.m
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.f1(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("password");
            Objects.requireNonNull(obj2);
            taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(m02.A((String) obj, (String) obj2))));
        } catch (Exception e10) {
            if (e10.getCause() instanceof com.google.firebase.auth.u) {
                s0(map, taskCompletionSource, e10);
            } else {
                taskCompletionSource.setException(e10);
            }
        }
    }

    private Task<Void> V1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.p0
            @Override // java.lang.Runnable
            public final void run() {
                t0.g1(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("emailLink");
            Objects.requireNonNull(obj2);
            taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(m02.B((String) obj, (String) obj2))));
        } catch (Exception e10) {
            if (e10.getCause() instanceof com.google.firebase.auth.u) {
                s0(map, taskCompletionSource, e10);
            } else {
                taskCompletionSource.setException(e10);
            }
        }
    }

    private Task<Void> W1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.p
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.h1(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("signInProvider");
            Objects.requireNonNull(obj);
            List<String> list = (List) map.get("scopes");
            Map<String, String> map2 = (Map) map.get("customParameters");
            n0.a d10 = com.google.firebase.auth.n0.d((String) obj);
            if (list != null) {
                d10.c(list);
            }
            if (map2 != null) {
                d10.a(map2);
            }
            taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(m02.D(this.f19284l, d10.b()))));
        } catch (Exception e10) {
            if (e10.getCause() instanceof com.google.firebase.auth.u) {
                s0(map, taskCompletionSource, e10);
            } else {
                taskCompletionSource.setException(e10);
            }
        }
    }

    private Task<Map<String, Object>> X1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.s0
            @Override // java.lang.Runnable
            public final void run() {
                t0.i1(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            m0(map).C();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<String> Y1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.l
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.k1(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            Object obj = map.get("signInProvider");
            Objects.requireNonNull(obj);
            List<String> list = (List) map.get("scopes");
            Map<String, String> map2 = (Map) map.get("customParameters");
            n0.a d10 = com.google.firebase.auth.n0.d((String) obj);
            if (list != null) {
                d10.c(list);
            }
            if (map2 != null) {
                d10.a(map2);
            }
            taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(p02.N(this.f19284l, d10.b()))));
        } catch (Exception e10) {
            if (e10.getCause() instanceof com.google.firebase.auth.u) {
                s0(map, taskCompletionSource, e10);
            } else {
                taskCompletionSource.setException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a1(v0.i iVar, Task task) {
        if (task.isSuccessful()) {
            iVar.a(null);
        } else {
            iVar.b(task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
                return;
            }
            Object obj = map.get("providerId");
            Objects.requireNonNull(obj);
            taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(p02.P((String) obj))));
        } catch (ExecutionException unused) {
            e = u0.e();
            taskCompletionSource.setException(e);
        } catch (Exception e10) {
            e = e10;
            taskCompletionSource.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c1(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
                return;
            }
            Object obj = map.get("newEmail");
            Objects.requireNonNull(obj);
            Tasks.await(p02.Q((String) obj));
            Tasks.await(p02.K());
            taskCompletionSource.setResult(s1(p02));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> d0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.r0
            @Override // java.lang.Runnable
            public final void run() {
                t0.u0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d1(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
                return;
            }
            Object obj = map.get("newPassword");
            Objects.requireNonNull(obj);
            Tasks.await(p02.R((String) obj));
            Tasks.await(p02.K());
            taskCompletionSource.setResult(s1(p02));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> e0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.s
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.v0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e1(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
                return;
            }
            com.google.firebase.auth.o0 o0Var = (com.google.firebase.auth.o0) n0(map);
            if (o0Var == null) {
                taskCompletionSource.setException(u0.d());
                return;
            }
            Tasks.await(p02.S(o0Var));
            Tasks.await(p02.K());
            taskCompletionSource.setResult(s1(p02));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> f0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.e
            @Override // java.lang.Runnable
            public final void run() {
                t0.w0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f1(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
                return;
            }
            Object obj = map.get("profile");
            Objects.requireNonNull(obj);
            Map map2 = (Map) obj;
            z0.a aVar = new z0.a();
            if (map2.containsKey("displayName")) {
                aVar.b((String) map2.get("displayName"));
            }
            if (map2.containsKey("photoURL")) {
                String str = (String) map2.get("photoURL");
                if (str != null) {
                    aVar.c(Uri.parse(str));
                } else {
                    aVar.c(null);
                }
            }
            Tasks.await(p02.T(aVar.a()));
            Tasks.await(p02.K());
            taskCompletionSource.setResult(s1(p02));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> g0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.e0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.x0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g1(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            m0(map).F((String) map.get("host"), ((Integer) map.get("port")).intValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> h0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.h0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.y0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
            }
            Object obj = map.get("newEmail");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            Object obj2 = map.get("actionCodeSettings");
            if (obj2 == null) {
                Tasks.await(p02.U(str));
                taskCompletionSource.setResult(null);
                return;
            }
            Tasks.await(p02.V(str, j0((Map) obj2)));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> i0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.q0
            @Override // java.lang.Runnable
            public final void run() {
                t0.B0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i1(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            HashMap hashMap = new HashMap();
            hashMap.put("email", Tasks.await(m02.G((String) obj)));
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private com.google.firebase.auth.e j0(Map<String, Object> map) {
        e.a H = com.google.firebase.auth.e.H();
        Object obj = map.get("url");
        Objects.requireNonNull(obj);
        H.f((String) obj);
        if (map.get("dynamicLinkDomain") != null) {
            Object obj2 = map.get("dynamicLinkDomain");
            Objects.requireNonNull(obj2);
            H.c((String) obj2);
        }
        if (map.get("handleCodeInApp") != null) {
            Object obj3 = map.get("handleCodeInApp");
            Objects.requireNonNull(obj3);
            H.d(((Boolean) obj3).booleanValue());
        }
        if (map.get("android") != null) {
            Object obj4 = map.get("android");
            Objects.requireNonNull(obj4);
            Map map2 = (Map) obj4;
            boolean z10 = false;
            if (map2.get("installApp") != null) {
                Object obj5 = map2.get("installApp");
                Objects.requireNonNull(obj5);
                z10 = ((Boolean) obj5).booleanValue();
            }
            String str = map2.get("minimumVersion") != null ? (String) map2.get("minimumVersion") : null;
            Object obj6 = map2.get("packageName");
            Objects.requireNonNull(obj6);
            H.b((String) obj6, z10, str);
        }
        if (map.get("iOS") != null) {
            Object obj7 = map.get("iOS");
            Objects.requireNonNull(obj7);
            Object obj8 = ((Map) obj7).get("bundleId");
            Objects.requireNonNull(obj8);
            H.e((String) obj8);
        }
        return H.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j1(com.google.firebase.auth.o0 o0Var) {
        f19281q.put(Integer.valueOf(o0Var.hashCode()), o0Var);
    }

    private Activity k0() {
        return this.f19284l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k1(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            String str = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
            r8.d dVar = new r8.d(this.f19282j, str);
            String str2 = (String) map.get("multiFactorSessionId");
            com.google.firebase.auth.t0 t0Var = null;
            com.google.firebase.auth.l0 l0Var = str2 != null ? this.f19287o.get(str2) : null;
            String str3 = (String) map.get("multiFactorInfo");
            if (str3 != null) {
                for (String str4 : this.f19288p.keySet()) {
                    Iterator<com.google.firebase.auth.j0> it = this.f19288p.get(str4).B().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            com.google.firebase.auth.j0 next = it.next();
                            if (next.a().equals(str3) && (next instanceof com.google.firebase.auth.t0)) {
                                t0Var = (com.google.firebase.auth.t0) next;
                                break;
                            }
                        }
                    }
                }
            }
            f1 f1Var = new f1(k0(), map, l0Var, t0Var, new f1.b() { // from class: u8.m0
                @Override // u8.f1.b
                public final void a(com.google.firebase.auth.o0 o0Var) {
                    t0.j1(o0Var);
                }
            });
            dVar.d(f1Var);
            this.f19285m.put(dVar, f1Var);
            taskCompletionSource.setResult(str);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private com.google.firebase.auth.h0 l0(String str) {
        com.google.firebase.auth.a0 o02 = o0(str);
        if (o02 != null) {
            if (this.f19286n.get(str) == null) {
                this.f19286n.put(str, new HashMap());
            }
            Map<String, com.google.firebase.auth.h0> map = this.f19286n.get(str);
            if (map.get(o02.a()) == null) {
                map.put(o02.a(), o02.E());
            }
            return map.get(o02.a());
        }
        throw new u6.a("No user is signed in");
    }

    private Task<Map<String, Object>> l1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.v
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.F0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FirebaseAuth m0(Map<String, Object> map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(w5.f.p((String) obj));
        String str = (String) map.get("tenantId");
        if (str != null) {
            firebaseAuth.w(str);
        }
        return firebaseAuth;
    }

    private List<Map<String, Object>> m1(List<com.google.firebase.auth.j0> list) {
        ArrayList arrayList = new ArrayList();
        for (v0.f fVar : n1(list)) {
            arrayList.add(fVar.g());
        }
        return arrayList;
    }

    private com.google.firebase.auth.h n0(Map<String, Object> map) {
        Object obj = map.get("credential");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get("token") != null) {
            com.google.firebase.auth.h hVar = f19281q.get(Integer.valueOf(((Integer) map2.get("token")).intValue()));
            if (hVar != null) {
                return hVar;
            }
            throw u0.d();
        }
        Object obj2 = map2.get("signInMethod");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        String str2 = (String) map2.get("secret");
        String str3 = (String) map2.get("idToken");
        String str4 = (String) map2.get("accessToken");
        String str5 = (String) map2.get("rawNonce");
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals("twitter.com")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c10 = 1;
                    break;
                }
                break;
            case -364826023:
                if (str.equals("facebook.com")) {
                    c10 = 2;
                    break;
                }
                break;
            case 105516695:
                if (str.equals("oauth")) {
                    c10 = 3;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                Objects.requireNonNull(str4);
                Objects.requireNonNull(str2);
                return com.google.firebase.auth.x0.a(str4, str2);
            case 1:
                return com.google.firebase.auth.g0.a(str3, str4);
            case 2:
                Objects.requireNonNull(str4);
                return com.google.firebase.auth.m.a(str4);
            case 3:
                Object obj3 = map2.get("providerId");
                Objects.requireNonNull(obj3);
                n0.b f10 = com.google.firebase.auth.n0.f((String) obj3);
                Objects.requireNonNull(str4);
                f10.b(str4);
                Objects.requireNonNull(str3);
                if (str5 == null) {
                    f10.c(str3);
                } else {
                    f10.d(str3, str5);
                }
                return f10.a();
            case 4:
                Object obj4 = map2.get("verificationId");
                Objects.requireNonNull(obj4);
                Object obj5 = map2.get("smsCode");
                Objects.requireNonNull(obj5);
                return com.google.firebase.auth.q0.a((String) obj4, (String) obj5);
            case 5:
                Object obj6 = map2.get("email");
                Objects.requireNonNull(obj6);
                Objects.requireNonNull(str2);
                return com.google.firebase.auth.k.a((String) obj6, str2);
            case 6:
                Objects.requireNonNull(str4);
                return com.google.firebase.auth.e0.a(str4);
            case 7:
                Object obj7 = map2.get("email");
                Objects.requireNonNull(obj7);
                Object obj8 = map2.get("emailLink");
                Objects.requireNonNull(obj8);
                return com.google.firebase.auth.k.b((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    private List<v0.f> n1(List<com.google.firebase.auth.j0> list) {
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.j0 j0Var : list) {
            arrayList.add((j0Var instanceof com.google.firebase.auth.t0 ? new v0.f.a().e(((com.google.firebase.auth.t0) j0Var).j()) : new v0.f.a()).b(j0Var.x()).c(Double.valueOf(j0Var.B())).f(j0Var.a()).d(j0Var.C()).a());
        }
        return arrayList;
    }

    private com.google.firebase.auth.a0 o0(String str) {
        return FirebaseAuth.getInstance(w5.f.p(str)).m();
    }

    private Map<String, Object> o1(com.google.firebase.auth.d dVar) {
        int i10;
        int i11;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int a10 = dVar.a();
        if (a10 == 0) {
            i10 = 1;
        } else if (a10 != 1) {
            if (a10 != 2) {
                i11 = 4;
                if (a10 != 4) {
                    if (a10 == 5) {
                        i10 = 5;
                    } else if (a10 != 6) {
                        i11 = 0;
                    } else {
                        i10 = 6;
                    }
                }
            } else {
                i11 = 3;
            }
            i10 = Integer.valueOf(i11);
        } else {
            i10 = 2;
        }
        hashMap.put("operation", i10);
        com.google.firebase.auth.b b10 = dVar.b();
        if ((b10 != null && a10 == 1) || a10 == 0) {
            hashMap2.put("email", b10.a());
        } else if (a10 != 6) {
            if (a10 == 2 || a10 == 5) {
                Objects.requireNonNull(b10);
                com.google.firebase.auth.a aVar = (com.google.firebase.auth.a) b10;
                hashMap2.put("email", aVar.a());
                hashMap2.put("previousEmail", aVar.b());
            }
            hashMap.put("data", hashMap2);
            return hashMap;
        } else {
            hashMap2.put("email", null);
        }
        hashMap2.put("previousEmail", null);
        hashMap.put("data", hashMap2);
        return hashMap;
    }

    private com.google.firebase.auth.a0 p0(Map<String, Object> map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        return FirebaseAuth.getInstance(w5.f.p((String) obj)).m();
    }

    private Map<String, Object> p1(com.google.firebase.auth.g gVar) {
        if (gVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isNewUser", Boolean.valueOf(gVar.v()));
        hashMap.put("profile", gVar.i());
        hashMap.put("providerId", gVar.g());
        hashMap.put("username", gVar.t());
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> q0(Exception exc) {
        Map<String, Object> hashMap;
        HashMap hashMap2 = new HashMap();
        if (exc == null) {
            return hashMap2;
        }
        u0 u0Var = null;
        if (exc instanceof com.google.firebase.auth.q) {
            u0Var = new u0(exc, exc.getCause());
        } else if (exc.getCause() != null && (exc.getCause() instanceof com.google.firebase.auth.q)) {
            u0Var = new u0((com.google.firebase.auth.q) exc.getCause(), exc.getCause().getCause() != null ? exc.getCause().getCause() : exc.getCause());
        } else if (exc instanceof u0) {
            u0Var = (u0) exc;
        }
        if (u0Var != null) {
            hashMap2.put("code", u0Var.c());
            hashMap2.put("message", u0Var.getMessage());
            hashMap = u0Var.b();
        } else if ((exc instanceof w5.m) || (exc.getCause() != null && (exc.getCause() instanceof w5.m))) {
            hashMap2.put("code", "network-request-failed");
            hashMap2.put("message", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.");
            hashMap = new HashMap<>();
        } else if ((exc instanceof w5.c) || (exc.getCause() != null && (exc.getCause() instanceof w5.c))) {
            hashMap2.put("code", "api-not-available");
            hashMap2.put("message", "The requested API is not available.");
            hashMap = new HashMap<>();
        } else if ((exc instanceof w5.o) || (exc.getCause() != null && (exc.getCause() instanceof w5.o))) {
            hashMap2.put("code", "too-many-requests");
            hashMap2.put("message", "We have blocked all requests from this device due to unusual activity. Try again later.");
            hashMap = new HashMap<>();
        } else if (exc.getMessage() == null || !exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return hashMap2;
        } else {
            hashMap2.put("code", "invalid-verification-id");
            hashMap2.put("message", "The verification ID used to create the phone auth credential is invalid.");
            hashMap = new HashMap<>();
        }
        hashMap2.put("additionalData", hashMap);
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> q1(com.google.firebase.auth.h hVar) {
        if (hVar == null) {
            return null;
        }
        int hashCode = hVar.hashCode();
        f19281q.put(Integer.valueOf(hashCode), hVar);
        HashMap hashMap = new HashMap();
        hashMap.put("providerId", hVar.B());
        hashMap.put("signInMethod", hVar.C());
        hashMap.put("token", Integer.valueOf(hashCode));
        if (hVar instanceof com.google.firebase.auth.m0) {
            hashMap.put("accessToken", ((com.google.firebase.auth.m0) hVar).E());
        }
        return hashMap;
    }

    private Task<Map<String, Object>> r0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.d0
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.C0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Map<String, Object> r1(com.google.firebase.auth.i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("additionalUserInfo", p1(iVar.A()));
        hashMap.put("authCredential", q1(iVar.h()));
        hashMap.put("user", s1(iVar.r()));
        return hashMap;
    }

    private void s0(Map<String, Object> map, TaskCompletionSource<Map<String, Object>> taskCompletionSource, Exception exc) {
        com.google.firebase.auth.u uVar = (com.google.firebase.auth.u) exc.getCause();
        HashMap hashMap = new HashMap();
        com.google.firebase.auth.k0 b10 = uVar.b();
        List<com.google.firebase.auth.j0> B = b10.B();
        com.google.firebase.auth.l0 C = b10.C();
        String uuid = UUID.randomUUID().toString();
        this.f19287o.put(uuid, C);
        String uuid2 = UUID.randomUUID().toString();
        this.f19288p.put(uuid2, b10);
        List<Map<String, Object>> m12 = m1(B);
        hashMap.put("appName", m0(map).l().q());
        hashMap.put("multiFactorHints", m12);
        hashMap.put("multiFactorSessionId", uuid);
        hashMap.put("multiFactorResolverId", uuid2);
        taskCompletionSource.setException(new u0(uVar.a(), uVar.getLocalizedMessage(), hashMap));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> s1(com.google.firebase.auth.a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("displayName", a0Var.x());
        hashMap.put("email", a0Var.s());
        hashMap.put("emailVerified", Boolean.valueOf(a0Var.f()));
        hashMap.put("isAnonymous", Boolean.valueOf(a0Var.H()));
        if (a0Var.D() != null) {
            hashMap2.put("creationTime", Long.valueOf(a0Var.D().o()));
            hashMap2.put("lastSignInTime", Long.valueOf(a0Var.D().y()));
        }
        hashMap.put("metadata", hashMap2);
        hashMap.put("phoneNumber", a0Var.j());
        hashMap.put("photoURL", t1(a0Var.c()));
        hashMap.put("providerData", w1(a0Var.F()));
        hashMap.put("refreshToken", "");
        hashMap.put("uid", a0Var.a());
        hashMap.put("tenantId", a0Var.G());
        return hashMap;
    }

    private void t0(r8.c cVar) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_auth", this);
        r8.k kVar = new r8.k(cVar, "plugins.flutter.io/firebase_auth");
        this.f19283k = kVar;
        kVar.e(this);
        c1.f(cVar, this);
        x0.c(cVar, this);
        this.f19282j = cVar;
    }

    private static String t1(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if ("".equals(uri2)) {
            return null;
        }
        return uri2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            Tasks.await(m02.g((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Map<String, Object> u1(com.google.firebase.auth.c0 c0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("authTimestamp", Long.valueOf(c0Var.a() * 1000));
        hashMap.put("claims", c0Var.b());
        hashMap.put("expirationTimestamp", Long.valueOf(c0Var.c() * 1000));
        hashMap.put("issuedAtTimestamp", Long.valueOf(c0Var.d() * 1000));
        hashMap.put("signInProvider", c0Var.e());
        hashMap.put("signInSecondFactor", c0Var.f());
        hashMap.put("token", c0Var.g());
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            taskCompletionSource.setResult(o1((com.google.firebase.auth.d) Tasks.await(m02.h((String) obj))));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private static Map<String, Object> v1(com.google.firebase.auth.y0 y0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("displayName", y0Var.x());
        hashMap.put("email", y0Var.s());
        hashMap.put("phoneNumber", y0Var.j());
        hashMap.put("photoURL", t1(y0Var.c()));
        hashMap.put("providerId", y0Var.g());
        hashMap.put("uid", y0Var.a());
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("code");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("newPassword");
            Objects.requireNonNull(obj2);
            Tasks.await(m02.i((String) obj, (String) obj2));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private static List<Map<String, Object>> w1(List<? extends com.google.firebase.auth.y0> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.y0 y0Var = (com.google.firebase.auth.y0) it.next();
            if (y0Var != null && !"firebase".equals(y0Var.g())) {
                arrayList.add(v1(y0Var));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAuth m02 = m0(map);
            Object obj = map.get("email");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("password");
            Objects.requireNonNull(obj2);
            taskCompletionSource.setResult(r1((com.google.firebase.auth.i) Tasks.await(m02.j((String) obj, (String) obj2))));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> x1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.g
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.H0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            com.google.firebase.auth.a0 p02 = p0(map);
            if (p02 == null) {
                taskCompletionSource.setException(u0.f());
                return;
            }
            Tasks.await(p02.B());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Object>> y1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.h
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.I0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(TaskCompletionSource taskCompletionSource) {
        try {
            C1();
            f19281q.clear();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<String> z1(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.j
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.J0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // r8.k.c
    public void I(r8.j jVar, final k.d dVar) {
        Task W1;
        String str = jVar.f16777a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2057012413:
                if (str.equals("User#verifyBeforeUpdateEmail")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1780708429:
                if (str.equals("Auth#signInWithEmailLink")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1752633812:
                if (str.equals("Auth#setLanguageCode")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1684941144:
                if (str.equals("User#reauthenticateUserWithCredential")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1644801898:
                if (str.equals("Auth#signOut")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1598142666:
                if (str.equals("User#updatePhoneNumber")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1568968164:
                if (str.equals("User#updatePassword")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1529680830:
                if (str.equals("Auth#sendSignInLinkToEmail")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1451942929:
                if (str.equals("User#linkWithCredential")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1351623174:
                if (str.equals("Auth#signInWithCredential")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1292431612:
                if (str.equals("Auth#fetchSignInMethodsForEmail")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -1230437447:
                if (str.equals("Auth#signInWithEmailAndPassword")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1027441723:
                if (str.equals("Auth#signInWithCustomToken")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -834572032:
                if (str.equals("User#getIdToken")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -695049397:
                if (str.equals("Auth#sendPasswordResetEmail")) {
                    c10 = 14;
                    break;
                }
                break;
            case -684675433:
                if (str.equals("User#sendEmailVerification")) {
                    c10 = 15;
                    break;
                }
                break;
            case -636251837:
                if (str.equals("User#delete")) {
                    c10 = 16;
                    break;
                }
                break;
            case -396665309:
                if (str.equals("Auth#verifyPhoneNumber")) {
                    c10 = 17;
                    break;
                }
                break;
            case -290623266:
                if (str.equals("Auth#createUserWithEmailAndPassword")) {
                    c10 = 18;
                    break;
                }
                break;
            case -235434703:
                if (str.equals("User#reload")) {
                    c10 = 19;
                    break;
                }
                break;
            case -141240917:
                if (str.equals("User#unlink")) {
                    c10 = 20;
                    break;
                }
                break;
            case -122200568:
                if (str.equals("User#updateProfile")) {
                    c10 = 21;
                    break;
                }
                break;
            case 116859805:
                if (str.equals("Auth#signInAnonymously")) {
                    c10 = 22;
                    break;
                }
                break;
            case 281593967:
                if (str.equals("Auth#confirmPasswordReset")) {
                    c10 = 23;
                    break;
                }
                break;
            case 415055753:
                if (str.equals("User#linkWithProvider")) {
                    c10 = 24;
                    break;
                }
                break;
            case 422677783:
                if (str.equals("User#reauthenticateWithProvider")) {
                    c10 = 25;
                    break;
                }
                break;
            case 506585151:
                if (str.equals("Auth#registerAuthStateListener")) {
                    c10 = 26;
                    break;
                }
                break;
            case 857654192:
                if (str.equals("Auth#checkActionCode")) {
                    c10 = 27;
                    break;
                }
                break;
            case 934812310:
                if (str.equals("Auth#applyActionCode")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1045882753:
                if (str.equals("Auth#useEmulator")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1241974868:
                if (str.equals("Auth#signInWithProvider")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1511616916:
                if (str.equals("Auth#registerIdTokenListener")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1852431466:
                if (str.equals("Auth#setSettings")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 1953611341:
                if (str.equals("Auth#verifyPasswordResetCode")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2139270075:
                if (str.equals("User#updateEmail")) {
                    c10 = '\"';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                W1 = W1((Map) jVar.b());
                break;
            case 1:
                W1 = M1((Map) jVar.b());
                break;
            case 2:
                W1 = G1((Map) jVar.b());
                break;
            case 3:
                W1 = x1((Map) jVar.b());
                break;
            case 4:
                W1 = O1((Map) jVar.b());
                break;
            case 5:
                W1 = T1((Map) jVar.b());
                break;
            case 6:
                W1 = S1((Map) jVar.b());
                break;
            case 7:
                W1 = F1((Map) jVar.b());
                break;
            case '\b':
                W1 = l1((Map) jVar.b());
                break;
            case '\t':
                W1 = J1((Map) jVar.b());
                break;
            case '\n':
                W1 = i0((Map) jVar.b());
                break;
            case 11:
                W1 = L1((Map) jVar.b());
                break;
            case '\f':
                W1 = K1((Map) jVar.b());
                break;
            case '\r':
                W1 = r0((Map) jVar.b());
                break;
            case 14:
                W1 = E1((Map) jVar.b());
                break;
            case 15:
                W1 = D1((Map) jVar.b());
                break;
            case 16:
                W1 = h0((Map) jVar.b());
                break;
            case 17:
                W1 = Y1((Map) jVar.b());
                break;
            case 18:
                W1 = g0((Map) jVar.b());
                break;
            case 19:
                W1 = B1((Map) jVar.b());
                break;
            case 20:
                W1 = Q1((Map) jVar.b());
                break;
            case 21:
                W1 = U1((Map) jVar.b());
                break;
            case 22:
                W1 = I1((Map) jVar.b());
                break;
            case f.j.f8330t3 /* 23 */:
                W1 = f0((Map) jVar.b());
                break;
            case f.j.f8335u3 /* 24 */:
                W1 = P1((Map) jVar.b());
                break;
            case 25:
                W1 = y1((Map) jVar.b());
                break;
            case 26:
                W1 = z1((Map) jVar.b());
                break;
            case 27:
                W1 = e0((Map) jVar.b());
                break;
            case 28:
                W1 = d0((Map) jVar.b());
                break;
            case f.j.f8360z3 /* 29 */:
                W1 = V1((Map) jVar.b());
                break;
            case 30:
                W1 = N1((Map) jVar.b());
                break;
            case 31:
                W1 = A1((Map) jVar.b());
                break;
            case ' ':
                W1 = H1((Map) jVar.b());
                break;
            case '!':
                W1 = X1((Map) jVar.b());
                break;
            case '\"':
                W1 = R1((Map) jVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        W1.addOnCompleteListener(new OnCompleteListener() { // from class: u8.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                t0.G0(k.d.this, task);
            }
        });
    }

    @Override // u8.v0.b
    public void a(String str, v0.h hVar, final v0.i<Map<String, Object>> iVar) {
        this.f19288p.get(str).D(com.google.firebase.auth.s0.a(com.google.firebase.auth.q0.a(hVar.c(), hVar.b()))).addOnCompleteListener(new OnCompleteListener() { // from class: u8.n
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                t0.this.M0(iVar, task);
            }
        });
    }

    @Override // u8.v0.d
    public void b(String str, v0.h hVar, String str2, final v0.i<Void> iVar) {
        try {
            l0(str).a(com.google.firebase.auth.s0.a(com.google.firebase.auth.q0.a(hVar.c(), hVar.b())), str2).addOnCompleteListener(new OnCompleteListener() { // from class: u8.n0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    t0.A0(v0.i.this, task);
                }
            });
        } catch (u6.a e10) {
            iVar.b(e10);
        }
    }

    @Override // u8.v0.d
    public void c(String str, final v0.i<v0.g> iVar) {
        try {
            l0(str).c().addOnCompleteListener(new OnCompleteListener() { // from class: u8.y
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    t0.this.E0(iVar, task);
                }
            });
        } catch (u6.a e10) {
            iVar.b(e10);
        }
    }

    @Override // i8.a
    public void d(a.b bVar) {
        this.f19283k.e(null);
        this.f19283k = null;
        this.f19282j = null;
        c1.f(bVar.b(), null);
        x0.c(bVar.b(), null);
        C1();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.f
            @Override // java.lang.Runnable
            public final void run() {
                t0.this.z0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // j8.a
    public void e(j8.c cVar) {
        this.f19284l = cVar.d();
    }

    @Override // j8.a
    public void f(j8.c cVar) {
        this.f19284l = cVar.d();
    }

    @Override // j8.a
    public void g() {
        this.f19284l = null;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(final w5.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: u8.l0
            @Override // java.lang.Runnable
            public final void run() {
                t0.D0(w5.f.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // u8.v0.d
    public void h(String str, String str2, final v0.i<Void> iVar) {
        try {
            l0(str).d(str2).addOnCompleteListener(new OnCompleteListener() { // from class: u8.j0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    t0.a1(v0.i.this, task);
                }
            });
        } catch (u6.a e10) {
            iVar.b(e10);
        }
    }

    @Override // u8.v0.d
    public void i(String str, v0.i<List<v0.f>> iVar) {
        try {
            iVar.a(n1(l0(str).b()));
        } catch (u6.a e10) {
            iVar.b(e10);
        }
    }

    @Override // j8.a
    public void j() {
        this.f19284l = null;
    }

    @Override // i8.a
    public void m(a.b bVar) {
        t0(bVar.b());
    }
}
