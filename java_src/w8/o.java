package w8;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.d1;
import com.google.firebase.firestore.e1;
import com.google.firebase.firestore.y0;
import com.google.firebase.firestore.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import r8.d;
import v8.x;
/* loaded from: classes.dex */
public class o implements f, d.InterfaceC0247d {

    /* renamed from: a  reason: collision with root package name */
    final a f20060a;

    /* renamed from: b  reason: collision with root package name */
    final Semaphore f20061b = new Semaphore(0);

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Object> f20062c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Handler f20063d = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface a {
        void a(d1 d1Var);
    }

    public o(a aVar) {
        this.f20060a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x i(FirebaseFirestore firebaseFirestore, final d.b bVar, Long l10, d1 d1Var) {
        this.f20060a.a(d1Var);
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", firebaseFirestore.r().q());
        this.f20063d.post(new Runnable() { // from class: w8.n
            @Override // java.lang.Runnable
            public final void run() {
                d.b.this.a(hashMap);
            }
        });
        try {
            if (this.f20061b.tryAcquire(l10.longValue(), TimeUnit.MILLISECONDS)) {
                if (!this.f20062c.isEmpty() && !"ERROR".equalsIgnoreCase((String) this.f20062c.get("type"))) {
                    for (Map map : (List) this.f20062c.get("commands")) {
                        Object obj = map.get("type");
                        Objects.requireNonNull(obj);
                        String str = (String) obj;
                        Object obj2 = map.get("path");
                        Objects.requireNonNull(obj2);
                        com.google.firebase.firestore.m o10 = firebaseFirestore.o((String) obj2);
                        Map<String, Object> map2 = (Map) map.get("data");
                        char c10 = 65535;
                        switch (str.hashCode()) {
                            case -1785516855:
                                if (str.equals("UPDATE")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 81986:
                                if (str.equals("SET")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 2012838315:
                                if (str.equals("DELETE")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                                Objects.requireNonNull(map2);
                                d1Var.i(o10, map2);
                                break;
                            case 1:
                                Object obj3 = map.get("options");
                                Objects.requireNonNull(obj3);
                                Map map3 = (Map) obj3;
                                y0 y0Var = null;
                                if (map3.get("merge") != null && ((Boolean) map3.get("merge")).booleanValue()) {
                                    y0Var = y0.c();
                                } else if (map3.get("mergeFields") != null) {
                                    Object obj4 = map3.get("mergeFields");
                                    Objects.requireNonNull(obj4);
                                    y0Var = y0.d((List) obj4);
                                }
                                Objects.requireNonNull(map2);
                                if (y0Var == null) {
                                    d1Var.f(o10, map2);
                                    break;
                                } else {
                                    d1Var.g(o10, map2, y0Var);
                                    break;
                                }
                            case 2:
                                d1Var.b(o10);
                                break;
                        }
                    }
                    return x.a();
                }
                return x.a();
            }
            return x.b(new z("timed out", z.a.DEADLINE_EXCEEDED));
        } catch (InterruptedException unused) {
            return x.b(new z("interrupted", z.a.DEADLINE_EXCEEDED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(d.b bVar, HashMap hashMap) {
        bVar.a(hashMap);
        bVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(FirebaseFirestore firebaseFirestore, final d.b bVar, Task task) {
        Object a10;
        String str;
        final HashMap hashMap = new HashMap();
        if (task.getException() == null && ((x) task.getResult()).f19523a == null) {
            if (task.getResult() != null) {
                a10 = Boolean.TRUE;
                str = "complete";
            }
            this.f20063d.post(new Runnable() { // from class: w8.m
                @Override // java.lang.Runnable
                public final void run() {
                    o.j(d.b.this, hashMap);
                }
            });
        }
        Exception exception = task.getException() != null ? task.getException() : ((x) task.getResult()).f19523a;
        hashMap.put("appName", firebaseFirestore.r().q());
        a10 = x8.a.a(exception);
        str = "error";
        hashMap.put(str, a10);
        this.f20063d.post(new Runnable() { // from class: w8.m
            @Override // java.lang.Runnable
            public final void run() {
                o.j(d.b.this, hashMap);
            }
        });
    }

    @Override // w8.f
    public void a(Map<String, Object> map) {
        this.f20062c.putAll(map);
        this.f20061b.release();
    }

    @Override // r8.d.InterfaceC0247d
    public void b(Object obj, final d.b bVar) {
        final Long valueOf;
        Map map = (Map) obj;
        Object obj2 = map.get("firestore");
        Objects.requireNonNull(obj2);
        final FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj2;
        Object obj3 = map.get("timeout");
        if (obj3 instanceof Long) {
            valueOf = (Long) obj3;
        } else {
            valueOf = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : 5000L);
        }
        firebaseFirestore.I(new e1.b().b(((Integer) map.get("maxAttempts")).intValue()).a(), new d1.a() { // from class: w8.l
            @Override // com.google.firebase.firestore.d1.a
            public final Object a(d1 d1Var) {
                x i10;
                i10 = o.this.i(firebaseFirestore, bVar, valueOf, d1Var);
                return i10;
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: w8.k
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                o.this.k(firebaseFirestore, bVar, task);
            }
        });
    }

    @Override // r8.d.InterfaceC0247d
    public void c(Object obj) {
        this.f20061b.release();
    }
}
