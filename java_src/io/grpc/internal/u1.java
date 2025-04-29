package io.grpc.internal;

import i9.c0;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
class u1 implements i9.g1 {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f11677d = Logger.getLogger(u1.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final c f11678e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final b5.t<ProxySelector> f11679f = new b();

    /* renamed from: a  reason: collision with root package name */
    private final b5.t<ProxySelector> f11680a;

    /* renamed from: b  reason: collision with root package name */
    private final c f11681b;

    /* renamed from: c  reason: collision with root package name */
    private final InetSocketAddress f11682c;

    /* loaded from: classes.dex */
    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.u1.c
        public PasswordAuthentication a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i10, "");
            } catch (MalformedURLException unused) {
                u1.f11677d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i10, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* loaded from: classes.dex */
    class b implements b5.t<ProxySelector> {
        b() {
        }

        @Override // b5.t
        /* renamed from: a */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4);
    }

    public u1() {
        this(f11679f, f11678e, System.getenv("GRPC_PROXY_EXP"));
    }

    u1(b5.t<ProxySelector> tVar, c cVar, String str) {
        this.f11680a = (b5.t) b5.n.n(tVar);
        this.f11681b = (c) b5.n.n(cVar);
        this.f11682c = str != null ? d(str) : null;
    }

    private i9.f1 c(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, r0.h(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = this.f11680a.get();
                if (proxySelector == null) {
                    f11677d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f11677d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication a10 = this.f11681b.a(r0.h(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                c0.b c10 = i9.c0.e().d(inetSocketAddress).c(inetSocketAddress2);
                if (a10 == null) {
                    return c10.a();
                }
                return c10.e(a10.getUserName()).b(a10.getPassword() != null ? new String(a10.getPassword()) : null).a();
            } catch (URISyntaxException e10) {
                f11677d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e10);
                return null;
            }
        } catch (Throwable th) {
            f11677d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    private static InetSocketAddress d(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        f11677d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], parseInt);
    }

    @Override // i9.g1
    public i9.f1 a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f11682c != null ? i9.c0.e().c(this.f11682c).d((InetSocketAddress) socketAddress).a() : c((InetSocketAddress) socketAddress);
        }
        return null;
    }
}
