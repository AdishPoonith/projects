package i6;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONObject;
import q6.v;
/* loaded from: classes.dex */
public class f {

    /* renamed from: g  reason: collision with root package name */
    private static final Charset f9736g = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final g f9737a;

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f9738b;

    /* renamed from: c  reason: collision with root package name */
    private final InputStreamReader f9739c;

    /* renamed from: d  reason: collision with root package name */
    e f9740d;

    /* renamed from: e  reason: collision with root package name */
    private ByteBuffer f9741e;

    /* renamed from: f  reason: collision with root package name */
    long f9742f;

    public f(g gVar, InputStream inputStream) {
        this.f9737a = gVar;
        this.f9738b = inputStream;
        this.f9739c = new InputStreamReader(inputStream);
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        this.f9741e = allocate;
        allocate.flip();
    }

    private IllegalArgumentException a(String str) {
        b();
        throw new IllegalArgumentException("Invalid bundle: " + str);
    }

    private c c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("metadata")) {
            e b10 = this.f9737a.b(jSONObject.getJSONObject("metadata"));
            v.a("BundleElement", "BundleMetadata element loaded", new Object[0]);
            return b10;
        } else if (jSONObject.has("namedQuery")) {
            j q10 = this.f9737a.q(jSONObject.getJSONObject("namedQuery"));
            v.a("BundleElement", "Query loaded: " + q10.b(), new Object[0]);
            return q10;
        } else if (jSONObject.has("documentMetadata")) {
            h c10 = this.f9737a.c(jSONObject.getJSONObject("documentMetadata"));
            v.a("BundleElement", "Document metadata loaded: " + c10.b(), new Object[0]);
            return c10;
        } else if (!jSONObject.has("document")) {
            throw a("Cannot decode unknown Bundle element: " + str);
        } else {
            b f10 = this.f9737a.f(jSONObject.getJSONObject("document"));
            v.a("BundleElement", "Document loaded: " + f10.b(), new Object[0]);
            return f10;
        }
    }

    private int g() {
        this.f9741e.mark();
        int i10 = 0;
        while (true) {
            try {
                if (i10 >= this.f9741e.remaining()) {
                    i10 = -1;
                    break;
                } else if (this.f9741e.get() == 123) {
                    break;
                } else {
                    i10++;
                }
            } finally {
                this.f9741e.reset();
            }
        }
        return i10;
    }

    private boolean h() {
        this.f9741e.compact();
        int read = this.f9738b.read(this.f9741e.array(), this.f9741e.arrayOffset() + this.f9741e.position(), this.f9741e.remaining());
        boolean z10 = read > 0;
        if (z10) {
            ByteBuffer byteBuffer = this.f9741e;
            byteBuffer.position(byteBuffer.position() + read);
        }
        this.f9741e.flip();
        return z10;
    }

    private String i(int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i10 > 0) {
            if (this.f9741e.remaining() == 0 && !h()) {
                throw a("Reached the end of bundle when more data was expected.");
            }
            int min = Math.min(i10, this.f9741e.remaining());
            byteArrayOutputStream.write(this.f9741e.array(), this.f9741e.arrayOffset() + this.f9741e.position(), min);
            ByteBuffer byteBuffer = this.f9741e;
            byteBuffer.position(byteBuffer.position() + min);
            i10 -= min;
        }
        return byteArrayOutputStream.toString(f9736g.name());
    }

    private String j() {
        int g10;
        do {
            g10 = g();
            if (g10 != -1) {
                break;
            }
        } while (h());
        if (this.f9741e.remaining() == 0) {
            return null;
        }
        if (g10 != -1) {
            byte[] bArr = new byte[g10];
            this.f9741e.get(bArr);
            return f9736g.decode(ByteBuffer.wrap(bArr)).toString();
        }
        throw a("Reached the end of bundle when a length string is expected.");
    }

    private c k() {
        int parseInt;
        String j10 = j();
        if (j10 == null) {
            return null;
        }
        String i10 = i(Integer.parseInt(j10));
        this.f9742f += j10.getBytes(f9736g).length + parseInt;
        return c(i10);
    }

    public void b() {
        this.f9738b.close();
    }

    public e d() {
        e eVar = this.f9740d;
        if (eVar != null) {
            return eVar;
        }
        c k10 = k();
        if (k10 instanceof e) {
            e eVar2 = (e) k10;
            this.f9740d = eVar2;
            this.f9742f = 0L;
            return eVar2;
        }
        throw a("Expected first element in bundle to be a metadata object");
    }

    public long e() {
        return this.f9742f;
    }

    public c f() {
        d();
        return k();
    }
}
