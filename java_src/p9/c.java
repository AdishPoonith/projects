package p9;

import b5.s;
import i9.c;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f15834a = Logger.getLogger(c.class.getName());

    /* renamed from: b  reason: collision with root package name */
    static boolean f15835b;

    /* renamed from: c  reason: collision with root package name */
    static final c.C0162c<a> f15836c;

    /* loaded from: classes.dex */
    enum a {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    static {
        f15835b = !s.b(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f15836c = c.C0162c.b("internal-stub-type");
    }

    private c() {
    }
}
