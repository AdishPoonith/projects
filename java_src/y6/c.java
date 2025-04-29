package y6;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends e {
    public c(x6.h hVar, w5.f fVar, long j10) {
        super(hVar, fVar);
        if (j10 != 0) {
            super.H("Range", "bytes=" + j10 + "-");
        }
    }

    @Override // y6.e
    protected String e() {
        return "GET";
    }

    @Override // y6.e
    protected Map<String, String> m() {
        return Collections.singletonMap("alt", "media");
    }
}
