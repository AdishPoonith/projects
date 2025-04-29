package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s0;
/* loaded from: classes.dex */
public abstract class b<MessageType extends s0> implements a1<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final q f6124a = q.b();

    private MessageType c(MessageType messagetype) {
        if (messagetype == null || messagetype.j()) {
            return messagetype;
        }
        throw d(messagetype).a().j(messagetype);
    }

    private n1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).p() : new n1(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a1
    /* renamed from: e */
    public MessageType a(i iVar, q qVar) {
        return c(f(iVar, qVar));
    }

    public MessageType f(i iVar, q qVar) {
        try {
            j w10 = iVar.w();
            MessageType messagetype = (MessageType) b(w10, qVar);
            try {
                w10.a(0);
                return messagetype;
            } catch (c0 e10) {
                throw e10.j(messagetype);
            }
        } catch (c0 e11) {
            throw e11;
        }
    }
}
