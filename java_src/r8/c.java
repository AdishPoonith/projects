package r8;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* renamed from: r8.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0246c {
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private boolean f16763a = true;

        public boolean a() {
            return this.f16763a;
        }
    }

    InterfaceC0246c a(d dVar);

    void b(String str, a aVar, InterfaceC0246c interfaceC0246c);

    void c(String str, a aVar);

    InterfaceC0246c d();

    void e(String str, ByteBuffer byteBuffer, b bVar);

    void f(String str, ByteBuffer byteBuffer);
}
