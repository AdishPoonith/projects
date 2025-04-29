package i9;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f9872f = Logger.getLogger(d0.class.getName());

    /* renamed from: g  reason: collision with root package name */
    private static final d0 f9873g = new d0();

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, i0<Object>> f9874a = new ConcurrentSkipListMap();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, i0<Object>> f9875b = new ConcurrentSkipListMap();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentMap<Long, i0<Object>> f9876c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentMap<Long, i0<Object>> f9877d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentMap<Long, Object> f9878e = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final c f9879a;

        public b(c cVar) {
            this.f9879a = (c) b5.n.n(cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f9880a;

        /* renamed from: b  reason: collision with root package name */
        public final Certificate f9881b;

        /* renamed from: c  reason: collision with root package name */
        public final Certificate f9882c;

        public c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e10) {
                d0.f9872f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e10);
            }
            this.f9880a = cipherSuite;
            this.f9881b = certificate2;
            this.f9882c = certificate;
        }
    }

    private static <T extends i0<?>> void b(Map<Long, T> map, T t10) {
        map.put(Long.valueOf(t10.f().d()), t10);
    }

    public static long f(p0 p0Var) {
        return p0Var.f().d();
    }

    public static d0 g() {
        return f9873g;
    }

    private static <T extends i0<?>> void h(Map<Long, T> map, T t10) {
        map.remove(Long.valueOf(f(t10)));
    }

    public void c(i0<Object> i0Var) {
        b(this.f9877d, i0Var);
    }

    public void d(i0<Object> i0Var) {
        b(this.f9875b, i0Var);
    }

    public void e(i0<Object> i0Var) {
        b(this.f9876c, i0Var);
    }

    public void i(i0<Object> i0Var) {
        h(this.f9877d, i0Var);
    }

    public void j(i0<Object> i0Var) {
        h(this.f9875b, i0Var);
    }

    public void k(i0<Object> i0Var) {
        h(this.f9876c, i0Var);
    }
}
