package y8;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.storage.k;
import i8.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import r8.k;
/* loaded from: classes.dex */
public class t implements FlutterFirebasePlugin, k.c, i8.a {

    /* renamed from: j  reason: collision with root package name */
    private r8.k f20611j;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(k.d dVar, Task task) {
        if (task.isSuccessful()) {
            dVar.a(task.getResult());
            return;
        }
        Exception exception = task.getException();
        dVar.b("firebase_storage", exception != null ? exception.getMessage() : null, u(exception));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(w(map).i());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Map map, TaskCompletionSource taskCompletionSource) {
        Object obj = map.get("maxSize");
        Objects.requireNonNull(obj);
        Integer num = (Integer) obj;
        try {
            taskCompletionSource.setResult((byte[]) Tasks.await(w(map).n(num.intValue())));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("downloadURL", ((Uri) Tasks.await(w(map).o())).toString());
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(U((com.google.firebase.storage.k) Tasks.await(w(map).q())));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Map map, TaskCompletionSource taskCompletionSource) {
        Task<com.google.firebase.storage.h> x10;
        com.google.firebase.storage.l w10 = w(map);
        Object obj = map.get("options");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("maxResults");
        Objects.requireNonNull(obj2);
        int intValue = ((Integer) obj2).intValue();
        if (map2.get("pageToken") != null) {
            Object obj3 = map2.get("pageToken");
            Objects.requireNonNull(obj3);
            x10 = w10.y(intValue, (String) obj3);
        } else {
            x10 = w10.x(intValue);
        }
        try {
            taskCompletionSource.setResult(S((com.google.firebase.storage.h) Tasks.await(x10)));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(S((com.google.firebase.storage.h) Tasks.await(w(map).z())));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(Map map, TaskCompletionSource taskCompletionSource) {
        com.google.firebase.storage.l w10 = w(map);
        Object obj = map.get("metadata");
        Objects.requireNonNull(obj);
        try {
            taskCompletionSource.setResult(U((com.google.firebase.storage.k) Tasks.await(w10.F(T((Map) obj)))));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(Map map, TaskCompletionSource taskCompletionSource) {
        Object obj = map.get("handle");
        Objects.requireNonNull(obj);
        h0 r10 = h0.r(((Integer) obj).intValue());
        if (r10 == null) {
            taskCompletionSource.setException(new Exception("Cancel operation was called on a task which does not exist."));
            return;
        }
        try {
            boolean booleanValue = ((Boolean) Tasks.await(r10.n())).booleanValue();
            HashMap hashMap = new HashMap();
            hashMap.put("status", Boolean.valueOf(booleanValue));
            if (booleanValue) {
                hashMap.put("snapshot", h0.I(r10.s()));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(Map map, TaskCompletionSource taskCompletionSource) {
        Object obj = map.get("handle");
        Objects.requireNonNull(obj);
        h0 r10 = h0.r(((Integer) obj).intValue());
        if (r10 == null) {
            taskCompletionSource.setException(new Exception("Pause operation was called on a task which does not exist."));
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            boolean booleanValue = ((Boolean) Tasks.await(r10.K())).booleanValue();
            hashMap.put("status", Boolean.valueOf(booleanValue));
            if (booleanValue) {
                hashMap.put("snapshot", h0.I(r10.s()));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Map map, TaskCompletionSource taskCompletionSource) {
        com.google.firebase.storage.l w10 = w(map);
        Object obj = map.get("data");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("handle");
        Objects.requireNonNull(obj2);
        try {
            h0.N(((Integer) obj2).intValue(), w10, (byte[]) obj, T((Map) map.get("metadata"))).M(this.f20611j);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Map map, TaskCompletionSource taskCompletionSource) {
        com.google.firebase.storage.l w10 = w(map);
        Object obj = map.get("filePath");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("handle");
        Objects.requireNonNull(obj2);
        try {
            h0.O(((Integer) obj2).intValue(), w10, Uri.fromFile(new File((String) obj)), T((Map) map.get("metadata"))).M(this.f20611j);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(Map map, TaskCompletionSource taskCompletionSource) {
        com.google.firebase.storage.l w10 = w(map);
        Object obj = map.get("data");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("format");
        Objects.requireNonNull(obj2);
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = map.get("handle");
        Objects.requireNonNull(obj3);
        try {
            h0.N(((Integer) obj3).intValue(), w10, c0((String) obj, intValue), T((Map) map.get("metadata"))).M(this.f20611j);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(Map map, TaskCompletionSource taskCompletionSource) {
        Object obj = map.get("handle");
        Objects.requireNonNull(obj);
        h0 r10 = h0.r(((Integer) obj).intValue());
        if (r10 == null) {
            taskCompletionSource.setException(new Exception("Resume operation was called on a task which does not exist."));
            return;
        }
        try {
            boolean booleanValue = ((Boolean) Tasks.await(r10.L())).booleanValue();
            HashMap hashMap = new HashMap();
            hashMap.put("status", Boolean.valueOf(booleanValue));
            if (booleanValue) {
                hashMap.put("snapshot", h0.I(r10.s()));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(Map map, TaskCompletionSource taskCompletionSource) {
        com.google.firebase.storage.l w10 = w(map);
        Object obj = map.get("filePath");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("handle");
        Objects.requireNonNull(obj2);
        try {
            h0.q(((Integer) obj2).intValue(), w10, new File((String) obj)).M(this.f20611j);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(Map map, TaskCompletionSource taskCompletionSource) {
        com.google.firebase.storage.d x10 = x(map);
        Object obj = map.get("host");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("port");
        Objects.requireNonNull(obj2);
        x10.s((String) obj, ((Integer) obj2).intValue());
        taskCompletionSource.setResult(null);
    }

    private Map<String, Object> S(com.google.firebase.storage.h hVar) {
        HashMap hashMap = new HashMap();
        if (hVar.c() != null) {
            hashMap.put("nextPageToken", hVar.c());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.google.firebase.storage.l lVar : hVar.b()) {
            arrayList.add(lVar.t());
        }
        for (com.google.firebase.storage.l lVar2 : hVar.d()) {
            arrayList2.add(lVar2.t());
        }
        hashMap.put("items", arrayList);
        hashMap.put("prefixes", arrayList2);
        return hashMap;
    }

    private com.google.firebase.storage.k T(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        k.b bVar = new k.b();
        if (map.get("cacheControl") != null) {
            bVar.d((String) map.get("cacheControl"));
        }
        if (map.get("contentDisposition") != null) {
            bVar.e((String) map.get("contentDisposition"));
        }
        if (map.get("contentEncoding") != null) {
            bVar.f((String) map.get("contentEncoding"));
        }
        if (map.get("contentLanguage") != null) {
            bVar.g((String) map.get("contentLanguage"));
        }
        if (map.get("contentType") != null) {
            bVar.h((String) map.get("contentType"));
        }
        if (map.get("customMetadata") != null) {
            Object obj = map.get("customMetadata");
            Objects.requireNonNull(obj);
            Map map2 = (Map) obj;
            for (String str : map2.keySet()) {
                bVar.i(str, (String) map2.get(str));
            }
        }
        return bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> U(com.google.firebase.storage.k kVar) {
        String y10;
        if (kVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (kVar.D() != null) {
            hashMap.put("name", kVar.D());
        }
        if (kVar.r() != null) {
            hashMap.put("bucket", kVar.r());
        }
        if (kVar.A() != null) {
            hashMap.put("generation", kVar.A());
        }
        if (kVar.C() != null) {
            hashMap.put("metadataGeneration", kVar.C());
        }
        hashMap.put("fullPath", kVar.E());
        hashMap.put("size", Long.valueOf(kVar.F()));
        hashMap.put("creationTimeMillis", Long.valueOf(kVar.x()));
        hashMap.put("updatedTimeMillis", Long.valueOf(kVar.G()));
        if (kVar.B() != null) {
            hashMap.put("md5Hash", kVar.B());
        }
        if (kVar.s() != null) {
            hashMap.put("cacheControl", kVar.s());
        }
        if (kVar.t() != null) {
            hashMap.put("contentDisposition", kVar.t());
        }
        if (kVar.u() != null) {
            hashMap.put("contentEncoding", kVar.u());
        }
        if (kVar.v() != null) {
            hashMap.put("contentLanguage", kVar.v());
        }
        if (kVar.w() != null) {
            hashMap.put("contentType", kVar.w());
        }
        HashMap hashMap2 = new HashMap();
        for (String str : kVar.z()) {
            if (kVar.y(str) == null) {
                y10 = "";
            } else {
                y10 = kVar.y(str);
                Objects.requireNonNull(y10);
            }
            hashMap2.put(str, y10);
        }
        hashMap.put("customMetadata", hashMap2);
        return hashMap;
    }

    private Task<Void> V(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.d
            @Override // java.lang.Runnable
            public final void run() {
                t.this.C(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<byte[]> W(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.p
            @Override // java.lang.Runnable
            public final void run() {
                t.this.D(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> X(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.i
            @Override // java.lang.Runnable
            public final void run() {
                t.this.E(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> Y(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.h
            @Override // java.lang.Runnable
            public final void run() {
                t.this.F(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> Z(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.q
            @Override // java.lang.Runnable
            public final void run() {
                t.this.G(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> a0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.e
            @Override // java.lang.Runnable
            public final void run() {
                t.this.H(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> b0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.g
            @Override // java.lang.Runnable
            public final void run() {
                t.this.J(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private byte[] c0(String str, int i10) {
        int i11;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            return null;
        } else {
            i11 = 8;
        }
        return Base64.decode(str, i11);
    }

    private Task<Map<String, Object>> d0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.n
            @Override // java.lang.Runnable
            public final void run() {
                t.K(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> e0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.m
            @Override // java.lang.Runnable
            public final void run() {
                t.L(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> f0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.j
            @Override // java.lang.Runnable
            public final void run() {
                t.this.M(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> g0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.r
            @Override // java.lang.Runnable
            public final void run() {
                t.this.N(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> h0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.s
            @Override // java.lang.Runnable
            public final void run() {
                t.this.O(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> i0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.o
            @Override // java.lang.Runnable
            public final void run() {
                t.P(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> j0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.c
            @Override // java.lang.Runnable
            public final void run() {
                t.this.Q(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<Void> k0(final Map<String, Object> map) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.f
            @Override // java.lang.Runnable
            public final void run() {
                t.this.R(map, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> u(Exception exc) {
        a aVar;
        HashMap hashMap = new HashMap();
        if (exc instanceof com.google.firebase.storage.j) {
            aVar = new a(exc, exc.getCause());
        } else if (exc.getCause() == null || !(exc.getCause() instanceof com.google.firebase.storage.j)) {
            aVar = null;
        } else {
            com.google.firebase.storage.j jVar = (com.google.firebase.storage.j) exc.getCause();
            Throwable cause = exc.getCause().getCause();
            Throwable cause2 = exc.getCause();
            if (cause != null) {
                cause2 = cause2.getCause();
            }
            aVar = new a(jVar, cause2);
        }
        if (aVar != null) {
            hashMap.put("code", aVar.a());
            hashMap.put("message", aVar.getMessage());
        }
        return hashMap;
    }

    private Long v(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : 0L);
    }

    private com.google.firebase.storage.l w(Map<String, Object> map) {
        Object obj = map.get("path");
        Objects.requireNonNull(obj);
        return x(map).o((String) obj);
    }

    private com.google.firebase.storage.d x(Map<String, Object> map) {
        com.google.firebase.storage.d g10;
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        w5.f p10 = w5.f.p((String) obj);
        String str = (String) map.get("bucket");
        if (str == null) {
            g10 = com.google.firebase.storage.d.f(p10);
        } else {
            g10 = com.google.firebase.storage.d.g(p10, "gs://" + str);
        }
        Object obj2 = map.get("maxOperationRetryTime");
        if (obj2 != null) {
            g10.q(v(obj2).longValue());
        }
        Object obj3 = map.get("maxDownloadRetryTime");
        if (obj3 != null) {
            g10.p(v(obj3).longValue());
        }
        Object obj4 = map.get("maxUploadRetryTime");
        if (obj4 != null) {
            g10.r(v(obj4).longValue());
        }
        return g10;
    }

    private void y(r8.c cVar) {
        r8.k kVar = new r8.k(cVar, "plugins.flutter.io/firebase_storage");
        this.f20611j = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_storage", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(TaskCompletionSource taskCompletionSource) {
        h0.o();
        taskCompletionSource.setResult(null);
    }

    @Override // r8.k.c
    public void I(r8.j jVar, final k.d dVar) {
        Task h02;
        String str = jVar.f16777a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1816321956:
                if (str.equals("Task#startPutString")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1707714184:
                if (str.equals("Task#writeToFile")) {
                    c10 = 1;
                    break;
                }
                break;
            case -598660204:
                if (str.equals("Storage#useEmulator")) {
                    c10 = 2;
                    break;
                }
                break;
            case -487339152:
                if (str.equals("Reference#updateMetadata")) {
                    c10 = 3;
                    break;
                }
                break;
            case 524582600:
                if (str.equals("Reference#getData")) {
                    c10 = 4;
                    break;
                }
                break;
            case 762112515:
                if (str.equals("Reference#delete")) {
                    c10 = 5;
                    break;
                }
                break;
            case 782125771:
                if (str.equals("Reference#listAll")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1007699637:
                if (str.equals("Task#startPutData")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1007766663:
                if (str.equals("Task#startPutFile")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1337346806:
                if (str.equals("Reference#list")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1384794957:
                if (str.equals("Reference#getMetadata")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1521380120:
                if (str.equals("Task#cancel")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1536042729:
                if (str.equals("Reference#getDownloadURL")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1585110424:
                if (str.equals("Task#pause")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1954677963:
                if (str.equals("Task#resume")) {
                    c10 = 14;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                h02 = h0((Map) jVar.b());
                break;
            case 1:
                h02 = j0((Map) jVar.b());
                break;
            case 2:
                h02 = k0((Map) jVar.b());
                break;
            case 3:
                h02 = b0((Map) jVar.b());
                break;
            case 4:
                h02 = W((Map) jVar.b());
                break;
            case 5:
                h02 = V((Map) jVar.b());
                break;
            case 6:
                h02 = a0((Map) jVar.b());
                break;
            case 7:
                h02 = f0((Map) jVar.b());
                break;
            case '\b':
                h02 = g0((Map) jVar.b());
                break;
            case '\t':
                h02 = Z((Map) jVar.b());
                break;
            case '\n':
                h02 = Y((Map) jVar.b());
                break;
            case 11:
                h02 = d0((Map) jVar.b());
                break;
            case '\f':
                h02 = X((Map) jVar.b());
                break;
            case '\r':
                h02 = e0((Map) jVar.b());
                break;
            case 14:
                h02 = i0((Map) jVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        h02.addOnCompleteListener(new OnCompleteListener() { // from class: y8.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                t.B(k.d.this, task);
            }
        });
    }

    @Override // i8.a
    public void d(a.b bVar) {
        h0.o();
        this.f20611j.e(null);
        this.f20611j = null;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.k
            @Override // java.lang.Runnable
            public final void run() {
                t.z(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(w5.f fVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.l
            @Override // java.lang.Runnable
            public final void run() {
                t.A(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        y(bVar.b());
    }
}
