package io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public interface t extends Closeable {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f11652a = "unknown-authority";

        /* renamed from: b  reason: collision with root package name */
        private i9.a f11653b = i9.a.f9798c;

        /* renamed from: c  reason: collision with root package name */
        private String f11654c;

        /* renamed from: d  reason: collision with root package name */
        private i9.c0 f11655d;

        public String a() {
            return this.f11652a;
        }

        public i9.a b() {
            return this.f11653b;
        }

        public i9.c0 c() {
            return this.f11655d;
        }

        public String d() {
            return this.f11654c;
        }

        public a e(String str) {
            this.f11652a = (String) b5.n.o(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f11652a.equals(aVar.f11652a) && this.f11653b.equals(aVar.f11653b) && b5.j.a(this.f11654c, aVar.f11654c) && b5.j.a(this.f11655d, aVar.f11655d);
            }
            return false;
        }

        public a f(i9.a aVar) {
            b5.n.o(aVar, "eagAttributes");
            this.f11653b = aVar;
            return this;
        }

        public a g(i9.c0 c0Var) {
            this.f11655d = c0Var;
            return this;
        }

        public a h(String str) {
            this.f11654c = str;
            return this;
        }

        public int hashCode() {
            return b5.j.b(this.f11652a, this.f11653b, this.f11654c, this.f11655d);
        }
    }

    ScheduledExecutorService S();

    v W(SocketAddress socketAddress, a aVar, i9.f fVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
