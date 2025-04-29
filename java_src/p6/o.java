package p6;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.z;
import d7.d;
import d7.f;
import d7.u;
import d7.y;
import i9.j1;
import j6.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import p6.w;
import p6.y0;
import p6.z0;
/* loaded from: classes.dex */
public class o {

    /* renamed from: e  reason: collision with root package name */
    static final Set<String> f15628e = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* renamed from: a  reason: collision with root package name */
    private final j6.m f15629a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f15630b;

    /* renamed from: c  reason: collision with root package name */
    private final q6.g f15631c;

    /* renamed from: d  reason: collision with root package name */
    private final w f15632d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends w.e<d7.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f15633a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f15634b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f15635c;

        a(List list, List list2, TaskCompletionSource taskCompletionSource) {
            this.f15633a = list;
            this.f15634b = list2;
            this.f15635c = taskCompletionSource;
        }

        @Override // p6.w.e
        public void a(j1 j1Var) {
            if (j1Var.o()) {
                this.f15635c.trySetResult(Collections.emptyList());
                return;
            }
            com.google.firebase.firestore.z t10 = q6.g0.t(j1Var);
            if (t10.a() == z.a.UNAUTHENTICATED) {
                o.this.f15632d.h();
            }
            this.f15635c.trySetException(t10);
        }

        @Override // p6.w.e
        /* renamed from: c */
        public void b(d7.e eVar) {
            this.f15633a.add(eVar);
            if (this.f15633a.size() == this.f15634b.size()) {
                HashMap hashMap = new HashMap();
                for (d7.e eVar2 : this.f15633a) {
                    m6.s m10 = o.this.f15630b.m(eVar2);
                    hashMap.put(m10.getKey(), m10);
                }
                ArrayList arrayList = new ArrayList();
                for (m6.l lVar : this.f15634b) {
                    arrayList.add((m6.s) hashMap.get(lVar));
                }
                this.f15635c.trySetResult(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15637a;

        static {
            int[] iArr = new int[z.a.values().length];
            f15637a = iArr;
            try {
                iArr[z.a.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15637a[z.a.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15637a[z.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15637a[z.a.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15637a[z.a.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15637a[z.a.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15637a[z.a.UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15637a[z.a.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15637a[z.a.INVALID_ARGUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15637a[z.a.NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15637a[z.a.ALREADY_EXISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15637a[z.a.PERMISSION_DENIED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15637a[z.a.FAILED_PRECONDITION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15637a[z.a.ABORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15637a[z.a.OUT_OF_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15637a[z.a.UNIMPLEMENTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15637a[z.a.DATA_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public o(j6.m mVar, q6.g gVar, h6.a<h6.j> aVar, h6.a<String> aVar2, Context context, g0 g0Var) {
        this.f15629a = mVar;
        this.f15631c = gVar;
        this.f15630b = new l0(mVar.a());
        this.f15632d = h(mVar, gVar, aVar, aVar2, context, g0Var);
    }

    public static boolean i(j1 j1Var) {
        j1Var.m();
        Throwable l10 = j1Var.l();
        if (l10 instanceof SSLHandshakeException) {
            l10.getMessage().contains("no ciphers available");
            return false;
        }
        return false;
    }

    public static boolean j(z.a aVar) {
        switch (b.f15637a[aVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }

    public static boolean k(j1 j1Var) {
        return j(z.a.g(j1Var.m().h()));
    }

    public static boolean l(j1 j1Var) {
        return k(j1Var) && !j1Var.m().equals(j1.b.ABORTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List m(Task task) {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof com.google.firebase.firestore.z) && ((com.google.firebase.firestore.z) task.getException()).a() == z.a.UNAUTHENTICATED) {
                this.f15632d.h();
            }
            throw task.getException();
        }
        d7.g gVar = (d7.g) task.getResult();
        m6.w y10 = this.f15630b.y(gVar.f0());
        int i02 = gVar.i0();
        ArrayList arrayList = new ArrayList(i02);
        for (int i10 = 0; i10 < i02; i10++) {
            arrayList.add(this.f15630b.p(gVar.h0(i10), y10));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map n(Task task) {
        if (task.isSuccessful()) {
            return ((d7.v) task.getResult()).g0().f0();
        }
        if ((task.getException() instanceof com.google.firebase.firestore.z) && ((com.google.firebase.firestore.z) task.getException()).a() == z.a.UNAUTHENTICATED) {
            this.f15632d.h();
        }
        throw task.getException();
    }

    public Task<List<n6.i>> e(List<n6.f> list) {
        f.b k02 = d7.f.k0();
        k02.I(this.f15630b.a());
        for (n6.f fVar : list) {
            k02.H(this.f15630b.O(fVar));
        }
        return this.f15632d.n(d7.p.b(), k02.b()).continueWith(this.f15631c.o(), new Continuation() { // from class: p6.n
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                List m10;
                m10 = o.this.m(task);
                return m10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0 f(y0.a aVar) {
        return new y0(this.f15632d, this.f15631c, this.f15630b, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0 g(z0.a aVar) {
        return new z0(this.f15632d, this.f15631c, this.f15630b, aVar);
    }

    w h(j6.m mVar, q6.g gVar, h6.a<h6.j> aVar, h6.a<String> aVar2, Context context, g0 g0Var) {
        return new w(gVar, context, aVar, aVar2, mVar, g0Var);
    }

    public Task<List<m6.s>> o(List<m6.l> list) {
        d.b k02 = d7.d.k0();
        k02.I(this.f15630b.a());
        for (m6.l lVar : list) {
            k02.H(this.f15630b.L(lVar));
        }
        ArrayList arrayList = new ArrayList();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15632d.o(d7.p.a(), k02.b(), new a(arrayList, list, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, d7.b0>> p(b1 b1Var, List<com.google.firebase.firestore.a> list) {
        y.d S = this.f15630b.S(b1Var.D());
        d7.w U = this.f15630b.U(S, list);
        u.b i02 = d7.u.i0();
        i02.H(S.i0());
        i02.I(U);
        return this.f15632d.n(d7.p.d(), i02.b()).continueWith(this.f15631c.o(), new Continuation() { // from class: p6.m
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Map n10;
                n10 = o.this.n(task);
                return n10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.f15632d.q();
    }
}
