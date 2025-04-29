package kotlin.jvm.internal;
/* loaded from: classes.dex */
public class i extends c implements h, ia.e {
    private final int arity;
    private final int flags;

    public i(int i10) {
        this(i10, c.NO_RECEIVER, null, null, null, 0);
    }

    public i(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public i(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.c
    protected ia.b computeReflected() {
        return t.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.flags == iVar.flags && this.arity == iVar.arity && l.a(getBoundReceiver(), iVar.getBoundReceiver()) && l.a(getOwner(), iVar.getOwner());
        } else if (obj instanceof ia.e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.c
    public ia.e getReflected() {
        return (ia.e) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // ia.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // ia.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // ia.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // ia.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.c, ia.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        ia.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
