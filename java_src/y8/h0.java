package y8;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.a0;
import com.google.firebase.storage.c;
import com.google.firebase.storage.s;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h0 {

    /* renamed from: l  reason: collision with root package name */
    static final SparseArray<h0> f20568l = new SparseArray<>();

    /* renamed from: m  reason: collision with root package name */
    private static final Executor f20569m = Executors.newSingleThreadExecutor();

    /* renamed from: a  reason: collision with root package name */
    private final a f20570a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20571b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.storage.l f20572c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f20573d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri f20574e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.storage.k f20575f;

    /* renamed from: j  reason: collision with root package name */
    private com.google.firebase.storage.s<?> f20579j;

    /* renamed from: g  reason: collision with root package name */
    private final Object f20576g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final Object f20577h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private final Object f20578i = new Object();

    /* renamed from: k  reason: collision with root package name */
    private Boolean f20580k = Boolean.FALSE;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum a {
        FILE,
        BYTES,
        DOWNLOAD
    }

    private h0(a aVar, int i10, com.google.firebase.storage.l lVar, byte[] bArr, Uri uri, com.google.firebase.storage.k kVar) {
        this.f20570a = aVar;
        this.f20571b = i10;
        this.f20572c = lVar;
        this.f20573d = bArr;
        this.f20574e = uri;
        this.f20575f = kVar;
        SparseArray<h0> sparseArray = f20568l;
        synchronized (sparseArray) {
            sparseArray.put(i10, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(r8.k kVar, s.a aVar) {
        kVar.c("Task#onProgress", t(aVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(final r8.k kVar, final s.a aVar) {
        if (this.f20580k.booleanValue()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: y8.f0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.A(kVar, aVar);
            }
        });
        synchronized (this.f20577h) {
            this.f20577h.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(r8.k kVar, s.a aVar) {
        kVar.c("Task#onPaused", t(aVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(final r8.k kVar, final s.a aVar) {
        if (this.f20580k.booleanValue()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: y8.e0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.C(kVar, aVar);
            }
        });
        synchronized (this.f20576g) {
            this.f20576g.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(r8.k kVar, s.a aVar) {
        kVar.c("Task#onSuccess", t(aVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(final r8.k kVar, final s.a aVar) {
        if (this.f20580k.booleanValue()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: y8.g0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.E(kVar, aVar);
            }
        });
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(r8.k kVar) {
        kVar.c("Task#onCanceled", t(null, null));
        p();
    }

    public static Map<String, Object> H(c.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", aVar.b().t());
        hashMap.put("bytesTransferred", Long.valueOf(aVar.c().isSuccessful() ? aVar.e() : aVar.d()));
        hashMap.put("totalBytes", Long.valueOf(aVar.e()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> I(Object obj) {
        return obj instanceof c.a ? H((c.a) obj) : J((a0.b) obj);
    }

    public static Map<String, Object> J(a0.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", bVar.b().t());
        hashMap.put("bytesTransferred", Long.valueOf(bVar.d()));
        hashMap.put("totalBytes", Long.valueOf(bVar.f()));
        if (bVar.e() != null) {
            hashMap.put("metadata", t.U(bVar.e()));
        }
        return hashMap;
    }

    public static h0 N(int i10, com.google.firebase.storage.l lVar, byte[] bArr, com.google.firebase.storage.k kVar) {
        return new h0(a.BYTES, i10, lVar, bArr, null, kVar);
    }

    public static h0 O(int i10, com.google.firebase.storage.l lVar, Uri uri, com.google.firebase.storage.k kVar) {
        return new h0(a.FILE, i10, lVar, null, uri, kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o() {
        synchronized (f20568l) {
            int i10 = 0;
            while (true) {
                SparseArray<h0> sparseArray = f20568l;
                if (i10 < sparseArray.size()) {
                    h0 valueAt = sparseArray.valueAt(i10);
                    if (valueAt != null) {
                        valueAt.p();
                    }
                    i10++;
                } else {
                    sparseArray.clear();
                }
            }
        }
    }

    public static h0 q(int i10, com.google.firebase.storage.l lVar, File file) {
        return new h0(a.DOWNLOAD, i10, lVar, null, Uri.fromFile(file), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h0 r(int i10) {
        h0 h0Var;
        SparseArray<h0> sparseArray = f20568l;
        synchronized (sparseArray) {
            h0Var = sparseArray.get(i10);
        }
        return h0Var;
    }

    private Map<String, Object> t(Object obj, Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("handle", Integer.valueOf(this.f20571b));
        hashMap.put("appName", this.f20572c.v().a().q());
        hashMap.put("bucket", this.f20572c.l());
        if (obj != null) {
            hashMap.put("snapshot", I(obj));
        }
        if (exc != null) {
            hashMap.put("error", t.u(exc));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(Boolean.valueOf(this.f20579j.w()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f20576g) {
            if (!this.f20579j.a0()) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            try {
                this.f20576g.wait();
                taskCompletionSource.setResult(Boolean.TRUE);
            } catch (InterruptedException unused) {
                taskCompletionSource.setResult(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f20577h) {
            if (!this.f20579j.d0()) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            try {
                this.f20577h.wait();
                taskCompletionSource.setResult(Boolean.TRUE);
            } catch (InterruptedException unused) {
                taskCompletionSource.setResult(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(final r8.k kVar) {
        if (this.f20580k.booleanValue()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: y8.d0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.G(kVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(r8.k kVar, Exception exc) {
        kVar.c("Task#onFailure", t(null, exc));
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(final r8.k kVar, final Exception exc) {
        if (this.f20580k.booleanValue()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: y8.v
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.y(kVar, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Boolean> K() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.b0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.v(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Boolean> L() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.a0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.w(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(final r8.k kVar) {
        Uri uri;
        com.google.firebase.storage.s<?> p10;
        Uri uri2;
        byte[] bArr;
        a aVar = this.f20570a;
        if (aVar == a.BYTES && (bArr = this.f20573d) != null) {
            com.google.firebase.storage.k kVar2 = this.f20575f;
            p10 = kVar2 == null ? this.f20572c.B(bArr) : this.f20572c.C(bArr, kVar2);
        } else if (aVar == a.FILE && (uri2 = this.f20574e) != null) {
            com.google.firebase.storage.k kVar3 = this.f20575f;
            p10 = kVar3 == null ? this.f20572c.D(uri2) : this.f20572c.E(uri2, kVar3);
        } else if (aVar != a.DOWNLOAD || (uri = this.f20574e) == null) {
            throw new Exception("Unable to start task. Some arguments have no been initialized.");
        } else {
            p10 = this.f20572c.p(uri);
        }
        this.f20579j = p10;
        com.google.firebase.storage.s<?> sVar = this.f20579j;
        Executor executor = f20569m;
        sVar.s(executor, new w6.d() { // from class: y8.x
            @Override // w6.d
            public final void a(Object obj) {
                h0.this.B(kVar, (s.a) obj);
            }
        });
        this.f20579j.r(executor, new w6.c() { // from class: y8.w
            @Override // w6.c
            public final void a(Object obj) {
                h0.this.D(kVar, (s.a) obj);
            }
        });
        this.f20579j.addOnSuccessListener(executor, new OnSuccessListener() { // from class: y8.z
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                h0.this.F(kVar, (s.a) obj);
            }
        });
        this.f20579j.addOnCanceledListener(executor, new OnCanceledListener() { // from class: y8.u
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                h0.this.x(kVar);
            }
        });
        this.f20579j.addOnFailureListener(executor, new OnFailureListener() { // from class: y8.y
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                h0.this.z(kVar, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Boolean> n() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: y8.c0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.u(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    void p() {
        this.f20580k = Boolean.TRUE;
        SparseArray<h0> sparseArray = f20568l;
        synchronized (sparseArray) {
            if (this.f20579j.K() || this.f20579j.L()) {
                this.f20579j.w();
            }
            sparseArray.remove(this.f20571b);
        }
        synchronized (this.f20578i) {
            this.f20578i.notifyAll();
        }
        synchronized (this.f20576g) {
            this.f20576g.notifyAll();
        }
        synchronized (this.f20577h) {
            this.f20577h.notifyAll();
        }
    }

    public Object s() {
        return this.f20579j.F();
    }
}
