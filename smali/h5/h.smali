.class public Lh5/h;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d<",
        "Lt5/r;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 4

    const-class v0, Lt5/r;

    const/4 v1, 0x1

    new-array v1, v1, [Lo5/k;

    new-instance v2, Lh5/h$a;

    const-class v3, Lg5/a;

    invoke-direct {v2, v3}, Lh5/h$a;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo5/d;-><init>(Ljava/lang/Class;[Lo5/k;)V

    return-void
.end method

.method public static m(Z)V
    .locals 1

    new-instance v0, Lh5/h;

    invoke-direct {v0}, Lh5/h;-><init>()V

    invoke-static {v0, p0}, Lg5/w;->k(Lo5/d;Z)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    return-object v0
.end method

.method public f()Lo5/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/d$a<",
            "Lt5/s;",
            "Lt5/r;",
            ">;"
        }
    .end annotation

    new-instance v0, Lh5/h$b;

    const-class v1, Lt5/s;

    invoke-direct {v0, p0, v1}, Lh5/h$b;-><init>(Lh5/h;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lt5/y$c;
    .locals 1

    sget-object v0, Lt5/y$c;->l:Lt5/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/h;->l(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/r;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/r;

    invoke-virtual {p0, p1}, Lh5/h;->n(Lt5/r;)V

    return-void
.end method

.method public k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/r;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/r;->T(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/r;

    move-result-object p1

    return-object p1
.end method

.method public n(Lt5/r;)V
    .locals 2

    invoke-virtual {p1}, Lt5/r;->R()I

    move-result v0

    invoke-virtual {p0}, Lh5/h;->k()I

    move-result v1

    invoke-static {v0, v1}, Lu5/r;->c(II)V

    invoke-virtual {p1}, Lt5/r;->Q()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result p1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid ChaCha20Poly1305Key: incorrect key length"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
