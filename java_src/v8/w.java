package v8;

import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.a1;
import com.google.firebase.firestore.d1;
import com.google.firebase.firestore.n;
import com.google.firebase.firestore.u0;
import com.google.firebase.firestore.w0;
import com.google.firebase.firestore.y0;
import i8.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import r8.d;
import r8.k;
import w8.o;
/* loaded from: classes.dex */
public class w implements FlutterFirebasePlugin, k.c, i8.a, j8.a {

    /* renamed from: r  reason: collision with root package name */
    protected static final HashMap<String, FirebaseFirestore> f19513r = new HashMap<>();

    /* renamed from: s  reason: collision with root package name */
    public static final Map<Integer, n.a> f19514s = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private r8.c f19516k;

    /* renamed from: l  reason: collision with root package name */
    private r8.k f19517l;

    /* renamed from: j  reason: collision with root package name */
    final r8.s f19515j = new r8.s(b.f19468d);

    /* renamed from: m  reason: collision with root package name */
    private final AtomicReference<Activity> f19518m = new AtomicReference<>(null);

    /* renamed from: n  reason: collision with root package name */
    private final Map<String, d1> f19519n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private final Map<String, r8.d> f19520o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private final Map<String, d.InterfaceC0247d> f19521p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    private final Map<String, w8.f> f19522q = new HashMap();

