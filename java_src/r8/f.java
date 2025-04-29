package r8;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* loaded from: classes.dex */
public final class f implements i<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f16775a = new f();

    private f() {
    }

    @Override // r8.i
    public ByteBuffer a(Object obj) {
        t tVar;
        String obj2;
        if (obj == null) {
            return null;
        }
        Object a10 = h.a(obj);
        if (a10 instanceof String) {
            tVar = t.f16795b;
            obj2 = JSONObject.quote((String) a10);
        } else {
            tVar = t.f16795b;
            obj2 = a10.toString();
        }
        return tVar.a(obj2);
    }

    @Override // r8.i
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(t.f16795b.b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }
}
