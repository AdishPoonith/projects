package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final u0 f6735a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f6736b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(u0 u0Var, List<a> list) {
        this.f6735a = u0Var;
        this.f6736b = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(new d(this, (Map) task.getResult()));
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public Task<d> b(e eVar) {
        q6.x.c(eVar, "AggregateSource must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6735a.f6832b.s().g0(this.f6735a.f6831a, this.f6736b).continueWith(q6.p.f16300b, new Continuation() { // from class: com.google.firebase.firestore.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Object d10;
                d10 = c.this.d(taskCompletionSource, task);
                return d10;
            }
        });
        return taskCompletionSource.getTask();
    }

    public u0 c() {
        return this.f6735a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f6735a.equals(cVar.f6735a) && this.f6736b.equals(cVar.f6736b);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f6735a, this.f6736b);
    }
}
