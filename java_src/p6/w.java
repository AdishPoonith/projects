package p6;

import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.z;
import i9.g;
import i9.j1;
import i9.y0;
/* loaded from: classes.dex */
public class w {

    /* renamed from: g  reason: collision with root package name */
    private static final y0.g<String> f15698g;

    /* renamed from: h  reason: collision with root package name */
    private static final y0.g<String> f15699h;

    /* renamed from: i  reason: collision with root package name */
    private static final y0.g<String> f15700i;

    /* renamed from: j  reason: collision with root package name */
    private static volatile String f15701j;

    /* renamed from: a  reason: collision with root package name */
    private final q6.g f15702a;

    /* renamed from: b  reason: collision with root package name */
    private final h6.a<h6.j> f15703b;

    /* renamed from: c  reason: collision with root package name */
    private final h6.a<String> f15704c;

    /* renamed from: d  reason: collision with root package name */
    private final f0 f15705d;

    /* renamed from: e  reason: collision with root package name */
    private final String f15706e;

    /* renamed from: f  reason: collision with root package name */
    private final g0 f15707f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f15708a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i9.g[] f15709b;

        a(h0 h0Var, i9.g[] gVarArr) {
            this.f15708a = h0Var;
            this.f15709b = gVarArr;
        }

        @Override // i9.g.a
        public void a(j1 j1Var, i9.y0 y0Var) {
            try {
                this.f15708a.a(j1Var);
            } catch (Throwable th) {
                w.this.f15702a.u(th);
            }
        }

        @Override // i9.g.a
        public void b(i9.y0 y0Var) {
            try {
                this.f15708a.c(y0Var);
            } catch (Throwable th) {
                w.this.f15702a.u(th);
            }
        }

        @Override // i9.g.a
        public void c(Object obj) {
            try {
                this.f15708a.d(obj);
                this.f15709b[0].c(1);
            } catch (Throwable th) {
                w.this.f15702a.u(th);
            }
        }

        @Override // i9.g.a
        public void d() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
    /* loaded from: classes.dex */
    class b<ReqT, RespT> extends i9.z<ReqT, RespT> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i9.g[] f15711a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Task f15712b;

        b(i9.g[] gVarArr, Task task) {
            this.f15711a = gVarArr;
            this.f15712b = task;
        }

        @Override // i9.z, i9.d1, i9.g
        public void b() {
            if (this.f15711a[0] == null) {
                this.f15712b.addOnSuccessListener(w.this.f15702a.o(), new OnSuccessListener() { // from class: p6.x
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        ((i9.g) obj).b();
                    }
                });
            } else {
                super.b();
            }
        }

        @Override // i9.z, i9.d1
        protected i9.g<ReqT, RespT> f() {
            q6.b.d(this.f15711a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f15711a[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f15714a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i9.g f15715b;

        c(e eVar, i9.g gVar) {
            this.f15714a = eVar;
            this.f15715b = gVar;
        }

        @Override // i9.g.a
        public void a(j1 j1Var, i9.y0 y0Var) {
            this.f15714a.a(j1Var);
        }

        @Override // i9.g.a
        public void c(Object obj) {
            this.f15714a.b(obj);
            this.f15715b.c(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f15717a;

        d(TaskCompletionSource taskCompletionSource) {
            this.f15717a = taskCompletionSource;
        }

        @Override // i9.g.a
        public void a(j1 j1Var, i9.y0 y0Var) {
            if (!j1Var.o()) {
                this.f15717a.setException(w.this.f(j1Var));
            } else if (this.f15717a.getTask().isComplete()) {
            } else {
                this.f15717a.setException(new com.google.firebase.firestore.z("Received onClose with status OK, but no message.", z.a.INTERNAL));
            }
        }

        @Override // i9.g.a
        public void c(Object obj) {
            this.f15717a.setResult(obj);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T> {
        public abstract void a(j1 j1Var);

        public abstract void b(T t10);
    }

    static {
        y0.d<String> dVar = i9.y0.f10075e;
        f15698g = y0.g.e("x-goog-api-client", dVar);
        f15699h = y0.g.e("google-cloud-resource-prefix", dVar);
        f15700i = y0.g.e("x-goog-request-params", dVar);
        f15701j = "gl-java/";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(q6.g gVar, Context context, h6.a<h6.j> aVar, h6.a<String> aVar2, j6.m mVar, g0 g0Var) {
        this.f15702a = gVar;
        this.f15707f = g0Var;
        this.f15703b = aVar;
        this.f15704c = aVar2;
        this.f15705d = new f0(gVar, context, mVar, new s(aVar, aVar2));
        m6.f a10 = mVar.a();
        this.f15706e = String.format("projects/%s/databases/%s", a10.k(), a10.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.firestore.z f(j1 j1Var) {
        return o.i(j1Var) ? new com.google.firebase.firestore.z("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", z.a.g(j1Var.m().h()), j1Var.l()) : q6.g0.t(j1Var);
    }

    private String g() {
        return String.format("%s fire/%s grpc/", f15701j, "24.6.0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(i9.g[] gVarArr, h0 h0Var, Task task) {
        gVarArr[0] = (i9.g) task.getResult();
        gVarArr[0].e(new a(h0Var, gVarArr), l());
        h0Var.b();
        gVarArr[0].c(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(TaskCompletionSource taskCompletionSource, Object obj, Task task) {
        i9.g gVar = (i9.g) task.getResult();
        gVar.e(new d(taskCompletionSource), l());
        gVar.c(2);
        gVar.d(obj);
        gVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(e eVar, Object obj, Task task) {
        i9.g gVar = (i9.g) task.getResult();
        gVar.e(new c(eVar, gVar), l());
        gVar.c(1);
        gVar.d(obj);
        gVar.b();
    }

    private i9.y0 l() {
        i9.y0 y0Var = new i9.y0();
        y0Var.p(f15698g, g());
        y0Var.p(f15699h, this.f15706e);
        y0Var.p(f15700i, this.f15706e);
        g0 g0Var = this.f15707f;
        if (g0Var != null) {
            g0Var.a(y0Var);
        }
        return y0Var;
    }

    public static void p(String str) {
        f15701j = str;
    }

    public void h() {
        this.f15703b.b();
        this.f15704c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <ReqT, RespT> i9.g<ReqT, RespT> m(i9.z0<ReqT, RespT> z0Var, final h0<RespT> h0Var) {
        final i9.g[] gVarArr = {null};
        Task<i9.g<ReqT, RespT>> i10 = this.f15705d.i(z0Var);
        i10.addOnCompleteListener(this.f15702a.o(), new OnCompleteListener() { // from class: p6.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                w.this.i(gVarArr, h0Var, task);
            }
        });
        return new b(gVarArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <ReqT, RespT> Task<RespT> n(i9.z0<ReqT, RespT> z0Var, final ReqT reqt) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15705d.i(z0Var).addOnCompleteListener(this.f15702a.o(), new OnCompleteListener() { // from class: p6.t
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                w.this.j(taskCompletionSource, reqt, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <ReqT, RespT> void o(i9.z0<ReqT, RespT> z0Var, final ReqT reqt, final e<RespT> eVar) {
        this.f15705d.i(z0Var).addOnCompleteListener(this.f15702a.o(), new OnCompleteListener() { // from class: p6.u
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                w.this.k(eVar, reqt, task);
            }
        });
    }

    public void q() {
        this.f15705d.u();
    }
}
