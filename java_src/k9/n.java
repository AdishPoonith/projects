package k9;

import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    static final List<l9.i> f12786a = Collections.unmodifiableList(Arrays.asList(l9.i.HTTP_2));

    static String a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i10, l9.b bVar) {
        b5.n.o(sSLSocketFactory, "sslSocketFactory");
        b5.n.o(socket, "socket");
        b5.n.o(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        bVar.c(sSLSocket, false);
        String h10 = k.e().h(sSLSocket, str, bVar.f() ? f12786a : null);
        List<l9.i> list = f12786a;
        boolean contains = list.contains(l9.i.b(h10));
        b5.n.w(contains, "Only " + list + " are supported, but negotiated protocol is %s", h10);
        if (hostnameVerifier == null) {
            hostnameVerifier = l9.f.f13525a;
        }
        if (hostnameVerifier.verify(a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
