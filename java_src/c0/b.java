package c0;

import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class b implements x.b {

    /* renamed from: b  reason: collision with root package name */
    private final f<?>[] f3129b;

    public b(f<?>... initializers) {
        l.e(initializers, "initializers");
        this.f3129b = initializers;
    }

    @Override // androidx.lifecycle.x.b
    public /* synthetic */ w a(Class cls) {
        return y.a(this, cls);
    }

    @Override // androidx.lifecycle.x.b
    public <T extends w> T b(Class<T> modelClass, a extras) {
        f<?>[] fVarArr;
        l.e(modelClass, "modelClass");
        l.e(extras, "extras");
        T t10 = null;
        for (f<?> fVar : this.f3129b) {
            if (l.a(fVar.a(), modelClass)) {
                Object invoke = fVar.b().invoke(extras);
                t10 = invoke instanceof w ? (T) invoke : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
