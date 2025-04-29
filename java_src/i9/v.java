package i9;

import i9.l;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    static final b5.g f10058c = b5.g.f(',');

    /* renamed from: d  reason: collision with root package name */
    private static final v f10059d = a().f(new l.a(), true).f(l.b.f9973a, false);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f10060a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f10061b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final u f10062a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f10063b;

        a(u uVar, boolean z10) {
            this.f10062a = (u) b5.n.o(uVar, "decompressor");
            this.f10063b = z10;
        }
    }

    private v() {
        this.f10060a = new LinkedHashMap(0);
        this.f10061b = new byte[0];
    }

    private v(u uVar, boolean z10, v vVar) {
        String a10 = uVar.a();
        b5.n.e(!a10.contains(","), "Comma is currently not allowed in message encoding");
        int size = vVar.f10060a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(vVar.f10060a.containsKey(uVar.a()) ? size : size + 1);
        for (a aVar : vVar.f10060a.values()) {
            String a11 = aVar.f10062a.a();
            if (!a11.equals(a10)) {
                linkedHashMap.put(a11, new a(aVar.f10062a, aVar.f10063b));
            }
        }
        linkedHashMap.put(a10, new a(uVar, z10));
        this.f10060a = Collections.unmodifiableMap(linkedHashMap);
        this.f10061b = f10058c.d(b()).getBytes(Charset.forName("US-ASCII"));
    }

    public static v a() {
        return new v();
    }

    public static v c() {
        return f10059d;
    }

    public Set<String> b() {
        HashSet hashSet = new HashSet(this.f10060a.size());
        for (Map.Entry<String, a> entry : this.f10060a.entrySet()) {
            if (entry.getValue().f10063b) {
                hashSet.add(entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] d() {
        return this.f10061b;
    }

    public u e(String str) {
        a aVar = this.f10060a.get(str);
        if (aVar != null) {
            return aVar.f10062a;
        }
        return null;
    }

    public v f(u uVar, boolean z10) {
        return new v(uVar, z10, this);
    }
}