    private Task<Map<String, Object>> A(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.g
            @Override // java.lang.Runnable
            public final void run() {
                w.Q(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private void B(j8.c cVar) {
        this.f19518m.set(cVar.d());
    }

    private Task<Void> C(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.p
            @Override // java.lang.Runnable
            public final void run() {
                w.R(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> D(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.o
            @Override // java.lang.Runnable
            public final void run() {
                w.S(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static void E(String str) {
        HashMap<String, FirebaseFirestore> hashMap = f19513r;
        synchronized (hashMap) {
            if (hashMap.get(str) != null) {
                hashMap.remove(str);
            }
        }
    }

    private void F() {
        this.f19518m.set(null);
    }

    private Task<Void> G(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.u
            @Override // java.lang.Runnable
            public final void run() {
                w.U(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> H(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.r
            @Override // java.lang.Runnable
            public final void run() {
                w.V(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<com.google.firebase.firestore.n> J(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.i
            @Override // java.lang.Runnable
            public final void run() {
                w.this.W(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> K(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.f
            @Override // java.lang.Runnable
            public final void run() {
                w.X(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> L(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.q
            @Override // java.lang.Runnable
            public final void run() {
                w.Y(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> M(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.s
            @Override // java.lang.Runnable
            public final void run() {
                w.Z(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static FirebaseFirestore N(String str) {
        FirebaseFirestore firebaseFirestore;
        HashMap<String, FirebaseFirestore> hashMap = f19513r;
        synchronized (hashMap) {
            firebaseFirestore = hashMap.get(str);
        }
        return firebaseFirestore;
    }

    private a1 O(Map<String, Object> map) {
        Object obj = map.get("source");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        return !str.equals("server") ? !str.equals("cache") ? a1.DEFAULT : a1.CACHE : a1.SERVER;
    }

    private void P(r8.c cVar) {
        this.f19516k = cVar;
        r8.k kVar = new r8.k(cVar, "plugins.flutter.io/firebase_firestore", this.f19515j);
        this.f19517l = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_firestore", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("query");
            Objects.requireNonNull(obj);
            HashMap hashMap = new HashMap();
            hashMap.put("count", Long.valueOf(((com.google.firebase.firestore.d) Tasks.await(((u0) obj).i().b(com.google.firebase.firestore.e.SERVER))).c()));
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
        if (r8 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r8 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        r4 = r4.get("options");
        java.util.Objects.requireNonNull(r4);
        r4 = (java.util.Map) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (r4.get("merge") == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        if (((java.lang.Boolean) r4.get("merge")).booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
        java.util.Objects.requireNonNull(r7);
        r4 = com.google.firebase.firestore.y0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
        r3 = r3.d(r6, r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
        if (r4.get("mergeFields") == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        r4 = r4.get("mergeFields");
        java.util.Objects.requireNonNull(r4);
        java.util.Objects.requireNonNull(r7);
        r4 = com.google.firebase.firestore.y0.d((java.util.List) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
        java.util.Objects.requireNonNull(r7);
        r3 = r3.c(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
        java.util.Objects.requireNonNull(r7);
        r3 = r3.f(r6, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void R(java.util.Map r13, com.google.android.gms.tasks.TaskCompletionSource r14) {
        /*
            java.lang.String r0 = "mergeFields"
            java.lang.String r1 = "merge"
            java.lang.String r2 = "writes"
            java.lang.Object r2 = r13.get(r2)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> Lf2
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> Lf2
            java.lang.String r3 = "firestore"
            java.lang.Object r13 = r13.get(r3)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r13)     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.FirebaseFirestore r13 = (com.google.firebase.firestore.FirebaseFirestore) r13     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.h1 r3 = r13.j()     // Catch: java.lang.Exception -> Lf2
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Lf2
        L22:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> Lf2
            if (r4 == 0) goto Le6
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> Lf2
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> Lf2
            java.lang.String r5 = "type"
            java.lang.Object r5 = r4.get(r5)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = "path"
            java.lang.Object r6 = r4.get(r6)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lf2
            java.lang.String r7 = "data"
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.Exception -> Lf2
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.m r6 = r13.o(r6)     // Catch: java.lang.Exception -> Lf2
            r8 = -1
            int r9 = r5.hashCode()     // Catch: java.lang.Exception -> Lf2
            r10 = -1785516855(0xffffffff95932cc9, float:-5.9443486E-26)
            r11 = 2
            r12 = 1
            if (r9 == r10) goto L7b
            r10 = 81986(0x14042, float:1.14887E-40)
            if (r9 == r10) goto L71
            r10 = 2012838315(0x77f979ab, float:1.0119919E34)
            if (r9 == r10) goto L67
            goto L84
        L67:
            java.lang.String r9 = "DELETE"
            boolean r5 = r5.equals(r9)     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto L84
            r8 = 0
            goto L84
        L71:
            java.lang.String r9 = "SET"
            boolean r5 = r5.equals(r9)     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto L84
            r8 = 2
            goto L84
        L7b:
            java.lang.String r9 = "UPDATE"
            boolean r5 = r5.equals(r9)     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto L84
            r8 = 1
        L84:
            if (r8 == 0) goto Le0
            if (r8 == r12) goto Ld5
            if (r8 == r11) goto L8b
            goto L22
        L8b:
            java.lang.String r5 = "options"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Exception -> Lf2
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> Lf2
            java.lang.Object r5 = r4.get(r1)     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto Lb5
            java.lang.Object r5 = r4.get(r1)     // Catch: java.lang.Exception -> Lf2
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> Lf2
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto Lb5
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.y0 r4 = com.google.firebase.firestore.y0.c()     // Catch: java.lang.Exception -> Lf2
        Laf:
            com.google.firebase.firestore.h1 r3 = r3.d(r6, r7, r4)     // Catch: java.lang.Exception -> Lf2
            goto L22
        Lb5:
            java.lang.Object r5 = r4.get(r0)     // Catch: java.lang.Exception -> Lf2
            if (r5 == 0) goto Lcc
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Exception -> Lf2
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Exception -> Lf2
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.y0 r4 = com.google.firebase.firestore.y0.d(r4)     // Catch: java.lang.Exception -> Lf2
            goto Laf
        Lcc:
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.h1 r3 = r3.c(r6, r7)     // Catch: java.lang.Exception -> Lf2
            goto L22
        Ld5:
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Exception -> Lf2
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> Lf2
            com.google.firebase.firestore.h1 r3 = r3.f(r6, r7)     // Catch: java.lang.Exception -> Lf2
            goto L22
        Le0:
            com.google.firebase.firestore.h1 r3 = r3.b(r6)     // Catch: java.lang.Exception -> Lf2
            goto L22
        Le6:
            com.google.android.gms.tasks.Task r13 = r3.a()     // Catch: java.lang.Exception -> Lf2
            com.google.android.gms.tasks.Tasks.await(r13)     // Catch: java.lang.Exception -> Lf2
            r13 = 0
            r14.setResult(r13)     // Catch: java.lang.Exception -> Lf2
            goto Lf6
        Lf2:
            r13 = move-exception
            r14.setException(r13)
        Lf6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.w.R(java.util.Map, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            taskCompletionSource.setResult((Void) Tasks.await(((FirebaseFirestore) obj).k()));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(TaskCompletionSource taskCompletionSource) {
        try {
            for (w5.f fVar : w5.f.n(null)) {
                Tasks.await(FirebaseFirestore.u(fVar).N());
                E(fVar.q());
            }
            o0();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            Tasks.await(((FirebaseFirestore) obj).n());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            taskCompletionSource.setResult((Void) Tasks.await(((com.google.firebase.firestore.m) obj).h()));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            a1 O = O(map);
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            com.google.firebase.firestore.n nVar = (com.google.firebase.firestore.n) Tasks.await(((com.google.firebase.firestore.m) obj).j(O));
            p0(map, nVar.hashCode());
            taskCompletionSource.setResult(nVar);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X(Map map, TaskCompletionSource taskCompletionSource) {
        Task<Void> s10;
        y0 d10;
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            com.google.firebase.firestore.m mVar = (com.google.firebase.firestore.m) obj;
            Object obj2 = map.get("data");
            Objects.requireNonNull(obj2);
            Map map2 = (Map) obj2;
            Object obj3 = map.get("options");
            Objects.requireNonNull(obj3);
            Map map3 = (Map) obj3;
            if (map3.get("merge") != null && ((Boolean) map3.get("merge")).booleanValue()) {
                d10 = y0.c();
            } else if (map3.get("mergeFields") == null) {
                s10 = mVar.s(map2);
                taskCompletionSource.setResult((Void) Tasks.await(s10));
            } else {
                Object obj4 = map3.get("mergeFields");
                Objects.requireNonNull(obj4);
                d10 = y0.d((List) obj4);
            }
            s10 = mVar.t(map2, d10);
            taskCompletionSource.setResult((Void) Tasks.await(s10));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            com.google.firebase.firestore.m mVar = (com.google.firebase.firestore.m) obj;
            Object obj2 = map.get("data");
            Objects.requireNonNull(obj2);
            Map map2 = (Map) obj2;
            com.google.firebase.firestore.q qVar = (com.google.firebase.firestore.q) map2.keySet().iterator().next();
            Object obj3 = map2.get(qVar);
            ArrayList arrayList = new ArrayList();
            for (com.google.firebase.firestore.q qVar2 : map2.keySet()) {
                if (!qVar2.equals(qVar)) {
                    arrayList.add(qVar2);
                    arrayList.add(map2.get(qVar2));
                }
            }
            taskCompletionSource.setResult((Void) Tasks.await(mVar.u(qVar, obj3, arrayList.toArray())));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            Tasks.await(((FirebaseFirestore) obj).p());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            a1 O = O(map);
            Object obj = map.get("name");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("firestore");
            Objects.requireNonNull(obj2);
            u0 u0Var = (u0) Tasks.await(((FirebaseFirestore) obj2).w((String) obj));
            if (u0Var == null) {
                taskCompletionSource.setException(new NullPointerException("Named query has not been found. Please check it has been loaded properly via loadBundle()."));
                return;
            }
            w0 w0Var = (w0) Tasks.await(u0Var.m(O));
            p0(map, w0Var.hashCode());
            taskCompletionSource.setResult(w0Var);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(String str, d1 d1Var) {
        this.f19519n.put(str, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d0(k.d dVar, Task task) {
        if (task.isSuccessful()) {
            dVar.a(task.getResult());
            return;
        }
        Exception exception = task.getException();
        dVar.b("firebase_firestore", exception != null ? exception.getMessage() : null, x8.a.a(exception));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            a1 O = O(map);
            u0 u0Var = (u0) map.get("query");
            if (u0Var == null) {
                taskCompletionSource.setException(new IllegalArgumentException("An error occurred while parsing query arguments, see native logs for more information. Please report this issue."));
                return;
            }
            w0 w0Var = (w0) Tasks.await(u0Var.m(O));
            p0(map, w0Var.hashCode());
            taskCompletionSource.setResult(w0Var);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("indexConfiguration");
            Objects.requireNonNull(obj2);
            Tasks.await(((FirebaseFirestore) obj).L((String) obj2));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            FirebaseFirestore.M(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
            Tasks.await(firebaseFirestore.N());
            E(firebaseFirestore.r().q());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("reference");
            Objects.requireNonNull(obj);
            com.google.firebase.firestore.m mVar = (com.google.firebase.firestore.m) obj;
            Object obj2 = map.get("transactionId");
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            d1 d1Var = this.f19519n.get(str);
            if (d1Var != null) {
                taskCompletionSource.setResult(d1Var.c(mVar));
                return;
            }
            taskCompletionSource.setException(new Exception("Transaction.getDocument(): No transaction handler exists for ID: " + str));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            taskCompletionSource.setResult((Void) Tasks.await(((FirebaseFirestore) obj).P()));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<w0> k0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.l
            @Override // java.lang.Runnable
            public final void run() {
                w.this.b0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<w0> l0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.j
            @Override // java.lang.Runnable
            public final void run() {
                w.this.e0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private String m0(String str, String str2, d.InterfaceC0247d interfaceC0247d) {
        r8.d dVar = new r8.d(this.f19516k, str + "/" + str2, this.f19515j);
        dVar.d(interfaceC0247d);
        this.f19520o.put(str2, dVar);
        this.f19521p.put(str2, interfaceC0247d);
        return str2;
    }

    private String n0(String str, d.InterfaceC0247d interfaceC0247d) {
        return m0(str, UUID.randomUUID().toString().toLowerCase(Locale.US), interfaceC0247d);
    }

    private void o0() {
        for (String str : this.f19520o.keySet()) {
            this.f19520o.get(str).d(null);
        }
        this.f19520o.clear();
        for (String str2 : this.f19521p.keySet()) {
            this.f19521p.get(str2).c(null);
        }
        this.f19521p.clear();
        this.f19522q.clear();
    }

    private void p0(Map<String, Object> map, int i10) {
        f19514s.put(Integer.valueOf(i10), x8.b.a((String) map.get("serverTimestampBehavior")));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void q0(FirebaseFirestore firebaseFirestore, String str) {
        HashMap<String, FirebaseFirestore> hashMap = f19513r;
        synchronized (hashMap) {
            if (hashMap.get(str) == null) {
                hashMap.put(str, firebaseFirestore);
            }
        }
    }

    private Task<Void> r0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.v
            @Override // java.lang.Runnable
            public final void run() {
                w.f0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> s0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.d
            @Override // java.lang.Runnable
            public final void run() {
                w.g0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> t0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.t
            @Override // java.lang.Runnable
            public final void run() {
                w.h0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<com.google.firebase.firestore.n> u0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.k
            @Override // java.lang.Runnable
            public final void run() {
                w.this.i0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private void v0(Map<String, Object> map) {
        Object obj = map.get("transactionId");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("result");
        Objects.requireNonNull(obj2);
        this.f19522q.get((String) obj).a((Map) obj2);
    }

    private Task<Void> w0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.e
            @Override // java.lang.Runnable
            public final void run() {
                w.j0(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // r8.k.c
    public void I(r8.j jVar, final k.d dVar) {
        Task k02;
        String str = jVar.f16777a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2105138801:
                if (str.equals("Firestore#namedQueryGet")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1414526391:
                if (str.equals("SnapshotsInSync#setup")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1345933986:
                if (str.equals("Firestore#disableNetwork")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1269951812:
                if (str.equals("DocumentReference#snapshots")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1237005313:
                if (str.equals("WriteBatch#commit")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1205229031:
                if (str.equals("Transaction#storeResult")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1011812948:
                if (str.equals("Firestore#setLoggingEnabled")) {
                    c10 = 6;
                    break;
                }
                break;
            case -787001759:
                if (str.equals("Transaction#create")) {
                    c10 = 7;
                    break;
                }
                break;
            case -780009068:
                if (str.equals("LoadBundle#snapshots")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -658486978:
                if (str.equals("DocumentReference#delete")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -231135191:
                if (str.equals("Firestore#terminate")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -161874852:
                if (str.equals("DocumentReference#update")) {
                    c10 = 11;
                    break;
                }
                break;
            case 33139875:
                if (str.equals("DocumentReference#get")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 33151407:
                if (str.equals("DocumentReference#set")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 68800788:
                if (str.equals("Query#snapshots")) {
                    c10 = 14;
                    break;
                }
                break;
            case 195628283:
                if (str.equals("Query#get")) {
                    c10 = 15;
                    break;
                }
                break;
            case 264528913:
                if (str.equals("Transaction#get")) {
                    c10 = 16;
                    break;
                }
                break;
            case 406828874:
                if (str.equals("Firestore#clearPersistence")) {
                    c10 = 17;
                    break;
                }
                break;
            case 515912559:
                if (str.equals("Firestore#waitForPendingWrites")) {
                    c10 = 18;
                    break;
                }
                break;
            case 783577717:
                if (str.equals("AggregateQuery#count")) {
                    c10 = 19;
                    break;
                }
                break;
            case 915784462:
                if (str.equals("Firestore#setIndexConfiguration")) {
                    c10 = 20;
                    break;
                }
                break;
            case 1562339571:
                if (str.equals("Firestore#enableNetwork")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                k02 = k0((Map) jVar.b());
                break;
            case 1:
                dVar.a(n0("plugins.flutter.io/firebase_firestore/snapshotsInSync", new w8.j()));
                return;
            case 2:
                k02 = G((Map) jVar.b());
                break;
            case 3:
                dVar.a(n0("plugins.flutter.io/firebase_firestore/document", new w8.b()));
                return;
            case 4:
                k02 = C((Map) jVar.b());
                break;
            case 5:
                v0((Map) jVar.b());
                dVar.a(null);
                return;
            case 6:
                k02 = s0((Map) jVar.b());
                break;
            case 7:
                final String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                w8.o oVar = new w8.o(new o.a() { // from class: v8.m
                    @Override // w8.o.a
                    public final void a(d1 d1Var) {
                        w.this.c0(lowerCase, d1Var);
                    }
                });
                m0("plugins.flutter.io/firebase_firestore/transaction", lowerCase, oVar);
                this.f19522q.put(lowerCase, oVar);
                dVar.a(lowerCase);
                return;
            case '\b':
                dVar.a(n0("plugins.flutter.io/firebase_firestore/loadBundle", new w8.e()));
                return;
            case '\t':
                k02 = H((Map) jVar.b());
                break;
            case '\n':
                k02 = t0((Map) jVar.b());
                break;
            case 11:
                k02 = L((Map) jVar.b());
                break;
            case '\f':
                k02 = J((Map) jVar.b());
                break;
            case '\r':
                k02 = K((Map) jVar.b());
                break;
            case 14:
                dVar.a(n0("plugins.flutter.io/firebase_firestore/query", new w8.h()));
                return;
            case 15:
                k02 = l0((Map) jVar.b());
                break;
            case 16:
                k02 = u0((Map) jVar.b());
                break;
            case 17:
                k02 = D((Map) jVar.b());
                break;
            case 18:
                k02 = w0((Map) jVar.b());
                break;
            case 19:
                k02 = A((Map) jVar.b());
                break;
            case 20:
                k02 = r0((Map) jVar.b());
                break;
            case 21:
                k02 = M((Map) jVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        k02.addOnCompleteListener(new OnCompleteListener() { // from class: v8.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                w.d0(k.d.this, task);
            }
        });
    }

    @Override // i8.a
    public void d(a.b bVar) {
        this.f19517l.e(null);
        this.f19517l = null;
        o0();
        this.f19516k = null;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.h
            @Override // java.lang.Runnable
            public final void run() {
                w.this.T(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // j8.a
    public void e(j8.c cVar) {
        B(cVar);
    }

    @Override // j8.a
    public void f(j8.c cVar) {
        B(cVar);
    }

    @Override // j8.a
    public void g() {
        F();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(w5.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: v8.n
            @Override // java.lang.Runnable
            public final void run() {
                w.a0(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // j8.a
    public void j() {
        F();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        P(bVar.b());
    }
}
