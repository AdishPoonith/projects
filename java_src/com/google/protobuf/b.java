package com.google.protobuf;

import com.google.protobuf.v0;
/* loaded from: classes.dex */
public abstract class b<MessageType extends v0> implements f1<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final q f7045a = q.b();

    private MessageType d(MessageType messagetype) {
        if (messagetype == null || messagetype.j()) {
            return messagetype;
        }
        throw e(messagetype).a().k(messagetype);
    }

    private u1 e(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).t() : new u1(messagetype);
    }

    @Override // com.google.protobuf.f1
    /* renamed from: f */
    public MessageType a(i iVar, q qVar) {
        return d(h(iVar, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.f1
    /* renamed from: g */
    public MessageType b(j jVar, q qVar) {
        return (MessageType) d((v0) c(jVar, qVar));
    }

    public MessageType h(i iVar, q qVar) {
        try {
            j F = iVar.F();
            MessageType messagetype = (MessageType) c(F, qVar);
            try {
                F.a(0);
                return messagetype;
            } catch (e0 e10) {
                throw e10.k(messagetype);
            }
        } catch (e0 e11) {
            throw e11;
        }
    }
}
