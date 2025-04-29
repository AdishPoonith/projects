package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class c implements ia.b, Serializable {
    public static final Object NO_RECEIVER = a.f12843j;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient ia.b reflected;
    private final String signature;

    /* loaded from: classes.dex */
    private static class a implements Serializable {

        /* renamed from: j  reason: collision with root package name */
        private static final a f12843j = new a();

        private a() {
        }

        private Object readResolve() {
            return f12843j;
        }
    }

    public c() {
        this(NO_RECEIVER);
    }

    protected c(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // ia.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // ia.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public ia.b compute() {
        ia.b bVar = this.reflected;
        if (bVar == null) {
            ia.b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return bVar;
    }

    protected abstract ia.b computeReflected();

    @Override // ia.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public ia.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? t.c(cls) : t.b(cls);
    }

    @Override // ia.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ia.b getReflected() {
        ia.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new ca.b();
    }

    @Override // ia.b
    public ia.h getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // ia.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // ia.b
    public ia.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // ia.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // ia.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // ia.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // ia.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
