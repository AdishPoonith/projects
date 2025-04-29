package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import s9.n;
import s9.o;
import s9.u;
/* loaded from: classes.dex */
public abstract class a implements v9.d<Object>, e, Serializable {
    private final v9.d<Object> completion;

    public a(v9.d<Object> dVar) {
        this.completion = dVar;
    }

    public v9.d<u> create(Object obj, v9.d<?> completion) {
        kotlin.jvm.internal.l.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public v9.d<u> create(v9.d<?> completion) {
        kotlin.jvm.internal.l.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        v9.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final v9.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v9.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object c10;
        v9.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            v9.d dVar2 = aVar.completion;
            kotlin.jvm.internal.l.b(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
                c10 = w9.d.c();
            } catch (Throwable th) {
                n.a aVar2 = n.f17870k;
                obj = n.b(o.a(th));
            }
            if (invokeSuspend == c10) {
                return;
            }
            n.a aVar3 = n.f17870k;
            obj = n.b(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
