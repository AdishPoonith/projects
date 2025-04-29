package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.loader.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0044a<D> {
        void a(d0.b<D> bVar, D d10);

        void b(d0.b<D> bVar);

        d0.b<D> c(int i10, Bundle bundle);
    }

    public static <T extends i & b0> a b(T t10) {
        return new b(t10, t10.p());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> d0.b<D> c(int i10, Bundle bundle, InterfaceC0044a<D> interfaceC0044a);

    public abstract void d();
}
