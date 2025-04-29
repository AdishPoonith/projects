package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.firestore.h0;
import com.google.firebase.firestore.i0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class h0 extends Task<i0> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6766a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private i0 f6767b = i0.f6776g;

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource<i0> f6768c;

    /* renamed from: d  reason: collision with root package name */
    private final Task<i0> f6769d;

    /* renamed from: e  reason: collision with root package name */
    private final Queue<a> f6770e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Executor f6771a;

        /* renamed from: b  reason: collision with root package name */
        o0<i0> f6772b;

        a(Executor executor, o0<i0> o0Var) {
            this.f6771a = executor == null ? TaskExecutors.MAIN_THREAD : executor;
            this.f6772b = o0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(i0 i0Var) {
            this.f6772b.a(i0Var);
        }

        public void b(final i0 i0Var) {
            this.f6771a.execute(new Runnable() { // from class: com.google.firebase.firestore.g0
                @Override // java.lang.Runnable
                public final void run() {
                    h0.a.this.c(i0Var);
                }
            });
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f6772b.equals(((a) obj).f6772b);
        }

        public int hashCode() {
            return this.f6772b.hashCode();
        }
    }

    public h0() {
        TaskCompletionSource<i0> taskCompletionSource = new TaskCompletionSource<>();
        this.f6768c = taskCompletionSource;
        this.f6769d = taskCompletionSource.getTask();
        this.f6770e = new ArrayDeque();
    }

    public h0 a(o0<i0> o0Var) {
        a aVar = new a(null, o0Var);
        synchronized (this.f6766a) {
            this.f6770e.add(aVar);
        }
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        return this.f6769d.addOnCanceledListener(activity, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        return this.f6769d.addOnCanceledListener(onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        return this.f6769d.addOnCanceledListener(executor, onCanceledListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnCompleteListener(Activity activity, OnCompleteListener<i0> onCompleteListener) {
        return this.f6769d.addOnCompleteListener(activity, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnCompleteListener(OnCompleteListener<i0> onCompleteListener) {
        return this.f6769d.addOnCompleteListener(onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnCompleteListener(Executor executor, OnCompleteListener<i0> onCompleteListener) {
        return this.f6769d.addOnCompleteListener(executor, onCompleteListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        return this.f6769d.addOnFailureListener(activity, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnFailureListener(OnFailureListener onFailureListener) {
        return this.f6769d.addOnFailureListener(onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        return this.f6769d.addOnFailureListener(executor, onFailureListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnSuccessListener(Activity activity, OnSuccessListener<? super i0> onSuccessListener) {
        return this.f6769d.addOnSuccessListener(activity, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnSuccessListener(OnSuccessListener<? super i0> onSuccessListener) {
        return this.f6769d.addOnSuccessListener(onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task<i0> addOnSuccessListener(Executor executor, OnSuccessListener<? super i0> onSuccessListener) {
        return this.f6769d.addOnSuccessListener(executor, onSuccessListener);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: b */
    public i0 getResult() {
        return this.f6769d.getResult();
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: c */
    public <X extends Throwable> i0 getResult(Class<X> cls) {
        return this.f6769d.getResult(cls);
    }

    @Override // com.google.android.gms.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<i0, TContinuationResult> continuation) {
        return this.f6769d.continueWith(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<i0, TContinuationResult> continuation) {
        return this.f6769d.continueWith(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<i0, Task<TContinuationResult>> continuation) {
        return this.f6769d.continueWithTask(continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<i0, Task<TContinuationResult>> continuation) {
        return this.f6769d.continueWithTask(executor, continuation);
    }

    public void d(Exception exc) {
        synchronized (this.f6766a) {
            i0 i0Var = new i0(this.f6767b.d(), this.f6767b.g(), this.f6767b.c(), this.f6767b.f(), exc, i0.a.ERROR);
            this.f6767b = i0Var;
            for (a aVar : this.f6770e) {
                aVar.b(i0Var);
            }
            this.f6770e.clear();
        }
        this.f6768c.setException(exc);
    }

    public void e(i0 i0Var) {
        boolean equals = i0Var.e().equals(i0.a.SUCCESS);
        q6.b.d(equals, "Expected success, but was " + i0Var.e(), new Object[0]);
        synchronized (this.f6766a) {
            this.f6767b = i0Var;
            for (a aVar : this.f6770e) {
                aVar.b(this.f6767b);
            }
            this.f6770e.clear();
        }
        this.f6768c.setResult(i0Var);
    }

    public void f(i0 i0Var) {
        synchronized (this.f6766a) {
            this.f6767b = i0Var;
            for (a aVar : this.f6770e) {
                aVar.b(i0Var);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        return this.f6769d.getException();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return this.f6769d.isCanceled();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return this.f6769d.isComplete();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return this.f6769d.isSuccessful();
    }

    @Override // com.google.android.gms.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<i0, TContinuationResult> successContinuation) {
        return this.f6769d.onSuccessTask(successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<i0, TContinuationResult> successContinuation) {
        return this.f6769d.onSuccessTask(executor, successContinuation);
    }
}
