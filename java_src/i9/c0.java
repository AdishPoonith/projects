package i9;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
/* loaded from: classes.dex */
public final class c0 extends f1 {

    /* renamed from: j  reason: collision with root package name */
    private final SocketAddress f9857j;

    /* renamed from: k  reason: collision with root package name */
    private final InetSocketAddress f9858k;

    /* renamed from: l  reason: collision with root package name */
    private final String f9859l;

    /* renamed from: m  reason: collision with root package name */
    private final String f9860m;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private SocketAddress f9861a;

        /* renamed from: b  reason: collision with root package name */
        private InetSocketAddress f9862b;

        /* renamed from: c  reason: collision with root package name */
        private String f9863c;

        /* renamed from: d  reason: collision with root package name */
        private String f9864d;

        private b() {
        }

        public c0 a() {
            return new c0(this.f9861a, this.f9862b, this.f9863c, this.f9864d);
        }

        public b b(String str) {
            this.f9864d = str;
            return this;
        }

        public b c(SocketAddress socketAddress) {
            this.f9861a = (SocketAddress) b5.n.o(socketAddress, "proxyAddress");
            return this;
        }

        public b d(InetSocketAddress inetSocketAddress) {
            this.f9862b = (InetSocketAddress) b5.n.o(inetSocketAddress, "targetAddress");
            return this;
        }

        public b e(String str) {
            this.f9863c = str;
            return this;
        }
    }

    private c0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        b5.n.o(socketAddress, "proxyAddress");
        b5.n.o(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            b5.n.w(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f9857j = socketAddress;
        this.f9858k = inetSocketAddress;
        this.f9859l = str;
        this.f9860m = str2;
    }

    public static b e() {
        return new b();
    }

    public String a() {
        return this.f9860m;
    }

    public SocketAddress b() {
        return this.f9857j;
    }

    public InetSocketAddress c() {
        return this.f9858k;
    }

    public String d() {
        return this.f9859l;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return b5.j.a(this.f9857j, c0Var.f9857j) && b5.j.a(this.f9858k, c0Var.f9858k) && b5.j.a(this.f9859l, c0Var.f9859l) && b5.j.a(this.f9860m, c0Var.f9860m);
        }
        return false;
    }

    public int hashCode() {
        return b5.j.b(this.f9857j, this.f9858k, this.f9859l, this.f9860m);
    }

    public String toString() {
        return b5.h.c(this).d("proxyAddr", this.f9857j).d("targetAddr", this.f9858k).d("username", this.f9859l).e("hasPassword", this.f9860m != null).toString();
    }
}
