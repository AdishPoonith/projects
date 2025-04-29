package com.google.firebase.storage;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.s;
import com.google.firebase.storage.s.a;
import com.google.firebase.storage.y;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class s<ResultT extends a> extends w6.b<ResultT> {

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<Integer, HashSet<Integer>> f6988j;

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap<Integer, HashSet<Integer>> f6989k;

    /* renamed from: a  reason: collision with root package name */
    protected final Object f6990a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final y<OnSuccessListener<? super ResultT>, ResultT> f6991b = new y<>(this, 128, new y.a() { // from class: com.google.firebase.storage.p
        @Override // com.google.firebase.storage.y.a
        public final void a(Object obj, Object obj2) {
            s.this.P((OnSuccessListener) obj, (s.a) obj2);
        }
    });

    /* renamed from: c  reason: collision with root package name */
    final y<OnFailureListener, ResultT> f6992c = new y<>(this, 64, new y.a() { // from class: com.google.firebase.storage.o
        @Override // com.google.firebase.storage.y.a
        public final void a(Object obj, Object obj2) {
            s.this.Q((OnFailureListener) obj, (s.a) obj2);
        }
    });

    /* renamed from: d  reason: collision with root package name */
    final y<OnCompleteListener<ResultT>, ResultT> f6993d = new y<>(this, 448, new y.a() { // from class: com.google.firebase.storage.n
        @Override // com.google.firebase.storage.y.a
        public final void a(Object obj, Object obj2) {
            s.this.R((OnCompleteListener) obj, (s.a) obj2);
        }
    });

    /* renamed from: e  reason: collision with root package name */
    final y<OnCanceledListener, ResultT> f6994e = new y<>(this, 256, new y.a() { // from class: com.google.firebase.storage.m
        @Override // com.google.firebase.storage.y.a
        public final void a(Object obj, Object obj2) {
            s.this.S((OnCanceledListener) obj, (s.a) obj2);
        }
    });

    /* renamed from: f  reason: collision with root package name */
    final y<w6.d<? super ResultT>, ResultT> f6995f = new y<>(this, -465, new y.a() { // from class: com.google.firebase.storage.r
        @Override // com.google.firebase.storage.y.a
        public final void a(Object obj, Object obj2) {
            ((w6.d) obj).a((s.a) obj2);
        }
    });

    /* renamed from: g  reason: collision with root package name */
    final y<w6.c<? super ResultT>, ResultT> f6996g = new y<>(this, 16, new y.a() { // from class: com.google.firebase.storage.q
        @Override // com.google.firebase.storage.y.a
        public final void a(Object obj, Object obj2) {
            ((w6.c) obj).a((s.a) obj2);
        }
    });

    /* renamed from: h  reason: collision with root package name */
    private volatile int f6997h = 1;

    /* renamed from: i  reason: collision with root package name */
    private ResultT f6998i;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface a {
        Exception a();
    }

    /* loaded from: classes.dex */
    public class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final Exception f6999a;

        public b(Exception exc) {
            j jVar;
            Status status;
            if (exc != null) {
                this.f6999a = exc;
                return;
            }
            if (s.this.isCanceled()) {
                status = Status.f3738t;
            } else if (s.this.B() != 64) {
                jVar = null;
                this.f6999a = jVar;
            } else {
                status = Status.f3736r;
            }
            jVar = j.c(status);
            this.f6999a = jVar;
        }

        @Override // com.google.firebase.storage.s.a
        public Exception a() {
            return this.f6999a;
        }

        public l b() {
            return c().I();
        }

        public s<ResultT> c() {
            return s.this;
        }
    }

    static {
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        f6988j = hashMap;
        HashMap<Integer, HashSet<Integer>> hashMap2 = new HashMap<>();
        f6989k = hashMap2;
        hashMap.put(1, new HashSet<>(Arrays.asList(16, 256)));
        hashMap.put(2, new HashSet<>(Arrays.asList(8, 32)));
        hashMap.put(4, new HashSet<>(Arrays.asList(8, 32)));
        hashMap.put(16, new HashSet<>(Arrays.asList(2, 256)));
        hashMap.put(64, new HashSet<>(Arrays.asList(2, 256)));
        hashMap2.put(1, new HashSet<>(Arrays.asList(2, 64)));
        hashMap2.put(2, new HashSet<>(Arrays.asList(4, 64, 128)));
        hashMap2.put(4, new HashSet<>(Arrays.asList(4, 64, 128)));
        hashMap2.put(8, new HashSet<>(Arrays.asList(16, 64, 128)));
        hashMap2.put(32, new HashSet<>(Arrays.asList(256, 64, 128)));
    }

    private ResultT A() {
        ResultT resultt = this.f6998i;
        if (resultt != null) {
            return resultt;
        }
        if (isComplete()) {
            if (this.f6998i == null) {
                this.f6998i = g0();
            }
            return this.f6998i;
        }
        return null;
    }

    private String G(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? i10 != 16 ? i10 != 32 ? i10 != 64 ? i10 != 128 ? i10 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    private String H(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 : iArr) {
            sb.append(G(i10));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Continuation continuation, TaskCompletionSource taskCompletionSource, Task task) {
        try {
            Object then = continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            taskCompletionSource.setResult(then);
        } catch (RuntimeExecutionException e10) {
            boolean z10 = e10.getCause() instanceof Exception;
            RuntimeExecutionException runtimeExecutionException = e10;
            if (z10) {
                runtimeExecutionException = (Exception) e10.getCause();
            }
            taskCompletionSource.setException(runtimeExecutionException);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, Task task) {
        try {
            Task task2 = (Task) continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new w6.k(taskCompletionSource));
            task2.addOnFailureListener(new w6.i(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            task2.addOnCanceledListener(new w6.f(cancellationTokenSource));
        } catch (RuntimeExecutionException e10) {
            boolean z10 = e10.getCause() instanceof Exception;
            RuntimeExecutionException runtimeExecutionException = e10;
            if (z10) {
                runtimeExecutionException = (Exception) e10.getCause();
            }
            taskCompletionSource.setException(runtimeExecutionException);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        try {
            e0();
        } finally {
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(OnSuccessListener onSuccessListener, a aVar) {
        t.b().c(this);
        onSuccessListener.onSuccess(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(OnFailureListener onFailureListener, a aVar) {
        t.b().c(this);
        onFailureListener.onFailure(aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(OnCompleteListener onCompleteListener, a aVar) {
        t.b().c(this);
        onCompleteListener.onComplete(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(OnCanceledListener onCanceledListener, a aVar) {
        t.b().c(this);
        onCanceledListener.onCanceled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, a aVar) {
        try {
            Task then = successContinuation.then(aVar);
            Objects.requireNonNull(taskCompletionSource);
            then.addOnSuccessListener(new w6.k(taskCompletionSource));
            then.addOnFailureListener(new w6.i(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            then.addOnCanceledListener(new w6.f(cancellationTokenSource));
        } catch (RuntimeExecutionException e10) {
            boolean z10 = e10.getCause() instanceof Exception;
            RuntimeExecutionException runtimeExecutionException = e10;
            if (z10) {
                runtimeExecutionException = (Exception) e10.getCause();
            }
            taskCompletionSource.setException(runtimeExecutionException);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    private <ContinuationResultT> Task<ContinuationResultT> i0(Executor executor, final SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f6991b.d(null, executor, new OnSuccessListener() { // from class: w6.j
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                s.T(SuccessContinuation.this, taskCompletionSource, cancellationTokenSource, (s.a) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    private <ContinuationResultT> Task<ContinuationResultT> x(Executor executor, final Continuation<ResultT, ContinuationResultT> continuation) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6993d.d(null, executor, new OnCompleteListener() { // from class: w6.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                s.this.M(continuation, taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private <ContinuationResultT> Task<ContinuationResultT> y(Executor executor, final Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f6993d.d(null, executor, new OnCompleteListener() { // from class: w6.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                s.this.N(continuation, taskCompletionSource, cancellationTokenSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private void z() {
        if (isComplete() || L() || B() == 2 || j0(256, false)) {
            return;
        }
        j0(64, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int B() {
        return this.f6997h;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: C */
    public ResultT getResult() {
        if (A() != null) {
            Exception a10 = A().a();
            if (a10 == null) {
                return A();
            }
            throw new RuntimeExecutionException(a10);
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: D */
    public <X extends Throwable> ResultT getResult(Class<X> cls) {
        if (A() != null) {
            if (cls.isInstance(A().a())) {
                throw cls.cast(A().a());
            }
            Exception a10 = A().a();
            if (a10 == null) {
                return A();
            }
            throw new RuntimeExecutionException(a10);
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Runnable E() {
        return new Runnable() { // from class: w6.l
            @Override // java.lang.Runnable
            public final void run() {
                s.this.O();
            }
        };
    }

    public ResultT F() {
        return g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract l I();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object J() {
        return this.f6990a;
    }

    public boolean K() {
        return (B() & (-465)) != 0;
    }

    public boolean L() {
        return (B() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U() {
    }

    protected void V() {
    }

    protected void W() {
    }

    protected void X() {
    }

    protected void Y() {
    }

    protected void Z() {
    }

    public boolean a0() {
        return k0(new int[]{16, 8}, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b0() {
        if (j0(2, false)) {
            f0();
            return true;
        }
        return false;
    }

    void c0() {
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(Continuation<ResultT, ContinuationResultT> continuation) {
        return x(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(Executor executor, Continuation<ResultT, ContinuationResultT> continuation) {
        return x(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return y(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Executor executor, Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return y(executor, continuation);
    }

    public boolean d0() {
        if (j0(2, true)) {
            c0();
            f0();
            return true;
        }
        return false;
    }

    abstract void e0();

    abstract void f0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResultT g0() {
        ResultT h02;
        synchronized (this.f6990a) {
            h02 = h0();
        }
        return h02;
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        if (A() == null) {
            return null;
        }
        return A().a();
    }

    abstract ResultT h0();

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: i */
    public s<ResultT> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        c4.s.j(onCanceledListener);
        c4.s.j(activity);
        this.f6994e.d(activity, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return B() == 256;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return (B() & 448) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return (B() & 128) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: j */
    public s<ResultT> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        c4.s.j(onCanceledListener);
        this.f6994e.d(null, null, onCanceledListener);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j0(int i10, boolean z10) {
        return k0(new int[]{i10}, z10);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: k */
    public s<ResultT> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        c4.s.j(onCanceledListener);
        c4.s.j(executor);
        this.f6994e.d(null, executor, onCanceledListener);
        return this;
    }

    boolean k0(int[] iArr, boolean z10) {
        HashMap<Integer, HashSet<Integer>> hashMap = z10 ? f6988j : f6989k;
        synchronized (this.f6990a) {
            for (int i10 : iArr) {
                HashSet<Integer> hashSet = hashMap.get(Integer.valueOf(B()));
                if (hashSet != null && hashSet.contains(Integer.valueOf(i10))) {
                    this.f6997h = i10;
                    int i11 = this.f6997h;
                    if (i11 == 2) {
                        t.b().a(this);
                        Y();
                    } else if (i11 == 4) {
                        X();
                    } else if (i11 == 16) {
                        W();
                    } else if (i11 == 64) {
                        V();
                    } else if (i11 == 128) {
                        Z();
                    } else if (i11 == 256) {
                        U();
                    }
                    this.f6991b.h();
                    this.f6992c.h();
                    this.f6994e.h();
                    this.f6993d.h();
                    this.f6996g.h();
                    this.f6995f.h();
                    if (Log.isLoggable("StorageTask", 3)) {
                        Log.d("StorageTask", "changed internal state to: " + G(i10) + " isUser: " + z10 + " from state:" + G(this.f6997h));
                    }
                    return true;
                }
            }
            Log.w("StorageTask", "unable to change internal state to: " + H(iArr) + " isUser: " + z10 + " from state:" + G(this.f6997h));
            return false;
        }
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: l */
    public s<ResultT> addOnCompleteListener(Activity activity, OnCompleteListener<ResultT> onCompleteListener) {
        c4.s.j(onCompleteListener);
        c4.s.j(activity);
        this.f6993d.d(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: m */
    public s<ResultT> addOnCompleteListener(OnCompleteListener<ResultT> onCompleteListener) {
        c4.s.j(onCompleteListener);
        this.f6993d.d(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: n */
    public s<ResultT> addOnCompleteListener(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        c4.s.j(onCompleteListener);
        c4.s.j(executor);
        this.f6993d.d(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: o */
    public s<ResultT> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        c4.s.j(onFailureListener);
        c4.s.j(activity);
        this.f6992c.d(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return i0(null, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(Executor executor, SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return i0(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: p */
    public s<ResultT> addOnFailureListener(OnFailureListener onFailureListener) {
        c4.s.j(onFailureListener);
        this.f6992c.d(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: q */
    public s<ResultT> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        c4.s.j(onFailureListener);
        c4.s.j(executor);
        this.f6992c.d(null, executor, onFailureListener);
        return this;
    }

    public s<ResultT> r(Executor executor, w6.c<? super ResultT> cVar) {
        c4.s.j(cVar);
        c4.s.j(executor);
        this.f6996g.d(null, executor, cVar);
        return this;
    }

    public s<ResultT> s(Executor executor, w6.d<? super ResultT> dVar) {
        c4.s.j(dVar);
        c4.s.j(executor);
        this.f6995f.d(null, executor, dVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: t */
    public s<ResultT> addOnSuccessListener(Activity activity, OnSuccessListener<? super ResultT> onSuccessListener) {
        c4.s.j(activity);
        c4.s.j(onSuccessListener);
        this.f6991b.d(activity, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: u */
    public s<ResultT> addOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener) {
        c4.s.j(onSuccessListener);
        this.f6991b.d(null, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: v */
    public s<ResultT> addOnSuccessListener(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        c4.s.j(executor);
        c4.s.j(onSuccessListener);
        this.f6991b.d(null, executor, onSuccessListener);
        return this;
    }

    public boolean w() {
        return k0(new int[]{256, 32}, true);
    }
}
