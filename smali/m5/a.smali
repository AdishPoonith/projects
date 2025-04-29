.class public final Lm5/a;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d<",
        "Lt5/p;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 4

    const-class v0, Lt5/p;

    const/4 v1, 0x1

    new-array v1, v1, [Lo5/k;

    new-instance v2, Lm5/a$a;

    const-class v3, Lg5/d;

    invoke-direct {v2, v3}, Lm5/a$a;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo5/d;-><init>(Ljava/lang/Class;[Lo5/k;)V

    return-void
.end method

.method public static m(Z)V
    .locals 1

    new-instance v0, Lm5/a;

    invoke-direct {v0}, Lm5/a;-><init>()V

    invoke-static {v0, p0}, Lg5/w;->k(Lo5/d;Z)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesSivKey"

    return-object v0
.end method

.method public f()Lo5/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/d$a<",
            "Lt5/q;",
            "Lt5/p;",
            ">;"
        }
    .end annotation

    new-instance v0, Lm5/a$b;

    const-class v1, Lt5/q;

    invoke-direct {v0, p0, v1}, Lm5/a$b;-><init>(Lm5/a;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lt5/y$c;
    .locals 1

    sget-object v0, Lt5/y$c;->l:Lt5/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lm5/a;->l(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/p;

    invoke-virtual {p0, p1}, Lm5/a;->n(Lt5/p;)V

    return-void
.end method

.method public k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/p;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/p;->T(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/p;

    move-result-object p1

    return-object p1
.end method

.method public n(Lt5/p;)V
    .locals 4

    invoke-virtual {p1}, Lt5/p;->R()I

    move-result v0

    invoke-virtual {p0}, Lm5/a;->k()I

    move-result v1

    invoke-static {v0, v1}, Lu5/r;->c(II)V

    invoke-virtual {p1}, Lt5/p;->Q()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "invalid key size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lt5/p;->Q()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
