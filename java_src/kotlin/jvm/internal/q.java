package kotlin.jvm.internal;
/* loaded from: classes.dex */
public abstract class q extends c implements ia.g {

    /* renamed from: j  reason: collision with root package name */
    private final boolean f12855j;

    public q() {
        this.f12855j = false;
    }

    public q(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f12855j = (i10 & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.c
    /* renamed from: b */
    public ia.g getReflected() {
        if (this.f12855j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (ia.g) super.getReflected();
    }

    @Override // kotlin.jvm.internal.c
    public ia.b compute() {
        return this.f12855j ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return getOwner().equals(qVar.getOwner()) && getName().equals(qVar.getName()) && getSignature().equals(qVar.getSignature()) && l.a(getBoundReceiver(), qVar.getBoundReceiver());
        } else if (obj instanceof ia.g) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        ia.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
