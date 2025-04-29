package i9;

import i9.a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d  reason: collision with root package name */
    public static final a.c<String> f10064d = a.c.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a  reason: collision with root package name */
    private final List<SocketAddress> f10065a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10066b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10067c;

    public x(SocketAddress socketAddress) {
        this(socketAddress, a.f9798c);
    }

    public x(SocketAddress socketAddress, a aVar) {
        this(Collections.singletonList(socketAddress), aVar);
    }

    public x(List<SocketAddress> list) {
        this(list, a.f9798c);
    }

    public x(List<SocketAddress> list, a aVar) {
        b5.n.e(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f10065a = unmodifiableList;
        this.f10066b = (a) b5.n.o(aVar, "attrs");
        this.f10067c = unmodifiableList.hashCode();
    }

    public List<SocketAddress> a() {
        return this.f10065a;
    }

    public a b() {
        return this.f10066b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f10065a.size() != xVar.f10065a.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f10065a.size(); i10++) {
                if (!this.f10065a.get(i10).equals(xVar.f10065a.get(i10))) {
                    return false;
                }
            }
            return this.f10066b.equals(xVar.f10066b);
        }
        return false;
    }

    public int hashCode() {
        return this.f10067c;
    }

    public String toString() {
        return "[" + this.f10065a + "/" + this.f10066b + "]";
    }
}
